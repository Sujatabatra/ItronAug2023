<%@ page import="java.util.List" %>
<%@ page import="com.sujata.entity.Employee" %><%--
  Created by IntelliJ IDEA.
  User: Sujata
  Date: 21-08-2023
  Time: 12:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Employee Management System</title>
</head>
<body>
<h1>Employee Management System</h1>
<hr>
<h2>Employee Details</h2>
<table border="1">
    <tr>
        <th>Employee ID </th>
        <th>Name</th>
        <th>Designation</th>
        <th>Department</th>
        <th>Salary</th>
    </tr>

    <c:forEach var="employee" items="${sessionScope.employeeList}">
        <tr>
            <td>${employee.empId}</td>
            <td>${employee.empName}</td>
            <td>${employee.empDesignation}</td>
            <td>${employee.empDepartment}</td>
            <td>${employee.empSalary}</td>
        </tr>
    </c:forEach>


</table>
<br><br>
<a href="./">Go To Main Page</a>
</body>
</html>
