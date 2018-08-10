package com.servlet.study;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletDemo
 */
@SuppressWarnings("serial")
@WebServlet("/ServletDemo")
public class ServletDemo extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException,IOException {
		String data = "jsifjoiewjfoiewhjroijew";
		response.setDateHeader("expires", System.currentTimeMillis() + 24 * 3600 * 1000);
		response.getOutputStream().write(data.getBytes());;
	}
       
    
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(request, response);
	}

}
