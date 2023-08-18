package com.example.userinputwebapp;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        String name=request.getParameter("username");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1> Welcome " + name + " to the world of web app!</h1>");
        out.println("</body></html>");
    }


}