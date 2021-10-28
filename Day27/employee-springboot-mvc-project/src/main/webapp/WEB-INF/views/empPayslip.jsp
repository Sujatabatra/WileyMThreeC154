<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Employee PaySlip</h1>
<h3 style="color:blue;">Welcome , ${user.userName} !!</h3>
<table border="1">
	<tr>
		<th>Employee ID</th>
		<th>Name</th>
		<th>Designation</th>
		<th>Department</th>
		<th>Salary</th>
		<th>HRA</th>
		<th>DA</th>
		<th>PF</th>
		<th>Total Salary</th>
	</tr>
	<tr>
		<td>${payslip.employee.empId }</td>
		<td>${payslip.employee.empName }</td>
		<td>${payslip.employee.empDesignation }</td>
		<td>${payslip.employee.empDepartment }</td>
		<td>${payslip.employee.empSalary }</td>
		<td>${payslip.hra }</td>
		<td>${payslip.da }</td>
		<td>${payslip.pf }</td>
		<td>${payslip.totalSalary }</td>
	</tr>
</table>
<br><br>
<a href="./menu">Go to main Page</a>
</body>
</html>