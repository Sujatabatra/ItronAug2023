package com.sujata.controllers;

import com.sujata.model.service.EmployeeService;
import com.sujata.model.service.EmployeeServiceImpl;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "deleteEmpByIdServlet",value = "/deleteById")
public class DeleteEmpByIdController extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession session=request.getSession();
        EmployeeService employeeService=new EmployeeServiceImpl();
        String message;
        if(employeeService.deleteEmployeeById(Integer.parseInt(request.getParameter("empId"))))
            message="Employee Deleted";
        else
            message="Employee Not Deleted";

        session.setAttribute("message",message);
        response.sendRedirect("./output.jsp");
    }
}
