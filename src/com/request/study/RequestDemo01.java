package com.request.study;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class RequestDemo01 extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException,IOException{
		String requestUrl = request.getRequestURL().toString();
		String requestUri = request.getRequestURI();
		String queryString = request.getQueryString();
		String remoteSddr = request.getRemoteAddr();
		String remoteHost = request.getRemoteHost();
		int remotePort = request.getRemotePort();
		String remoteUser = request.getRemoteUser();
		String method = request.getMethod();
		String pathInfo = request.getPathInfo();
		String localAddr = request.getLocalAddr();
		String localName = request.getLocalName();
		//response.setCharacterEncoding("UTF-8");
		//response.setHeader("content-type", "text/html;charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		out.write("获取客户机信息如下");
		out.write("<hr/>");
		out.write("请求的URL地址："+requestUrl);
		out.write("<br/>");
		out.write("请求的资源："+requestUri);
		out.write("<br/>");
		out.write("请求的URL地址中附带的参数："+queryString);
		out.write("<br/>");
		out.write("来访者的IP地址："+ remoteSddr);
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
