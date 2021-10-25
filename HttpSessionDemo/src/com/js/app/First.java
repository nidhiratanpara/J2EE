package com.js.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(value="/fs")
public class First extends HttpServlet
{
  @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
  {
	String txt=req.getParameter("nm");
	HttpSession s = req.getSession();
	
	s.setAttribute("nm",txt);
	PrintWriter out =resp.getWriter();
	out.println("<a href='ss'>Second</a>");
    out.flush();
    out.close();
   }
}
