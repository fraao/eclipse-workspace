<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="openGaussPlatform.openGausslink" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>历史输入</title>
</head>
<style>
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
</style>
<body>
<% 
   session.setAttribute("存在", 0);
   String s=(String)session.getAttribute("当前用户");
   openGausslink obj=new openGausslink();
   Connection con= obj.GetConnection("jack", "Aowei103");
   String sql="select *from history where username="+s+";";
   PreparedStatement preparedStatement=con.prepareStatement(sql);
   ResultSet resultSet=preparedStatement.executeQuery();
%>
<center>
<table border="2px">
<tr>
<th>序号</th><th>sql语句</th><th>错误信息</th>
</tr>

<% int i=1;
while(resultSet.next()){ 
%><tr>
<td><%=i %></td><td><%=resultSet.getString("sql") %><% i++; %></td><td><%=resultSet.getString("wrong") %></td>
</tr>
<% }; %>
</table>
<a href="del">清空历史</a> &nbsp;&nbsp;  <a href="guanli.jsp">返回</a> &nbsp;&nbsp;  <a href="wrong.jsp">错误分析</a>
</center>
</body>
</html>