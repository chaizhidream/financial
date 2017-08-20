package com.neuq.web.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neuq.bean.User;

import com.neuq.services.I.IUserServices;
import com.neuq.services.Impl.UserServicesImpl;

import com.neuq.util.EmailUtils;

/**
 * 发送重设密码申请的链接
 */
public class ForgotPwdServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userNameOrEmail = request.getParameter("userNameOrEmail");
	IUserServices ius=new UserServicesImpl();
		User user=null;
		try {
			user = ius.findUser(userNameOrEmail);
		} catch (SQLException e) {
			e.printStackTrace();
		}
						
		if (user == null) {
			request.setAttribute("errorMsg", userNameOrEmail + "，不存在！");
			request.getRequestDispatcher("/forgotPwd.jsp").forward(request, response);
			return;
		}
		
		// 发送重新设置密码的链接
		
		
		EmailUtils.sendResetPasswordEmail(user);
		
		request.setAttribute("sendMailMsg", "您的申请已提交成功，请查看您的"+user.getEmail()+"邮箱。");
		
		request.getRequestDispatcher("/forgotPwdSuccess.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
