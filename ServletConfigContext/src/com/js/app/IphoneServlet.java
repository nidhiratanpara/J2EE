package com.js.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class IphoneServlet extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException
	{
        ServletConfig config= getServletConfig();
		
		String dis1=config.getInitParameter("discount");
		
		ServletContext context= getServletContext();
		
		String dis2= context.getInitParameter("discount");
		
		resp.setContentType("text/html");
		
		PrintWriter out =resp.getWriter();
		
		out.println("Electronics Product Discount :"+dis2+" Addtional discount :"+dis1);
	
	    out.flush();
	    out.close();
	}

}
