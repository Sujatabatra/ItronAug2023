<%@ page import="com.sujata.entity.EmployeePayslip" %><%--
  Created by IntelliJ IDEA.
  User: Sujata
  Date: 21-08-2023
  Time: 14:58
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
<% EmployeePayslip payslip=(EmployeePayslip) session.getAttribute("payslip");%>
<h2>PaySlip for <%= payslip.getEmployee().getEmpName()%></h2>
<h3>Basic Salary : <%=payslip.getEmployee().getEmpSalary()%></h3>
<h3>HR : <%=payslip.getHra()%></h3>
<h3>DA : <%=payslip.getDa()%></h3>
<h3>PF : <%=payslip.getPf()%></h3>
<h3>Total Salary : <%=payslip.getTotalSalary()%></h3>


<br><br>
<a href="./">Go To Main Page</a>

</body>
</html>
