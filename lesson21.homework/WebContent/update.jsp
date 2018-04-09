<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<form action="updateShowRoom.do" method="post">
		编号：<input type="text" name="id" value="${showroom.id}" readonly="readonly"/><br /><br />
		名称：<input type="text" name="name"  value="${showroom.name}"/><br /><br />
		类型：<input type="text" name="type"  value="${showroom.type}"/><br /><br />
		座位：<input type="text" name="count"  value="${showroom.count}"/><br />
		
		
	       <pre>      <input type="submit" value="修改" /></pre>  
</body>
</html>