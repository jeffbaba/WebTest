package com.servlet.study;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@SuppressWarnings("serial")
public class ServletConfigDemo1 extends HttpServlet {
	
    private ServletConfig config;
     
    public void init(ServletConfig config) throws ServletException {
		this.config = config;
	} 
   

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("处理Get()请求...");
		PrintWriter out = response.getWriter();
		String paramVal = this.config.getInitParameter("name");
		response.getWriter().print(paramVal);
		out.println("</hr>");
		
		
		Enumeration<String> e = config.getInitParameterNames();
		while (e.hasMoreElements()) {
			String name = (String) e.nextElement();
			String value = config.getInitParameter(name);
			response.getWriter().print(name + "=" + value + "</br>");
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(request, response);
	}

}
