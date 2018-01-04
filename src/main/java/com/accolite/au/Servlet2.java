package com.accolite.au;

import java.io.IOException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet{
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		  try {
			  System.out.println("This is servlet 2\n");
			  String name = (String)req.getAttribute("name");
		      String email = (String)req.getAttribute("email");
		      System.out.println("Name: "+name+"\nEmail: "+email);
		      MyConnection var = MyConnection.getConnection();
		      String query = new String("insert into servlet_streams_exercises values('" + name + "','" + email + "')");
	    	  Statement stmt = var.con.createStatement();
		      stmt.executeUpdate(query);
	    	  var.con.close();
	      }catch(Exception e) {
	    	  e.printStackTrace();
	      }
	  }
	
	  protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		  try {
			  System.out.println("This is servlet 2\n");
			  String name = (String)req.getAttribute("name");
		      String email = (String)req.getAttribute("email");
		      System.out.println("Name: "+name+"\nEmail: "+email);
		      MyConnection var = MyConnection.getConnection();
		      String query = new String("insert into servlet_streams_exercises values('" + name + "','" + email + "')");
		      Statement stmt = var.con.createStatement();
		      stmt.executeUpdate(query);
	    	  var.con.close();
	      }catch(Exception e) {
	    	  e.printStackTrace();
	      }
	  }
}
