<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="wy.css" style="text/css" rel="stylesheet"/> 
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<jsp:include page="index.jsp"></jsp:include>
</head>
<body>
     
<div class="bt"></div>
<div class="denglu">
<img  src="image/我们.jpg"><br> 
	<c:if test="${username != null}">
	 <font color="gray" size="4">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${username}</font>
	</c:if><br>  
	 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="logout.do"  target="_top"><button type="button" class="btn btn-danger">注销</button></a>
	</div> 
	      
      <div class="zhuce">  
<div class="btn-group"> 
  <button type="button" class="btn btn-info dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
   注册 <span class="caret"></span>
  </button>
  <ul class="dropdown-menu">
    <li><a href="register.jsp" target="left">管理注册</a></li>
    <li><a href="member.jsp" target="left">会员注册</a></li>
  </ul>
</div></div> 
<div class="time"> 
<p align="right"><font size="5" color="darkgray"><%	Date today =new Date();

SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日HH:mm"); 
String aaa = sdf.format(today);
out.println(aaa);
      %></font><p/></div>
      </body>
</html>