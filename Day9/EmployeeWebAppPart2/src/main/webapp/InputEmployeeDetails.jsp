<%--
  Created by IntelliJ IDEA.
  User: Sujata
  Date: 21-08-2023
  Time: 13:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Employee Management System</title>
</head>
<body>
<h1>Employee Management System</h1>
<hr>
<form action="./insertEmp" method="post">
    Enter Employee ID : <input type="text" name="eId"><br><br>
    Enter Employee Name : <input type="text" name="eName"><br><br>
    Enter Designation : <input type="text" name="eDesig"><br><br>
    Enter Department : <input type="text" name="eDeptt"><br><br>
    Enter Salary : <input type="text" name="eSalary"><br><br>
    <input type="submit" value="Add Employee">
</form>
<br><br>
<a href="./">Go To Main Page</a>
</body>
</html>
