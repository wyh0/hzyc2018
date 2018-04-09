<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>

<b><p align="center"><font size="3" color="red">添加放映厅</font></p></b>
	<form action="addShowRoom.do" method="post">
	        编号：<input type="text" name="id"/><br /><br />
		名字：<input type="text" name="name"/><br /><br />
		类型：<input type="text" name="type"/><br /><br />	
		座位：<input type="text" name="count"/>		
	<pre>        <input type="submit" value="添加" style="font-family:宋体;font-size:20px;"/></pre>
	
	</form>
</body>
</html>