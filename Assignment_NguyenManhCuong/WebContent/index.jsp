<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Homepage</title>
	<link rel="stylesheet" type="text/css" href="css/main.css">
	<link rel="stylesheet" type="text/css" href="css/content.css">
</head>
<body>
	<div id="header">
		<img alt="Không có ảnh hiển thị" src="img/book.jpg" 
			style="width: 100%; height: 100%;">
	</div>
	<div id="menu">
		<ul>
			<li><a href="#">Home</a></li>
			<li><a href="#">About</a></li>
		</ul>
	</div>
	<div style="width: 100%; margin-top: 2px;">
		<div id="first_content">
			<div class="login">
				<form action="AuthenticationUser" method="post">
					<input type="text" placeholder="Nhập tài khoản" autocomplete="off" minlength="6" name="userName" class="someText">
					<br><br>
					<input type="password" placeholder="Nhập mật khẩu" minlength="6" name="passWord" class="someText">
					<br><br>
					<input id="signinUser" type="submit" value="Sign In">
				</form>			
			</div>
			<div class="cate">
				<div style="text-transform: uppercase; background-color: #7d2121; width: 99.3%;
					color: white; margin-top: -18px; border-radius: 6px; padding-top: 5px; padding-bottom: 5px;'">
					Categories
				</div>
				<ul class="listdot">
  					<li class="listdot"><a class="listdot" href="#"><b>All</b></a></li>
  					<li class="listdot"><a class="listdot" href="#"><b>Children books</b></a></li>
  					<li class="listdot"><a class="listdot" href="#"><b>Business books</b></a></li>
  					<li class="listdot"><a class="listdot" href="#"><b>Literature books</b></a></li>
  					<li class="listdot"><a class="listdot" href="#"><b>Music books</b></a></li>
  					<li class="listdot"><a class="listdot" href="#"><b>Technology books</b></a></li>
				</ul> 				
			</div>
		</div>
		<div id="second_content">
			<h1 class="h1">Business Books</h1>
			<div class="news">
				<h2 class="h2"><a class="link" href="#">Hè phố Hà Nội ngổn ngang vì đá lát "bền 70 năm"</a></h2>
				<p class="p">Một số tuyến phố trong kế hoạch lát lại vỉa hè bằng đá tự nhiên được giới thiệu là "bền 70 năm" đang trong tình trạng ngổn ngang vì thi công dở dang, thậm chí có nơi đã bong tróc, gạch mới lát vỡ vụn.</p>
				<div style="float: right; margin-top: 5px">
					<h5 class="h5">Tác giả : </h5>
					<p class="info">Nguyễn Văn A</p>				
				</div>
				<div style="float: right; margin-top: 25px; margin-right: -110px;">
					<h5 class="h5v2">Ngày phát hành : </h5>
					<p class="info">20-11-2010</p>						
				</div>
			</div>
			<div class="news">
				<h2 class="h2"><a class="link" href="#">Hè phố Hà Nội ngổn ngang vì đá lát "bền 70 năm"</a></h2>
				<p class="p">Một số tuyến phố trong kế hoạch lát lại vỉa hè bằng đá tự nhiên được giới thiệu là "bền 70 năm" đang trong tình trạng ngổn ngang vì thi công dở dang, thậm chí có nơi đã bong tróc, gạch mới lát vỡ vụn.</p>
				<div style="float: right; margin-top: 5px">
					<h5 class="h5">Tác giả : </h5>
					<p class="info">Nguyễn Văn A</p>				
				</div>
				<div style="float: right; margin-top: 25px; margin-right: -110px;">
					<h5 class="h5v2">Ngày phát hành : </h5>
					<p class="info">20-11-2010</p>						
				</div>
			</div>
			<div class="news">
				<h2 class="h2"><a class="link" href="#">Hè phố Hà Nội ngổn ngang vì đá lát "bền 70 năm"</a></h2>
				<p class="p">Một số tuyến phố trong kế hoạch lát lại vỉa hè bằng đá tự nhiên được giới thiệu là "bền 70 năm" đang trong tình trạng ngổn ngang vì thi công dở dang, thậm chí có nơi đã bong tróc, gạch mới lát vỡ vụn.</p>
				<div style="float: right; margin-top: 5px">
					<h5 class="h5">Tác giả : </h5>
					<p class="info">Nguyễn Văn A</p>				
				</div>
				<div style="float: right; margin-top: 25px; margin-right: -110px;">
					<h5 class="h5v2">Ngày phát hành : </h5>
					<p class="info">20-11-2010</p>						
				</div>
			</div>
			<div class="news">
				<h2 class="h2"><a class="link" href="#">Hè phố Hà Nội ngổn ngang vì đá lát "bền 70 năm"</a></h2>
				<p class="p">Một số tuyến phố trong kế hoạch lát lại vỉa hè bằng đá tự nhiên được giới thiệu là "bền 70 năm" đang trong tình trạng ngổn ngang vì thi công dở dang, thậm chí có nơi đã bong tróc, gạch mới lát vỡ vụn.</p>
				<div style="float: right; margin-top: 5px">
					<h5 class="h5">Tác giả : </h5>
					<p class="info">Nguyễn Văn A</p>				
				</div>
				<div style="float: right; margin-top: 25px; margin-right: -110px;">
					<h5 class="h5v2">Ngày phát hành : </h5>
					<p class="info">20-11-2010</p>						
				</div>
			</div>									
		</div>		
	</div>
	<div style="background-color: #7d2626; height: 50px; width: 99.9%; clear: both; margin-top: 10px;"></div>
</body>
</html>