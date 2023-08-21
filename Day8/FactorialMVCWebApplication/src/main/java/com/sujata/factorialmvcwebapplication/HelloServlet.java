package com.sujata.factorialmvcwebapplication;

import com.sujata.model.Factorial;

import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/fact")
public class HelloServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Integer number=Integer.parseInt(request.getParameter("number"));

        Factorial factorial=new Factorial(number);

        int fact=factorial.getFactorial();

        request.setAttribute("factorial",fact);

        //Two request response cycle : data lost from first request
//        response.sendRedirect("factorialOutput.jsp");

        //One request response cycle
        RequestDispatcher dispatcher=request.getRequestDispatcher("factorialOutput.jsp");
        dispatcher.forward(request,response);

    }


}