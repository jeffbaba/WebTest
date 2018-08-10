package com.response.study;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ResponseDemo01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public void doGet(HttpServletRequest request, HttpServletResponse response)
    		throws ServletException,IOException{
		outputOneByOutputStream(response);
	}
	
	public void outputOneByOutputStream(HttpServletResponse response)throws IOException {
		response.setHeader("content-type", "text/html;charset=UTF-8");
		OutputStream outputStream = response.getOutputStream();
		outputStream.write("使用outputStream流输出数字：".getBytes("UTF-8"));
		//outputStream.write(1);
		outputStream.write((1+"").getBytes());
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
