<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="openGaussPlatform.openGausslink" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>个人信息</title>
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
   String sql="select *from users where code="+s+";";
   PreparedStatement preparedStatement=con.prepareStatement(sql);
   ResultSet resultSet=preparedStatement.executeQuery();
%>
<center>
<table border="2px">
<tr>
<th>学号</th><th>密码</th><th>操作</th>
</tr>

<% int i=1;
while(resultSet.next()){ 
%><tr>
<td><%=resultSet.getString("code") %></td><td><%=resultSet.getString("password") %></td><td><a href="pass_update.jsp">修改</a></td>
</tr>
<% }; %>
</table>
<a href="main_system.jsp">返回</a>
</center>
</body>
</html>