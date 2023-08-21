<%@ page import="java.util.List" %>
<%@ page import="com.sujata.entity.Employee" %><%--
  Created by IntelliJ IDEA.
  User: Sujata
  Date: 21-08-2023
  Time: 12:25
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
<h2>Employee Details</h2>
<table border="1">
    <tr>
        <th>Employee ID </th>
        <th>Name</th>
        <th>Designation</th>
        <th>Department</th>
        <th>Salary</th>
    </tr>
    <% List<Employee> empList= (List<Employee>) session.getAttribute("employeeList");
        for(Employee employee:empList){
    %>
    <tr>
        <td><%=employee.getEmpId()%></td>
        <td><%=employee.getEmpName()%></td>
        <td><%=employee.getEmpDesignation()%></td>
        <td><%=employee.getEmpDepartment()%></td>
        <td><%=employee.getEmpSalary()%></td>
    </tr>
    <%}
    %>
</table>
</body>
</html>
