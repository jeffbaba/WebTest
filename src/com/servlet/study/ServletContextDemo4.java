package com.servlet.study;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
public class ServletContextDemo4 extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		String data = "<h1><font color='red'>zhangyewansui</font></h1>";
		response.getOutputStream().write(data.getBytes());
		ServletContext context = this.getServletContext();
		RequestDispatcher rd = context.getRequestDispatcher("/servletContext5");
		
		rd.forward(request, response);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
