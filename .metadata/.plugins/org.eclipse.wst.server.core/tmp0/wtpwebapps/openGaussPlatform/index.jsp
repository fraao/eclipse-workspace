<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="openGaussPlatform.openGausslink" %>
<%@ page import="java.sql.Connection" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>openGauss学习平台</title>
</head>
<style>
body
{
    background-image:url("背景1.jpg");
    background-size:cover;  
}
 a
      {
        text-decoration:none;
        background-color: #DBDBDB;
        border:1.5px solid #DBDBDB;
        margin-left:12px;
        color:black;
        height:25px;
        border-radius: 4px;
      }
      .type1
      {
        background-color:#DBDBDB;
        border:1.5px solid #DBDBDB;
        height:25px;
      }
     input
          {
            margin-top:20px;
            border-radius: 4px;
          }
     input:hover
          {
            background-color: #33FF33;
          }
     a:hover
          {
            background-color: #33FF33;
          }
     .box{
width: 1400px;

height: 600px;

}



.left-box{
width:60%;
height:80%;
float: left;
overflow: hidden;
}

.right-box{
width:20%;
height:50%;
float: right;
margin-top:90px;
border: 2px solid #a1a1a1;
border-radius: 25px;
}
.imgBox{
            
            width: 9999px;
            height:100%;
            animation:switch 15s infinite;
        }

        .imgBox img{
            float: left;
            position: relative;
        }
@keyframes switch{
		0%{};
		25%{transform:translateX(0px);}
		50%{transform:translateX(-840px);}
		75%{transform:translateX(-1680px);}
		100%{transform:translateX(-2520px);}
		}
</style>
<body>
<img src="img4.png">
<div class="box">
<div class="left-box">
<div class="imgBox">
    <img src="img3.jpg">
    <img src="img1.jpg">
    <img src="img2.jpg">
    <img src="img3.jpg">
</div>
</div>
<div class="right-box">
<form action="login_yanzheng">
<% session.setAttribute("存在", 0); %>
 <center style="font-size:25px;">欢迎登录系统</center><br><br>
      <center>
      <input type="text" placeholder="学号" name="code">
      <br>
      <input type="password" placeholder="密码" name="pass"><br><br>
       <input type="submit" value="登录" class="type1">
      <input type="button" value="注册" onclick="window.location.href='zhuce.jsp'">
      </center>
</form>
</div>
</div>
</body>
</html>