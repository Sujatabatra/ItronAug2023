package com.example.firstdemowebapp;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet(name="welcomeServlet",value="/welcome")
public class WelcomeServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException {

        response.setContentType("text/html");

        PrintWriter pw=response.getWriter();

        pw.println("<HTML>");
        pw.println("<BODY>");
        pw.println("<H1>Welcome to Newly Created Servlet at "+new Date()+"</H1>");
        pw.println("</BODY>");
        pw.println("</HTML>");
    }
}
