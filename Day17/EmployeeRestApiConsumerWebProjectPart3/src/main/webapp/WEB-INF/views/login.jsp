<%--
  Created by IntelliJ IDEA.
  User: Sujata
  Date: 29-08-2023
  Time: 14:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Employee Management System</title>
    <link rel="stylesheet" href="<c:url value='mystyle.css'/> ">
</head>
<body>
<h1>Employee Management System</h1>
<hr>
<spring:form action="./login">
    Enter User Name: <spring:input path="username"></spring:input><br><br>
    Enter password : <spring:password path="password"></spring:password><br><br>
    <input type="submit" value="login">
</spring:form>
<!--
<form action="./login">
    Enter User Name : <input type="text" name="uname"><br><br>
    Enter Password : <input type="password" name="pwd"><br><br>
    <input type="submit" value="Login">
    <br><br>
    <p>${message}</p>
</form>
-->
</body>
</html>
