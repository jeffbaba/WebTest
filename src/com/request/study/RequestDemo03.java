package com.request.study;

import java.io.IOException;
import java.text.MessageFormat;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestDemo03 extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException,IOException{
		request.setCharacterEncoding("UTF-8");
		Map<String, String[]> paramMap = request.getParameterMap();
		for (Map.Entry<String, String[]> entry :paramMap.entrySet()) {
			String paramName = entry.getKey();
			String paramValue = "";
			String[] paramValueArr = entry.getValue();
			for(int i = 0; paramValueArr!=null && i < paramValueArr.length; i++) {
				if (i == paramValueArr.length-1) {
					paramValue+=paramValueArr[i];
				}else {
					paramValue+=paramValueArr[i]+",";
				}
				
			}
			System.out.println(MessageFormat.format("{0}={1}", paramName,paramValue));
		}
		
//		String userid = request.getParameter("userid");
//		String username= request.getParameter("username");
//		String userpass= request.getParameter("userpass");
//		String sex= request.getParameter("sex");
//		String dept= request.getParameter("dept");
//		
//		String[] insts = request.getParameterValues("inst");
//		String note = request.getParameter("note");
//		String hiddenField = request.getParameter("hiddenField");
//		
//		String instStr="";
//		
//		/**
//		 * 获取数组数据的技巧，可以避免insts数组为null时引发的空指针异常错误
//		 */
//		
//		for(int i = 0; insts!=null && i<insts.length; i++) {
//			if (i == insts.length-1) {
//				instStr+=insts[i];
//			}else {
//				instStr+=insts[i]+",";
//			}
//		}
//		
//		String htmlStr = "<table>" +
//							"<tr><tr>填写的编号：</td> <td>{0}</td> </tr>" +
//							"<tr><tr>填写的用户名：</td> <td>{1}</td> </tr>" +
//							"<tr><tr>填写的密码：</td> <td>{2}</td> </tr>" +
//							"<tr><tr>选中的性别：</td><td>{3}</td></tr>" +
//							"<tr><tr>选中的部门：</td><td>{4}</td></tr>" +
//							"<tr><tr>选中的兴趣：</td><td>{5}</td></tr>" +
//							"<tr><tr>填写的说明：</td><td>{6}</td></tr>" +
//							"<tr><tr>影藏域的内容：</td><td>{7}</td></tr>" +
//						"</table>";
//		htmlStr = MessageFormat.format(htmlStr, userid,username,userpass,sex,dept,instStr,note,hiddenField);
//		
//		response.setCharacterEncoding("UTF-8");
//		response.setContentType("text/html;charset=UTF-8");
//		response.getWriter().write(htmlStr);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
