<%--
  Created by IntelliJ IDEA.
  User: Sujata
  Date: 29-08-2023
  Time: 11:20
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
<spring:form action="./searchEmployee">
    Select Employee ID : <spring:select path="empId">
    <spring:options items="${empIds}"></spring:options>
    <input type="submit" value="Search Employee">
</spring:select>
    <!--
</spring:form>
<form action="./searchEmployee">
  Enter Employee ID : <input type="text" name="empId"><br><br>
  <input type="submit" value="Search Employee">
</form>
-->
<br><br>
<a href="./menu">Go To Main Page</a>

</body>
</html>
