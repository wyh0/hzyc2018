<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
.a1{margin-left:35px;}


</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function validPassLength(){
		//alert("测试");
		var passLength = document.getElementById("passId").value.length;
		
		if(passLength < 6 || passLength > 16){
			//alert(passLength);
			//创建span标签
			//var spanObj = document.createElement("span");
			var spanObj = document.getElementById("passSpan");
			spanObj.innerHTML = "<font color='red' size='2'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;密码长度为6-16位!</font>";
		}
		
		//任何一个js函数都可以自定义返回值。
		//return false;
		
	}
	
	
	function validUsername(){
		
		//alert(validPassLength());
		
		
		var userName = document.getElementById("nameId").value;
		
		//使用异步请求，判断用户名是否存在重复现象。
		/*
		ajax的核心技术:XMLHttpRequest对象
		*/
		//1.创建XMLHttpRequest
		var xmlhttp = new XMLHttpRequest();
		//2.设置监听,ajax有5个状态，只有第4个状态是可以接收处理结果的。
		//监听第4个状态
		xmlhttp.onreadystatechange = function(){
			if(xmlhttp.readyState == 4){
				//接收处理结果
				var data = xmlhttp.responseText;
				//alert(data);
				if(data == 'OK'){
					var imgObj = document.getElementById("imgId");
					//设置图片的资源路径
					imgObj.src="image/duihao.png"
					imgObj.style.width="10px";
					imgObj.style.height="10px";
				}
			}
			
			
		};
		
		
		//3.打开通道，建立请求连接,参数1：请求方式，参数2，请求的url，参数3，是否异步
		xmlhttp.open("post","ValidServlet",true);
	    //4.设置一个请求头部信息
	    xmlhttp.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
	    //5.发送请求
	    xmlhttp.send("username="+userName);
		
		
	}
</script>
</head>
<body>
 <div class="a1">
<b><p align="center"><font size="3" color="red">会员注册</font></p></b>
	<form action="add_user.do" method="post" onsubmit="" enctype="application/x-www-form-urlencoded">
	    
	   昵称：<input type="text" name="username" placeholder="用户名" id="nameId" onblur="validUsername()" /><img id="imgId"/><br /><br />
	 
	    密码：<input type="password" name="password" placeholder="密码" id="passId" onblur="validPassLength()"/><br/><span id="passSpan"></span><br /><br />
		<pre>        <input type="submit" value="注册" style="font-family:宋体;font-size:16px;"/></pre>
	
	</form>
	</div>
</body>
</html>