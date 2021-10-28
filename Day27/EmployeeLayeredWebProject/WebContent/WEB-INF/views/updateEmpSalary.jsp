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
<h1>Employee Management System</h1>
<h3 style="color:blue;">Welcome , ${user.userName} !!</h3>
<spring:form action="./updateSalary" method="post">
	Enter Employee ID : <spring:input path="empId"/><br><br>
	Enter Employee New Salary : <spring:input path="empSalary"/><br><br>
	<input type="submit" value="Update">
</spring:form>
<br><br>
<a href="./menu">Go to main Page</a>
</body>
</html>