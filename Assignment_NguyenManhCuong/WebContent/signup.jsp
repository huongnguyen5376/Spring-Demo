<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Home - Signup</title>
	<link rel="stylesheet" type="text/css" href="css/content.css">
</head>
<body>
	<h2>Đăng kí</h2>
	<form action="AddUser" method="post">
		<input type="text" placeholder="Nhập tài khoản" autocomplete="off" minlength="6" name="userName" class="someText">
		<br><br>
		<input type="password" placeholder="Nhập mật khẩu" minlength="6" name="passWord" class="someText">
		<br><br>
		<input type="password" minlength="6" placeholder="Nhập lại mật khẩu" name="repass" class="someText">
		<br><br>
		<input id="signinUser" type="submit" value="Sign Up">
	</form>		
</body>
</html>