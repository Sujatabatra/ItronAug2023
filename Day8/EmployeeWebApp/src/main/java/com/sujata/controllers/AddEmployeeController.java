package com.sujata.controllers;

import com.sujata.entity.Employee;
import com.sujata.model.service.EmployeeService;
import com.sujata.model.service.EmployeeServiceImpl;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "addEmployeeServlet",value = "/insertEmp")
public class AddEmployeeController extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        HttpSession session=request.getSession();

        EmployeeService employeeService=new EmployeeServiceImpl();

        Employee employee=new Employee();
        employee.setEmpId(Integer.parseInt(request.getParameter("eId")));
        employee.setEmpName(request.getParameter("eName"));
        employee.setEmpDesignation(request.getParameter("eDesig"));
        employee.setEmpDepartment(request.getParameter("eDeptt"));
        employee.setEmpSalary(Double.parseDouble(request.getParameter("eSalary")));

        String message;
        if(employeeService.addNewEmployee(employee))
            message="Employee Added!";
        else
            message="Employee Not Added";

        session.setAttribute("message",message);
        response.sendRedirect("./output.jsp");
    }
}
