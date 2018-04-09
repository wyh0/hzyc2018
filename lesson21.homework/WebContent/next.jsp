<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>这里</title>
</head>
<body> 

		<c:forEach var="register" items="${stuList}">
		 
	  ${register.username}
	  ${register.password}	
			 
 
	<%
	request.setCharacterEncoding("utf-8"); 
                 
   String user = request.getParameter("username"); 
   String pass = request.getParameter("password");
   if("admin".equals(user) && "123456".equals(pass)){
	   response.sendRedirect("next_1.jsp?user="+user);
   }else{  
	   response.sendRedirect("demo.jsp");
   }
   %>
</c:forEach>	
    </body>
    </html>