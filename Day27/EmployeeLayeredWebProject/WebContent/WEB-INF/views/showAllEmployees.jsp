<%@page import="com.sujata.bean.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>List of Employees</h1>
<% List<Employee> employees=(List<Employee>)request.getAttribute("employees"); %>
<table border="1">
	<tr>
		<th>Employee ID</th>
		<th>Name</th>
		<th>Designation</th>
		<th>Department</th>
		<th>Salary</th>
	</tr>
	<%for(Employee emp:employees){%>
	<tr>
		<td><%=emp.getEmpId() %></td>
		<td><%= emp.getEmpName()%></td>
		<td><%=emp.getEmpDesignation() %></td>
		<td><%=emp.getEmpDepartment() %></td>
		<td><%=emp.getEmpSalary() %></td>
	</tr>
	<%} %>
</table>

<br><br>
<a href="./">Go to main Page</a>
</body>
</html>