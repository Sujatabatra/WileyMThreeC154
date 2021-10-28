<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spring" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Input Form</title>
</head>
<body>
<h1>Enter Employee Details</h1>
<spring:form action="./insertEmp" method="post" modelAttribute="command">
Enter Employee Id: <spring:input path="empId"/><br><br>
Enter Employee Name : <spring:input path="empName"/><br><br>
Enter Employee Department : <spring:select path="empDepartment">
<spring:option value="IT"></spring:option>
<spring:option value="Sales"></spring:option>
<spring:option value="Purchase"></spring:option>
</spring:select><br><br>
Enter Employee Designation : <spring:input path="empDesignation"/><br><br>
Enter Employee Salary : <spring:input path="empSalary"/><br><br>
<input type="submit" value="Save">
</spring:form>

<br><br>
<a href="./">Go to main Page</a>
</body>
</html>