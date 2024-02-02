<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="openGaussPlatform.openGausslink" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="js/echarts.min.js" type="text/javascript" charset="utf-8"></script>
<title>错误分析</title>
</head>
<body>
<% 
   HashMap<String,String> hashMap=new HashMap<>();
   String s=(String)session.getAttribute("当前用户");
   openGausslink obj=new openGausslink();
   Connection con= obj.GetConnection("jack", "Aowei103");
   String sql="select *from history where username="+s+";";
   PreparedStatement preparedStatement=con.prepareStatement(sql);
   ResultSet resultSet=preparedStatement.executeQuery();
   ResultSet resultSet1=resultSet;
   String[] temp=new String[1000];
   String more="";
   int i=0;
   while(resultSet1.next()){
	   String A=resultSet1.getString("wrong");
       if(!(A==null)){
	   String[] temp1=A.split(" ");
	   if(temp1[2].equals("句尾应该为分号！")||temp1[2].equals("输入不合法！")||temp1[2].equals("syntax"))temp1[2]="SQL语法错误";
	   else if(temp1[2].equals("relation")||temp1[2].equals("table"))temp1[2]="数据库对象错误";
	   else if(temp1[2].equals("column"))temp1[2]="关系表属性错误";
	   temp[i]=temp1[2];
	   i++;}
   }
   String[] temp2=new String[1000];
   int i2=0;
   int i3=0;
   for(int i1=0;i1<i;i1++){
	   String str=temp[i1];
	   boolean flag=false;
	   for(int j=0;j<i;j++){
		   if(str.equals(temp2[j])){
			   flag=true;
			   break;
		   }
	   }
	   if(flag)continue;
	   int count=0;
	   for(int k=0;k<i;k++){
		   if(str.equals(temp[k]))count++;
	   }
	   temp2[i2++]=str;
	   String num=String.valueOf(count);
	   if(i3<count){
	   more=str;
	   i3=count;
	   }
	   hashMap.put(str, num);   
   }
%>
<div id="main" style="width:900px;height: 600px;"></div>
<script type="text/javascript">
  var myChart = echarts.init(document.getElementById('main'));
  option = {
		  title: {
		    text: '错误分析',
		    subtext: '用户'+<%=session.getAttribute("当前用户")%>,
		    left: 'center'
		  },
		  tooltip: {
		    trigger: 'item'
		  },
		  legend: {
		    orient: 'vertical',
		    left: 'left'
		  },
		  series: [
		    {
		      name: '出错原因',
		      type: 'pie',
		      radius: '50%',
		      data: [
		    	  <%
		    	 for(String str:hashMap.keySet()){%>
		        { value: <%=hashMap.get(str) %>, name: '<%=str%>' },
		        <%}%>
		      ],
		      emphasis: {
		        itemStyle: {
		          shadowBlur: 10,
		          shadowOffsetX: 0,
		          shadowColor: 'rgba(0, 0, 0, 0.5)'
		        }
		      }
		    }
		  ]
		};
  myChart.setOption(option);
</script>
您当前出错最多的原因是：<%=more %><br>
据此给出以下建议：<%if(more.equals("SQL语法错误")) %><%="仔细阅读SQL官方文档，注意SQL书写正确" %>
                 <%if(more.equals("数据库对象错误")) %><%="注意当前数据库中已经存在的对象" %>
                 <%if(more.equals("关系表属性错误")) %><%="注意先查看关系表中属性是否存在以及约束情况" %>
</body>
</html>