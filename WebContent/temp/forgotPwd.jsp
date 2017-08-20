<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>重设密码申请</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/forgotPwd" method="post">
		<span style="color: red">${requestScope.sendMailMsg}</span>
		用户名/邮箱：<input type="text" name="userNameOrEmail" /><span style="color: red">${requestScope.errorMsg}</span><br/>
		<input type="submit" value="提交" /><a href=""></a>
	</form>
</body>
</html>