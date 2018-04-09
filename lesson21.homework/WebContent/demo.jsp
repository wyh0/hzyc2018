<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>影院售票管理系统</title>
 <link href="wy.css" style="text/css" rel="stylesheet"/> 
</head> 
<body>  
<div class="a1">   
<br/><br/><br/><br/><p align="center"> <font size="7" color=dfirebrick>影院售票系统</font><p/><br/>
<p align="right" ><font size="6" color=dfirebrick>--------欢迎登陆</font><p/>
<div class="a2">

<pre><form action="queryUser.do" method="post"> 
        <font size="5" color=dfirebrick>管理员:</font> <input type="text" name="username" placeholder="请输入用户名" style="height:22px"/><br/>
         <font size="5" color=dfirebrick>密码:</font>   <input type="password" name="password" placeholder="请输入密码" style="height:22px"/> <br/>
                      <input type="submit" value="登录" /><pre/>
</form></div></div>

</body>
</html>   