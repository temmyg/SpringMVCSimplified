package com.southwind.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

import static java.lang.System.out;

public class RawTextServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        out.printf("doGet %s %s called %n", "MyDispatcherServlet1", "MyDispatcherServlet2");

        PrintWriter out = resp.getWriter();
        out.format("<html><body><h1>Mountain has a cave for the wolf!!</h1></body></html>");
    }
}
