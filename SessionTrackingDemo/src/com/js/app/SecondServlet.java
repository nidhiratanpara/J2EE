package com.js.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value="/ss")
public class SecondServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
    	Cookie ck[]=req.getCookies();
    	
    	String name=ck[0].getName();
    	String value=ck[0].getValue();
    	
    	PrintWriter out=resp.getWriter();
    	out.println("Name :"+name+" Value :"+value);
    	out.flush();
    	out.close();
    }
}
