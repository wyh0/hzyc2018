<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="wy.css" style="text/css" rel="stylesheet"/> 
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>影片</title>
</head>
<body>
<b><p align="center"><font size="3" color="red">影片管理</font></p></b>
<table class="table">
<tr height="15px">
<td >编号</td>
<td >名称</td>
<td >导演</td>
<td >国家</td> 
<td >片长</td>
<td >语言</td>
<td >上映时间</td>
<td >下线时间</td>
<td >编辑/操作</td>
</tr>
<c:forEach var="film" items="${film}">
			<tr height="46px" >
				<td >${film.id}</td>
				<td >${film.name}</td>
				<td >${film.director}</td>
				<td >${film.country}</td>
				<td >${film.time}</td>
				<td >${film.language}</td>
				<td >${film.starttime}</td>
				<td >${film.overtime}</td>
				
				<td><a href="queryFilmById.do?id=${film.id}">修改</a>|<a href="queryFilmById1.do?id=${film.id}">删除</a></td>
			</tr>
		
		</c:forEach>
	
	
	
	
	</table>

</body>
</html>