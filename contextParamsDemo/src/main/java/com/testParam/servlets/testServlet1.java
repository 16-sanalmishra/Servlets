package com.testParam.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/testServlet1")
public class testServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public testServlet1() {
        super();
    }
    PrintWriter out;
    RequestDispatcher rd;
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");  
		out = response.getWriter();
		
		String s1 = request.getParameter("fName");
		String s2 = request.getParameter("lName");
		
		if(s1 != null && s2 != null && (s1.trim().length())>0 && (s2.trim().length()>0)){
			out.println("<h2>Hii Welcome To The Details Page...!!!</h2>");
			out.println("<h3>Hurray Check Successfull</h3>");
			out.println("Hii " + request.getParameter("fName") + " " + request.getParameter("lName"));
		}
		else {
			out.println("Sorry You Entered Wrong Info..!!!");
			rd = request.getRequestDispatcher("/testingServet.html");
			rd.include(request, response);
			
		}
		
	}



}
