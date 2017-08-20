package com.neuq.web.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neuq.bean.User;
import com.neuq.services.Impl.UserServicesImpl;

import javax.servlet.http.Cookie;


/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {

	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
    }

	public void destroy() {
		super.destroy();

	}
	
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		//复用doPost方法
	this.doPost(request, response);
		
	}
	
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获得ServletContext对象

		String uname=request.getParameter("username");
		String upsw=request.getParameter("password");
		String message1 =null;
		String message2 =null;
	UserServicesImpl service=new UserServicesImpl();
		//用户登录
		User user=null;
		int r  = 0;
		try {
			System.out.println("即将进行登录检测");
			user = service.login(uname, upsw);
		
			System.out.println("登录检测完成,即将跳转");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(user != null) {
			r=user.getRu();
	        System.out.print("用户的权限为："+r);
			//登录成功后，就将用户存储到session中
	        Cookie c1 = new Cookie("username",uname);
	        Cookie c2 = new Cookie("password",upsw);
			response.addCookie(c1);
			response.addCookie(c2);
		}
		else{
			 message1 = String.format(
						"对不起，用户名或密码有误！！请重新登录！2秒后为您自动跳到登录页面！");
			 
			 message2 = String.format(
					"<meta http-equiv='refresh' content='0;url=%s'", 
					request.getContextPath()+"/login.jsp");
			request.setAttribute("message1",message1);
			request.setAttribute("message2",message2);
			request.getRequestDispatcher("/message.jsp").forward(request, response);
			return;
		}

		
System.out.println("登录用户不为空，判断权限");

		if (r==1) {
			//跳到管理员界面
			 message1 = String.format(
						"管理员登陆成功！");
			 message2 = String.format(
						"<meta http-equiv='refresh' content='0;url=%s'", 
						request.getContextPath()+"/admin/index.jsp");
			 			request.getSession().setAttribute("admin",user);

		}
		else if(r==2){
			//跳到家庭管理员界面
			 message1 = String.format(
						"家庭管理员登陆成功！");
			 message2 = String.format(
						"<meta http-equiv='refresh' content='0;url=%s'", 
						request.getContextPath()+"/familyAdmin/index.jsp");
			
			  request.getSession().setAttribute("family",user);
	}
		else if(r == 3) {
			System.out.println(user.toString());
			System.out.println("跳到普通用户登录成功页面");
			//跳转到普通用户页面
			 message1 = String.format(
						"普通用户登陆成功！");
			 message2 = String.format(
						"<meta http-equiv='refresh' content='0;url=%s'", 
						request.getContextPath()+"/student/index.jsp");
			
		  request.getSession().setAttribute("normaluser",user);
	}
		request.setAttribute("message2",message2);
		request.setAttribute("message1",message1);
		request.getRequestDispatcher("/message.jsp").forward(request, response);
	}

	}


