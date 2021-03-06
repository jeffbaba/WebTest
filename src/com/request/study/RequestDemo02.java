package com.request.study;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class RequestDemo02 extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException,IOException{
		response.setCharacterEncoding("UTF-8");
		response.setHeader("content-type","text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		Enumeration<String> reqHeaderInfos = request.getHeaderNames();
		out.write("获取客户端所有的请求头信息如下：");
		out.write("<hr/>");
		while (reqHeaderInfos.hasMoreElements()) {
			String headName = (String) reqHeaderInfos.nextElement();
			String headValue = request.getHeader(headName);
			out.write(headName+":"+headValue);
			out.write("<br/>");
		}
		out.write("<br/>");
		out.write("获取客户端Accept-Encoding请求头的值：");
		out.write("<hr/>");
		String value = request.getHeader("Accept-Encoding");
		out.write(value);
		
		Enumeration<String> e = request.getHeaders("Accept-Encoding");
		while (e.hasMoreElements()) {
			String string = (String) e.nextElement();
			System.out.println(string);
		}
		
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
