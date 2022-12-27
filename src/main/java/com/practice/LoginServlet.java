package com.practice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
//    public LoginServlet() {
//        super();
//    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	public void init(ServletConfig config) {
        System.out.println("Log in Servlet is being initialized");
    }
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
        PrintWriter writer = response.getWriter();
        writer.println("<html>Hello, I am a Java LogIn rvlet!</html>");
        writer.flush();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userNameString = request.getParameter("username");
		String passwordString = request.getParameter("password");
		
		PrintWriter writer = response.getWriter();
		writer.println("<html>Your UserName is "+ userNameString+"</html>");
		writer.println("<html> <br /> Your Password is "+ passwordString+"</html>");
		writer.flush();

	}

}
