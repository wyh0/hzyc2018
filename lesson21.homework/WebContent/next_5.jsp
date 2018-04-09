<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<jsp:include page="index.jsp"></jsp:include>

</head>
<body>
<br/>
<div class="container">
<ul class="nav nav-pills nav-stacked">
 <li role="presentation" class="active"><a href="addFilm.jsp" target="right"><font size="5">添加影片</font></a></li><br/><br/>
  <li role="presentation"><a href="queryFilm.do" target="right"><font size="5">查询影片</font></a></li><br/><br/>
  <li role="presentation" class="dropdown">
   <a class="dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false">
<font size="5">
    更新影片</font>  <span class="caret"></span>

    </a>
       <ul class="dropdown-menu">
     <li> <a href="queryFilm.do">删除</a></li>
     <li> <a href="queryFilm.do">修改</a></li>      
          </ul> </li>
</ul>
</div>
<br/>



</body>
</html>