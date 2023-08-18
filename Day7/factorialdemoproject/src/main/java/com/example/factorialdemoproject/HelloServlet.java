package com.example.factorialdemoproject;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/fact")
public class HelloServlet extends HttpServlet {
    private Factorial factorial=new Factorial();

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        int number=Integer.parseInt(request.getParameter("num"));

        long fact=factorial.calculateFactorial(number);
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1> Factorial : " + fact + "</h1>");
        out.println("</body></html>");
    }


}