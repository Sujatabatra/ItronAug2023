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
import java.util.Optional;

@WebServlet(name ="searchByEmpIdServlet" ,value = "/searchById")
public class SearchByEmpIdController extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        HttpSession session=request.getSession();
        EmployeeService employeeService=new EmployeeServiceImpl();

        Integer empId=Integer.parseInt(request.getParameter("empId"));

        Optional<Employee> optionalEmployee=employeeService.getEmployeeById(empId);

        if(optionalEmployee.isPresent()){
            session.setAttribute("employee",optionalEmployee.get());
            response.sendRedirect("./displayEmployee.jsp");
        }
        else{
            session.setAttribute("message","Employee with ID "+empId+" does not exist!");
            response.sendRedirect("./output.jsp");
        }

    }
}
