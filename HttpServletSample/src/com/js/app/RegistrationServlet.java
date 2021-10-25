package com.js.app;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value="/res")
public class RegistrationServlet extends HttpServlet
{
     @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
     {
    	Enumeration<String>keys=req.getParameterNames();
    	
    	int i=0;
    	String stu[]=new String[3];
    	while(keys.hasMoreElements())
    	{
    		String key=keys.nextElement();
    		stu[i++]=req.getParameter(key);
    		
    	}
    	
    	
    	String name=null;
    	String phno=null;
    	double per=0.0;
    	
    	for (int j = 0; j < stu.length; j++) 
    	{
			 if(j==0)
			   name=stu[j];
			 else if(j==1)
		       phno=stu[j];
			 else
			 {
				per=Double.parseDouble(stu[j]);
			 }
    	} 
    	
    	// JDBC 
    	
    	Connection con=null;
    	PreparedStatement pstmt=null;
    	
    	try 
    	{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Loaded");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student?user=root&password=dinga");
			System.out.println("Connection Created");
			pstmt=con.prepareStatement("Insert into tblstudent values(?,?,?)");
			System.out.println("Statement Created");
			pstmt.setString(1,name);
			pstmt.setString(2,phno);
			pstmt.setDouble(3,per);
			int aff=pstmt.executeUpdate();
			if(aff>0)
			{
				System.out.println("Saved");
			}
		} catch (ClassNotFoundException | SQLException e)
    	{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	finally 
    	{
		  if(pstmt!=null)
			try {
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
    	
    	
     }
}
