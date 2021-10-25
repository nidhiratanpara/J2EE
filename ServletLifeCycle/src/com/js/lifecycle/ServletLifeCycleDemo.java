package com.js.lifecycle;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServletLifeCycleDemo extends GenericServlet
{

	public ServletLifeCycleDemo() 
	{
         System.out.println("Instaniation Phase");
	}
	
	@Override
	public void init() throws ServletException
	{
		//super.init();
		System.out.println("Initialization Phase");
	}
	
	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException 
	{
		
		String name= req.getParameter("nm");
		
		resp.setContentType("text/html");
		
		PrintWriter out =resp.getWriter();
		
		out.println("Welcome :"+name);
		
		
		System.out.println("Service Phase");
		
		//destroy();
		out.flush();
		
	}
	
	@Override
	public void destroy()
	{
		//super.destroy();
		System.out.println("Destruction Phase");
		System.out.println("Close all Costly Resources");
	}

}
