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
import java.util.List;

@WebServlet(name = "listAllEmployeesServlet",value = "/listAllEmps")
public class ListAllEmployeesController extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        //If session not there create the otherwise pick the existing session
        HttpSession session=request.getSession();

        EmployeeService employeeService=new EmployeeServiceImpl();
        List<Employee> employeeList=employeeService.getAllEmployees();

        session.setAttribute("employeeList",employeeList);

        response.sendRedirect("showEmployees.jsp");

    }
}
