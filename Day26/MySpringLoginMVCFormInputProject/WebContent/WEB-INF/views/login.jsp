<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form"  prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>User Form</h1>

<spring:form action="./login" method="post">
Enter UserName : <spring:input path="userName"/><br><br>
Enter Password : <spring:password path="password"/><br><br>
<input type="submit" value="Login">
</spring:form>
<!--  
<form action="./login" method="post">
	Enter UserName : <input type="text" name="uname"><br><br>
	Enter Password : <input type="password" name="pwd"><br><br>
	<input type="submit" value="Login">
</form>
-->
</body>
</html>