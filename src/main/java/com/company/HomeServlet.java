package com.company;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletOutputStream outputStream = resp.getOutputStream();
        outputStream.print("<h1>Hello world - Codecamp 3</h1>");
        outputStream.print("<h3>This is my first servlet application</h3>");
        outputStream.flush();
        outputStream.close();
    }
}
