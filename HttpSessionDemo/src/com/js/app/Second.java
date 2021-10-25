package com.js.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(value="/ss")
public class Second extends HttpServlet
{
   @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
   {
	 HttpSession s = req.getSession();
	 String txt=(String)s.getAttribute("nm");
	 
	 PrintWriter out = resp.getWriter();
	 out.print("Session Data :"+txt);
	 out.flush();
	 out.close();
   }
}
