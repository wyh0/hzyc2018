<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<b><p align="center"><font size="3" color="red">添加影片</font></p></b>
<form action="addFilm.do" method="post">
	        编号：<input type="text" name="id"/><br /><br />
		名称：<input type="text" name="name"/><br /><br />
		导演：<input type="text" name="director"/><br /><br />
		国家：<input type="text" name="country"/><br />	<br />
		片长：<input type="text" name="time"/><br />	<br />
		语言：<input type="text" name="language"/><br />	<br />
		上映：<input type="text" name="starttime"/><br /><br />	
		下线：<input type="text" name="overtime"/><br />			
	<pre>        <input type="submit" value="添加" style="font-family:宋体;font-size:20px;"/></pre>
	
	</form>
</body>
</html>