package com.neuq.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neuq.bean.User;
import com.neuq.services.I.IUserServices;
import com.neuq.services.Impl.UserServicesImpl;



/**
 * Servlet implementation class changePassword
 */
public class ChangePassword extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChangePassword() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);	
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setHeader("Content-type", "text/html;charset=UTF-8");  
		response.setCharacterEncoding("UTF-8");
		User u=(User)request.getSession().getAttribute("user");
		int r=u.getRu();
		System.out.println(r);
	//	String uname=request.getParameter("username");
		String uname=u.getUsername();
	//	String upsw=request.getParameter("passwordOld");
		String upsw01=request.getParameter("password");
	//	String upsw02=request.getParameter("password2");
	

		IUserServices service = new UserServicesImpl();
		try {
			//用户类要添加修改密码的方法
			service.changePassword(uname, upsw01);
			u.setPassword(upsw01);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
		
//		if(user==null){
//			 message = String.format(
//					"对不起，原输入密码有误！！请重新输入！<meta http-equiv='refresh' content='2;url=%s'", 
//					request.getContextPath()+"/login.jsp");
//			request.setAttribute("message",message);
//			request.getRequestDispatcher("/message.jsp").forward(request, response);
//			return;
//		}
		
		

		//用户登录
	//	System.out.println(new UserImpl().changePassword(uname, upsw01));
	     //	user.setPsd(upsw01);
		//user.setPasswordOld(upsw);
		//	service.update(user);
		
		//修改成功后，就将用户存储到session中
		request.getSession().setAttribute("user", u);
		//int r=user.getRu();
         //System.out.print(r);
		if (r==1) {
			//跳到管理员界面
			 PrintWriter out = response.getWriter();  
		        out.println("<html>");      
		        out.println("<script>");      
		        out.println("alert('修改成功!');");      
		        out.println("window.open ('"+request.getContextPath()+"/admin/index.jsp','_top')");      
		        out.println("</script>");      
		        out.println("</html>");    
		        return; 
		} else {
			//跳到普通用户界面
			 PrintWriter out = response.getWriter();  
		        out.println("<html>");      
		        out.println("<script>");      
		        out.println("alert('修改成功!');");      
		        out.println("window.open ('"+request.getContextPath()+"/user/index.jsp','_top')");      
		        out.println("</script>");      
		        out.println("</html>");    
		        return; 
		}
		
		
		
		
		
		
		
	}

}
