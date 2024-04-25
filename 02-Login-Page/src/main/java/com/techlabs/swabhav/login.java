package com.techlabs.swabhav;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class login extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		var username = request.getParameter("username");
		String password = request.getParameter("password");
		if(username.equalsIgnoreCase("niketmishra436@gmail.com") && password.equals("niket123")) {
			
			response.setHeader("Location", "LoginSuccessful.html" );
	          response.sendRedirect("LoginSuccessful.html");
		} else {
			response.setHeader("Location", "LoginFailed.html" );
	          response.sendRedirect("LoginFailed.html");
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
