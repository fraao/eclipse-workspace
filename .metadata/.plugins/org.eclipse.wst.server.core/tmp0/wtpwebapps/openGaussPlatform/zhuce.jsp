<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>注册页面</title>
</head>
<style>
body
{
    background-image:url("背景1.jpg");
    background-size:cover;  
}
input
      {
        margin-right:12px;
      }
       input:hover
        {
          background-color:#33FF33;
        }
      form
          {
/*            background-color: #8DEEEE;*/
            margin-top: 50px;
            margin-left:400px;margin-right:400px;
            height:800px;
          }
</style>
<body>

<center>
    <form action="zhuce_charu"><br>
      <center style="font-size:25px;">用户信息注册界面</center><br>
      请输入:<input type="text" placeholder="学号" name="code"><br><br>
      请输入:<input type="password" placeholder="密码" name="password"><br><br>
<br><br>
      <input type="submit" value="提交"><input type="reset">
    </form>
      </center>
</body>
</html>