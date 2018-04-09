
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/bootstrap.min.css"/>
<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
</head>
<body>


</body>
</html>
<style type="text/css">
	/*设置轮播图的区域大小*/
	.carousel{
		width:680px;
		height:405px;
		margin:0px auto;
	}
 .a1{margin-left:129px; margin-top:-15px;}
</style>
</head>
<body>
<nav class="navbar navbar-default"> 
  <div class="container-fluid">
   
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">

      </button>
      <a class="navbar-brand" href="next_3.jsp">首页</a>
    </div>

   
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li class="active"><a href="next_4.jsp" target="right">放映厅 <span class="sr-only">(current)</span></a></li>
        <li><a href="next_5.jsp" target="right" >影片资讯</a></li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">自助购票 <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="#">影城活动</a></li>
            <li><a href="#">会员权益</a></li>
            <li><a href="#">正在热映</a></li>
          
          </ul>
        </li>
      </ul>
      <form class="navbar-form navbar-left" role="search">
        <div class="form-group">
          <input type="text" class="form-control" placeholder="Search">
        </div>
        <button type="submit" class="btn btn-success">搜索</button>
      </form>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="#">Link</a></li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">关于我们 <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="#">Action</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">Separated link</a></li>
          </ul>
        </li>
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>
<br>
<div class="a1">
<div class="btn-group" role="group"> 
			<button type="button" class="btn btn-info ">正在热映</button>
			<button type="button" class="btn btn-default">即将上映</button></div></div>
	<!-- 轮播图一共分三个部分：轮播计数器/指示器，显示内容，切换按钮 -->
	<div class="container">
		<div id="carouselexample" class="carousel slide" data-ride="carousel">
			<!-- 轮播指示器:指定播放图片的顺序，节奏 -->
			<ol class="carousel-indicators">
				<li data-target="carouselexample" data-slide-to="0"></li>
				<li data-target="carouselexample" data-slide-to="1"></li>
				<li data-target="carouselexample" data-slide-to="2"></li>
				<li data-target="carouselexample" data-slide-to="3" class="active"></li>
			</ol>
			
			<!-- 图片：一张图片为一个div，每一个div的class都是一个item -->
			<div class="carousel-inner" role="listbox">
				<div class="item active">
					<img src="image/02.jpg"  />
					<!-- 定义图片的描述内容 -->
					<div class="carousel-caption">
					
					</div>
				</div>
				
				<div class="item">
					<img src="image/04.jpg" />
					<!-- 定义图片的描述内容 -->
					<div class="carousel-caption">
						....
					</div>
				</div>
				
				<div class="item">
					<img src="image/03.png"/>
					<!-- 定义图片的描述内容 -->
					<div class="carousel-caption">
						....
					</div>
				</div>
				<div class="item">
					<img src="image/01.jpg"  />
					<!-- 定义图片的描述内容 -->
					<div class="carousel-caption">

					</div>
				</div>
			</div>
			
			<!-- 切换按钮 -->
			<a class="left carousel-control" href="#carouselexample" role="button" data-slide="prev">
				<span class="glyphicon glyphicon-chevron-left" ></span>
                  <span class="sr-only">Previous</span>
               
 
			</a>
			
			<a class="right carousel-control" href="#carouselexample" role="button" data-slide="next">
				<span class="glyphicon glyphicon-chevron-right" ></span>
				<span class="sr-only">Next</span>

			</a>
			
		</div>
	</div>
</body>
</html>