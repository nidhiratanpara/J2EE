package com.js.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value="/login")
public class LoginServlet extends HttpServlet
{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String user=req.getParameter("user");
		String passwd=req.getParameter("passwd");
		
		
		if(user.equals("abc") && passwd.equals("1234"))
		{
		  RequestDispatcher rd = req.getRequestDispatcher("welcome");
		  rd.forward(req,resp);
		}
		else
		{
			PrintWriter out=resp.getWriter();
			out.println("Invalid Credentials");
			RequestDispatcher rd = req.getRequestDispatcher("Login.html");
			rd.include(req, resp);
			
		}
	}

}
