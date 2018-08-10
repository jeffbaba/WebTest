package com.response.study;

import java.io.IOException;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@SuppressWarnings("serial")
public class CheckServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException,IOException{
		System.out.println("Hi");
		String clientCheckcode = request.getParameter("validateCode");
		String serverCheckcode = (String) request.getSession().getAttribute("checkcode");
		if (clientCheckcode.equals(serverCheckcode)) {
			System.out.println("验证码验证通过");
		}else {
			System.out.println("验证码验证失败");
		}
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
