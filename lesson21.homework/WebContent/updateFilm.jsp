<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<form action="updateFilm.do" method="post">
		编号：<input type="text" name="id" value="${film.id}" readonly="readonly"/><br /><br />
		名称：<input type="text" name="name"  value="${film.name}"/><br /><br />
		导演：<input type="text" name="director"  value="${film.director}"/><br /><br />
		国家：<input type="text" name="country"  value="${film.country}"/><br /><br />
		片长：<input type="text" name="time"  value="${film.time}"/><br /><br />
		语言：<input type="text" name="language"  value="${film.language}"/><br /><br />
		上映：<input type="text" name="starttime"  value="${film.starttime}"/><br /><br />
		下线：<input type="text" name="overtime"  value="${film.overtime}"/><br />
		
		
	       <pre>      <input type="submit" value="修改" /></pre>  
</body>
</html>