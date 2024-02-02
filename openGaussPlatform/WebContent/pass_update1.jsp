<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="openGaussPlatform.openGausslink" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>密码修改</title>
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

<center>
<form action="pass_update1.jsp">
请输入新密码：<input type="password" placeholder="密码" name="pass"><br>
<input type="submit" value="提交" name="submit" style="margin-right:15px;"><input type="reset">
<%
      if(request.getParameter("submit")!=null)
      { 
    	 String s=(String)session.getAttribute("当前操作用户");
    	 String pass=request.getParameter("pass");
    	 openGausslink obj=new openGausslink();
    	 Connection con= obj.GetConnection("jack", "Aowei103");
    	 String sql="update users set password='"+pass+"' where code="+s+";";
    	 PreparedStatement preparedStatement=con.prepareStatement(sql);
     	 preparedStatement.executeUpdate();
         request.getRequestDispatcher("xinxi_guanli.jsp").forward(request,response);
      }
    %>
</form>

</center>
</body>
</html>