<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form Summary</title>
</head>
<body>
	<div>
		<h1 class="text-center" align="center">${Header }</h1>
		<p class="text-center" align="center">${Desc }</p>
		<hr>

		<h1>Welcome, ${user.name}</h1>

		<h1>Your Email id is : ${user.email}</h1>

		<h1>Your Password is : ${user.password}</h1>
	</div>
</body>
</html>