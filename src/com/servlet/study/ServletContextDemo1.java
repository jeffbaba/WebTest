package com.servlet.study;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
public class ServletContextDemo1 extends HttpServlet {
	
   
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		String data = "zhangye";
		
		ServletContext context = this.getServletConfig().getServletContext();
		context.setAttribute("data", data);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
