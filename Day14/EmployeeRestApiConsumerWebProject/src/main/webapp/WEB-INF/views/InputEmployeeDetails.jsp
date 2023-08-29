<%--
  Created by IntelliJ IDEA.
  User: Sujata
  Date: 29-08-2023
  Time: 12:12
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
<h2>Welcome ${user.username}!</h2>
<hr>
<form action="./saveEmployee">
    Enter Employee ID : <input type="text" name="eId"><br><br>
    Enter Employee Name : <input type="text" name="eName"><br><br>
    Enter Designation : <input type="text" name="eDesignation"><br><br>
    Enter Department : <input type="text" name="eDepartment"><br><br>
    Enter Salary : <input type="text" name="eSalary"><br><br>
    <input type="submit" value="Save Employee">
</form>

<br><br>
<a href="./menu">Go To Main Page</a>
</body>
</html>
