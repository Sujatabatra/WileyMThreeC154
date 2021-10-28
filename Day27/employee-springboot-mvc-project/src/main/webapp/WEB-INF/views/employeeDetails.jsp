<%@page import="com.sujata.bean.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Employee Details</h1>
	<h3 style="color:blue;">Welcome , ${user.userName} !!</h3>
	<c:if test="${not empty emp}">
		<%
		//Employee emp=(Employee)request.getAttribute("emp");
		//if(emp!=null){
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
	</c:if>
	<%
	//}
	//else {
	%>

	<c:if test="${empty emp}">
		<h1>Employee Not found</h1>
	</c:if>
	<%
	//}
	%>
	<br>
	<br>
	<a href="./menu">Go to main Page</a>
</body>
</html>