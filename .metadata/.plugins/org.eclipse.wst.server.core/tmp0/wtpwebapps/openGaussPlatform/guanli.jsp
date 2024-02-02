<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Map" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>管理员主页</title>
</head>
<style>
body
{
    background-image:url("背景1.jpg");
    background-size:cover;  
}
ul
      {
        list-style-type:none;
        margin:0;
        padding:0;
        overflow:hidden;
        background-color: #00E5EE;
      }
       .text0
      {
            display: inline-block;
            color: black;
            text-align: center;
            padding: 14px 16px;
            text-decoration: none;

      }
      .text0:hover
      {
        background-color:#00FF7F;
      }
.box{
width: 1400px;

height: 600px;

}
.left-box{
width:20%;
height:50%;
float: left;
margin-left:20px;
margin-top:90px;
}
textarea {
            width: 400px;
            height: 300px;
            resize: none;
            font-size: 15px;
        }
table {
        border-collapse: collapse;
        width: 80%;
        font-size: 16px;
        font-family: Arial, sans-serif;
      }
      th {
        background-color: #2d2d2d;
        color: #ffffff;
        font-weight: bold;
        text-align: center;
        padding: 10px;
      }
      td {
        border: 1px solid #ddd;
        padding: 8px;
        text-align: center;
      }
      td:hover{
      background-color: #33FF33;
      }
      tr:nth-child(even) {
        background-color: #f2f2f2;
      }
.right-box{
width:60%;
height:80%;
float: right;
margin-top:90px;
border-left: 3px dotted #000;
}
</style>
<body>
<ul>
      <a class="text0" href="guanli.jsp">SQL实验</a>
      <a class="text0" href="history.jsp">历史输入</a>
      <a class="text0" href="xinxi_guanli.jsp">管理信息</a>
      <a class="text0" href="index.jsp">退出系统</a>
    </ul>
<center>Welcome! 管理员使用系统</center>

<div class="box">
<div class="left-box">
<form action="mingling1">
<textarea name="strinG" id="" cols="30" rows="10" placeholder="请输入sql语句">
</textarea>
<input type="submit" value="执行"><input type="reset">
</form>
</div>
<div class="right-box">
<% 
   if(session.getAttribute("存在").equals(1)){//判断是否进行了查询
    int num=(int)session.getAttribute("列数");
    int sum=(int)session.getAttribute("列表数");    
    System.out.println(sum);
    if(sum!=0){
    String[] str=new String[100],str1=new String[1000];
    str=(String[])session.getAttribute("属性名");
    str1=(String[])session.getAttribute("查询数据");
%> <center> <table border="2px">
      <tr>
<%          for(int i=1;i<=num;i++){
%>       <th><%=str[i]%></th>
<%
	        }
%></tr><tr>
<%
	    	for(int i=0;i<sum/num;i++){
	    		%><tr><%
	    		for(int y=0;y<num;y++){
%>             <td><%=str1[y+i*num] %></td>
<%
	    		}
	    		%></tr>
	    		<%
	    	}
%>
<%
	}else{
		%><center>当前查询没有数据，请重新输入</center><%
	}
    session.setAttribute("存在", 0);
%>
    </table></center>
<%  } %>
</div>
</div>
<a href="https://docs.opengauss.org/zh/docs/3.1.0/docs/BriefTutorial/%E7%AE%80%E5%8D%95%E6%95%B0%E6%8D%AE%E7%AE%A1%E7%90%86.html" target="_blank">使用帮助</a>
</body>
</html>