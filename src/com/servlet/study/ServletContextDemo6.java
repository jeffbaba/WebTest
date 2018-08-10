package com.servlet.study;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.text.MessageFormat;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;





@SuppressWarnings("serial")
public class ServletContextDemo6 extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		response.setHeader("content-type", "text/html;charset=UTF-8");
		response.getWriter().println("<hr/>");
		readPropCfgFile(response);
		response.getWriter().println("<hr/>");
	}
	private void readPropCfgFile(HttpServletResponse response)
			throws FileNotFoundException, IOException{
		String path = this.getServletContext().getRealPath("/WEB-INF/classes/db/config/db.properties");
		InputStream in = new FileInputStream(path);
		Properties prop = new Properties();
		prop.load(in);
		String driver = prop.getProperty("driver");
		String url = prop.getProperty("url");
		String username = prop.getProperty("username");
		String password = prop.getProperty("password");
		response.getWriter().println("读取src目录下的db.config包中的db.properties配置文件");
		response.getWriter().println(
				MessageFormat.format("driver={0},url={1},username={2},password={3}",
										driver,url,username,password));
		
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(request, response);
	}

}
