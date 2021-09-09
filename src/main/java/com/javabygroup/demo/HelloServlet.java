package com.javabygroup.demo;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws  IOException {
        doPost(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws  IOException {
        response.setContentType("text/html");

        try (PrintWriter out = response.getWriter()) {
            out.println("<h1>Hello World!</h1>");
        }
    }

    public void destroy() {
    }
}