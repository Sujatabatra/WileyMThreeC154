<%@page import="com.sujata.bean.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Employee Details</h1>
<% Employee emp=(Employee)request.getAttribute("emp");
if(emp!=null){
%>
<table border="1">
	<tr>
		<th>Employee ID</th>
		<th>Name</th>
		<th>Designation</th>
		<th>Department</th>
		<th>Salary</th>
	</tr>
	<tr>
		<td>${emp.empId}</td>
		<td>${emp.empName}</td>
		<td>${emp.empDepartment}</td>
		<td>${emp.empDesignation}</td>
		<td>${emp.empSalary}</td>
	</tr>
</table>
<%}
else { %>
<h1>Employee Not found</h1>
<%} %>
<br><br>
<a href="./">Go to main Page</a>
</body>
</html>