package com.practice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MyServlet extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void init(ServletConfig config) {
        System.out.println("Area Servlet is being initialized");
    }
 
    /**
     * handles HTTP GET request
     */
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
 
        PrintWriter writer = response.getWriter();
        writer.println("<html>Hello, I am a Java Calculate servlet!</html>");
        writer.flush();
    }
 
    /**
     * handles HTTP POST request
     */
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, NumberFormatException {
        String paramWidth = request.getParameter("width");
        int width = Integer.parseInt(paramWidth);
 
        String paramHeight = request.getParameter("height");
        int height = Integer.parseInt(paramHeight);
 
        int area = width * height;
 
        PrintWriter writer = response.getWriter();
        writer.println("<html>Area of the rectangle is: " + area + "</html>");
        writer.flush();
 
    }
 
    /**
     * this life-cycle method is invoked when the application or the server
     * is shutting down
     */
    @Override
    public void destroy() {
        System.out.println("Servlet is being destroyed");
    }
}
