 <%@page import="com.hzyc.lesson21.bean.Student"%>
<%@ page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<link href="wy.css" style="text/css" rel="stylesheet"/> 
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>显示</title>
<jsp:include page="index.jsp"></jsp:include>
</head>
<body>
<br/>
<b><p align="center"><font size="3" color="red">放映厅</font></p></b>
<div class="container">
	
		<div class="table-responsive">
		<table class="table table-striped table-bordered table-hover ">
		<tr class="info">
<td width="10px">编号</td>
<td >名称</td>
<td >类型</td>
<td >座位</td>
<td >编辑</td>

</tr>
	<!-- jstl:需要引入标签库，可以在某一种程度上代替Java语言 -->
	<%-- <%List<Student> sList = (List)request.getAttribute("stuList");
		for(Student s:sList){
			out.print(s.toString());
		}
	
	
	%> --%>
		<!-- items是要被循环的值，var是for循环之后得到的值 -->
		<c:forEach var="showroom" items="${stuList}">
			<tr height="46px" >
				<td >${showroom.id}</td>
				<td >${showroom.name}</td>
				<td >${showroom.type}</td>
				<td >${showroom.count}</td>
				<td><a href="queryShowRoomById.do?id=${showroom.id}">修改</a>|<a href="queryShowRoomById1.do?id=${showroom.id}">删除</a></td>
			</tr>
		
		</c:forEach>
	
	
	
	
	</table>
		</div>
	
	</div>
	

	
	
	
</body>	
</html>