package com.js.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(value="/welcome")
public class DisplayServlet extends HttpServlet
{
   @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
   {
	  String name=req.getParameter("user");
	  
	  PrintWriter out = resp.getWriter();
	  
	  out.println("Welcome to Jspiders Mr. "+name);
	  out.println("<a href='test'>Test</a>");
	  out.flush();
	  out.close();
   }
}
