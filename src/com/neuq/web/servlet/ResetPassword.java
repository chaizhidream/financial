package com.neuq.web.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neuq.bean.User;
import com.neuq.services.I.ICheckpwdServices;
import com.neuq.services.I.IUserServices;
import com.neuq.services.Impl.CheckpwdServicesImpl;
import com.neuq.services.Impl.UserServicesImpl;
import com.neuq.util.Md5Util;
import com.neuq.util.mail.SendMail;

/**
 * Servlet implementation class ResetPassword
 */

public class ResetPassword extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ResetPassword() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("username");
		String email = request.getParameter("email");

		username = "chai";
		email = "410668027@qq.com";

		ICheckpwdServices icp = new CheckpwdServicesImpl();
		IUserServices ius = new UserServicesImpl();
		User u = null;

		try {
			u = ius.select(username);
			if (u == null) {
				// 用户输入的信息不正确，重定向到输入信息页面
				response.sendRedirect("");
				//return;
	       } else {
				icp.delete(username);
				// 设置日期格式
				SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				// new Date()为获取当前系统时间
				String nowtime = df.format(new Date());
				System.out.println(nowtime);
				// 用用户名+邮箱+当前时间生成md5加密的随机数
				String checkcode = Md5Util.md5(username+nowtime+email);
				// 生成链接
				String url = "http://localhost/financial/Changepassword?username=" + username + "&checkcode="
						+ checkcode + "&time=" + nowtime.hashCode();
				icp.insert(username, checkcode);
				// 生成验证码，调用mail类发送邮件
				SendMail.sendMail(username, email, url);
				// 用户输入的信息正确，重定向到修改密码输入信息提示页面
				response.sendRedirect("index.jsp");
				return;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
