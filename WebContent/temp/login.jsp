<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登陆</title>
<style type="text/css">
	.error {
		color: red;
		padding-left:2px;
	}
</style>
</head>
<body>
	<form action="${pageContext.request.contextPath}/login" method="post">
		<span class="error" style="display: block;">${errors.loginError}</span>
		用户名：<input type="text" name="userName" value="${param.userName}"><span class="error">${errors.userName}</span><br/>
		密码：<input type="password" name="password"><span class="error">${errors.password}</span><br/>
		<input type="submit" value="登录">&nbsp;
		<a href="${pageContext.request.contextPath}/forgotPwdUI">忘记密码？</a>&nbsp;
		<a href="${pageContext.request.contextPath}/registerUI">注册</a>
	</form>
</body>
</body>
</html>