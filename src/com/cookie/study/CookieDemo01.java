package com.cookie.study;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
public class CookieDemo01 extends HttpServlet {
	@SuppressWarnings("deprecation")
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException,IOException{
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		Cookie[] cookies = request.getCookies();
		
		if (cookies != null) {
			out.write("您上次访问的时间是：");
			for(int i = 0; i < cookies.length; i++) {
				System.out.println(cookies.length);
				Cookie cookie = cookies[i];
				if (cookie.getName().equals("lastAccessTime")) {
					Long lastAccessTime = Long.parseLong(cookie.getValue());
					Date date = new Date(lastAccessTime);
					out.write(date.toLocaleString());
					
				}
			}
		}else {
			out.write("这是您第一次访问本站");
		}
		
		Cookie cookie = new Cookie("lastAccessTime", System.currentTimeMillis()+"");
		response.addCookie(cookie);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
