<%@ page import="com.sujata.entity.Employee" %><%--
  Created by IntelliJ IDEA.
  User: Sujata
  Date: 21-08-2023
  Time: 13:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
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
    <% Employee employee= (Employee) session.getAttribute("employee");

    %>
    <tr>
        <td><%=employee.getEmpId()%></td>
        <td><%=employee.getEmpName()%></td>
        <td><%=employee.getEmpDesignation()%></td>
        <td><%=employee.getEmpDepartment()%></td>
        <td><%=employee.getEmpSalary()%></td>
    </tr>

</table>

<br><br>
<a href="./">Go To Main Page</a>
</body>
</html>
