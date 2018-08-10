package com.response.study;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * @author Jeff
 * 文件下载
 */

@SuppressWarnings("serial")
public class ResponseDemo02 extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException,IOException{
		//1.获取要下载文件的绝对路径
		String realPath = this.getServletContext().getRealPath("/download/2005.jpg"); 
		//2.获取要下载的文件名
		String fileName = realPath.substring(realPath.lastIndexOf("\\")+1);
		//3.设置content-disposition响应头控制浏览器以下载的形式打开文件
		response.setHeader("content-disposition", "attachment;filename="+fileName);
		//4.获取要下载文件的输入流
		InputStream in = new FileInputStream(realPath);
		int len = 0;
		//5.创建数据缓存区
		byte[] buffer = new byte[1024];
		//6.通过response对象获取OutputStream流
		OutputStream out = response.getOutputStream();
		//7.将FileInputStream流写入到buffer缓冲区
		while ((len = in.read(buffer))>0) {
			//8. 使用OutputStream将缓冲区中的数据输出到客户端浏览器
				out.write(buffer,0,len);
		}
		in.close();
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
