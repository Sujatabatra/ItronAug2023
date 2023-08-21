package com.sujata.controllers;

import com.sujata.entity.EmployeePayslip;
import com.sujata.model.service.EmployeeService;
import com.sujata.model.service.EmployeeServiceImpl;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Optional;

@WebServlet(name = "paySlipByIdServlet",value = "/PayslipById")
public class PaySlipByIdController extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession session=request.getSession();

        EmployeeService employeeService=new EmployeeServiceImpl();
        Optional<EmployeePayslip> optionalEmployeePayslip=employeeService.getEmployeePayslip(Integer.parseInt(request.getParameter("empId")));

        if(optionalEmployeePayslip.isPresent()){
            session.setAttribute("payslip",optionalEmployeePayslip.get());
            response.sendRedirect("./ShowPayslip.jsp");
        }
        else {
            session.setAttribute("message","No employee exist for employee id "+request.getParameter("empId"));
            response.sendRedirect("./output.jsp");
        }

    }
}
