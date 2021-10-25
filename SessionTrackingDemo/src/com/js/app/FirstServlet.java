package com.js.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value="/first")
public class FirstServlet extends HttpServlet
{
   @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
   {
	  String id=req.getParameter("nm");
	  Cookie ck = new Cookie(id,"Track Id");
	  resp.addCookie(ck);
	  
	  PrintWriter out= resp.getWriter();
	  out.println("<a href='ss'>Second</a>");
	  System.out.println(id);
	  out.flush();
	  out.close();
	  
  }
}
