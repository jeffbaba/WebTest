package com.servlet.study;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class webTest
 */

public class webTest extends HttpServlet {
	
	int i=1;
	public void doGet(HttpServletRequest request,HttpServletResponse response)
			throws ServletException, IOException{
		
		synchronized (this) {
			i++;
			try {
				Thread.sleep(1000*4);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			response.getWriter().write(i+"");
		}
		}
		
	
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		doGet(request, response);
		
	}
	
}
