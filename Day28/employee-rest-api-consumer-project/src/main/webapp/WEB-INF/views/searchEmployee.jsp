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
<form action="./search" method="post">
Enter Employee ID to be searched for : <input type="text" name="eId"><br><br>
<input type="submit" value="Search">
</form>
<br><br>
<a href="./">Go to main Page</a>
</body>
</html>