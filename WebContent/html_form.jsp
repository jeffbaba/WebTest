<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Html的form表单元素</title>

<fieldset style="width: 500px";>
	<legend>Html的form表单元素</legend>
	<form action="${pageContext.request.contextPath}/servletRequest03" method="post" >
	编号：
	<input type="text" name="userid" value="NO." size="2" maxlength="2"><br>
	
	用户名：
	<input type="text" name="username" value="请输入用户名"><br>
	
	密码：
	<input type="password" name="userpass" value="请输入密码"><br>
	
	性别：
	<input type="radio" name="sex" value="男" checked="checked">男
	<input type="radio" name="sex" value="女">女<br>
	
	部门：
	<select name="dept">
		<option value="技术部">技术部</option>
		<option value="销售部">销售部</option>
		<option value="财务部">财务部</option>
	</select><br>
	
	兴趣：
	<input type="checkbox" name="inst" value="唱歌">唱歌
	<input type="checkbox" name="inst" value="游泳">游泳
	<input type="checkbox" name="inst" value="跳舞">跳舞
	<input type="checkbox" name="inst" value="编程" checked="checked">编程
	<input type="checkbox" name="inst" value="上网">上网
	<input type="checkbox" name="inst" value="篮球">篮球
	<br>
	
	说明：
	<textarea name="note" rows="5" cols="34"></textarea>
	<br>
	
	<input type="hidden" name="hiddenField" value="hiddenvalue">
	
	<input type="submit" value="提交">
	
	<input type="reset" value="重置">
	</form>



</fieldset>
</head>
<body>

</body>
</html>