<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Sign Up Page</title>
</head>
<body>
<h1>Sign Up</h1>
<form:form method="post" action="luu">
	<table>
		<tr>
			<td>Tai khoan : </td>
			<td><form:input path="username" /></td>
		</tr>
		<tr>
			<td>Mat khau : </td>
			<td><form:input path="password" /></td>
		</tr>
		<tr>
			<td>Nhap lai mat khau : </td>
			<td><form:input path="password" /></td>
		</tr>
		<tr>
			<td></td>
			<td><input type="submit" value="Dang ki thanh cong" /></td>
		</tr>
	</table>
</form:form>
</body>
</html>