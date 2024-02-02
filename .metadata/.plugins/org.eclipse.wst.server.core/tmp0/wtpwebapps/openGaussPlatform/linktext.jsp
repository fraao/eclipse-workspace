<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="openGaussPlatform.openGausslink" %>
<%@ page import="java.sql.Connection" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
//创建数据库连接。
    Connection con=null;
    openGausslink a=new openGausslink();
    con=a.GetConnection("jack", "Aowei103");
    a.closeconnection(con);
%>
</body>
</html>