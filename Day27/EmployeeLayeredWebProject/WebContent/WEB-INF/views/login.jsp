<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Employee Management system</h1>
<spring:form action="./loginCheck" method="post">
	Enter Username : <spring:input path="userName"/><br><br>
	Enter password : <spring:password path="password"/><br><br>
	<input type="submit" value="Login">
</spring:form>
<br><br>
<h2>${message }</h2>
</body>
</html>