package com.accolite.au;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet{
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		  try {
			  System.out.println("This is servlet 1\n");
			  String name = req.getParameter("name");
		      String email = req.getParameter("email");
		      System.out.println("Name: "+name+" Email: "+email+"\n");
		      req.setAttribute("name",name);
		      req.setAttribute("email",email);
		      RequestDispatcher rd = req.getRequestDispatcher("Servlet2");
		      rd.forward(req,res);
	      }catch(Exception e) {
	    	  e.printStackTrace();
	      }
	  }
	
	  protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		  try {
			  System.out.println("This is servlet 1\n");
			  String name = req.getParameter("name");
		      String email = req.getParameter("email");
		      System.out.println("Name: "+name+" Email: "+email+"\n");
		      req.setAttribute("name",name);
		      req.setAttribute("email",email);
		      RequestDispatcher rd = req.getRequestDispatcher("Servlet2");
		      rd.forward(req,res);
	      }catch(Exception e) {
	    	  e.printStackTrace();
	      }
	  }
}
