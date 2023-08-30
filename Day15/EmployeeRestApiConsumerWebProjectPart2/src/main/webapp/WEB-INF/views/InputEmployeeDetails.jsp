<%--
  Created by IntelliJ IDEA.
  User: Sujata
  Date: 29-08-2023
  Time: 12:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Employee Management System</title>
</head>
<body>
<h1>Employee Management System</h1>
<hr>
<h2>Welcome ${user.username}!</h2>
<hr>
<spring:form action="./saveEmployee" modelAttribute="empl">
    Enter Employee ID : <spring:input path="empId"></spring:input><br><br>
    Enter Employee Name : <spring:input path="empName"></spring:input><br><br>
    Enter Designation :<spring:input path="empDesignation"></spring:input><br><br>
    Enter Department : <spring:input path="empDepartment"></spring:input><br><br>
    Enter Salary : <spring:input path="empSalary"></spring:input><br><br>
    <input type="submit" value="Save Employee">
</spring:form>
<!--
<form action="./saveEmployee">
    Enter Employee ID : <input type="text" name="eId"><br><br>
    Enter Employee Name : <input type="text" name="eName"><br><br>
    Enter Designation : <input type="text" name="eDesignation"><br><br>
    Enter Department : <input type="text" name="eDepartment"><br><br>
    Enter Salary : <input type="text" name="eSalary"><br><br>
    <input type="submit" value="Save Employee">
</form>
-->
<br><br>
<a href="./menu">Go To Main Page</a>
</body>
</html>
