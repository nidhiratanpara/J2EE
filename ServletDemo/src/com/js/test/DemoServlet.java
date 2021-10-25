package com.js.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(value="/xyz",loadOnStartup=2)
public class DemoServlet extends GenericServlet
{
	

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException 
	{
         String name= req.getParameter("nm");
         
         resp.setContentType("text/html");
         
         PrintWriter out = resp.getWriter();
         
         out.println("Welcome :"+name);
         
         out.flush();
         
         out.close();
         
	}
   
}
