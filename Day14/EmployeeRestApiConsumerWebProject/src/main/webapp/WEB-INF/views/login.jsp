<%--
  Created by IntelliJ IDEA.
  User: Sujata
  Date: 29-08-2023
  Time: 14:55
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
<form action="./login">
    Enter User Name : <input type="text" name="uname"><br><br>
    Enter Password : <input type="password" name="pwd"><br><br>
    <input type="submit" value="Login">
    <br><br>
    <p>${message}</p>
</form>
</body>
</html>
