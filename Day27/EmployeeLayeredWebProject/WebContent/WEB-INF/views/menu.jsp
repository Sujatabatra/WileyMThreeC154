<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Employee Management System</h1>
<h3 style="color:blue;">Welcome , ${user.userName} !!</h3>
<a href="./insertEmpPage">Insert Employee</a><br><br>
<a href="./getAllEmps">List All Employees</a><br><br>
<a href="./searchEmpPage">Search Employee</a><br><br>
<a href="./deleteEmpPage">Delete Employee</a><br><br>
<a href="./updateSalaryPage">Update Employee Salary</a><br><br>
<a href="./payslipPage">Generate Payslip</a>
</body>
</html>