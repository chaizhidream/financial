package com.neuq.web.servelt;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.neuq.bean.Paging;
import com.neuq.bean.Paging2;
import com.neuq.bean.StockInfo;
import com.neuq.services.I.IStockInfoServices;
import com.neuq.services.Impl.StockInfoServicesImpl;


public class PageServelt2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public PageServelt2() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
	    int method2=Integer.parseInt(request.getParameter("methodName2"));
		int reqnum2=Integer.parseInt(request.getParameter("reqNum2"));
		HttpSession session=request.getSession();
		Paging2 p2=(Paging2)session.getAttribute("paging2");     //"Paging2在哪儿？？？"
		p2.doPaging2(reqnum2);
		IStockInfoServices isis=new StockInfoServicesImpl();
		List<StockInfo> list2=isis.SelectAllStock2(p2.getStart2(), p2.getEnd2());
		session.setAttribute("SelectAll2", list2);
		session.setAttribute("currentPage2",reqnum2);
		if(method2==0){
		    response.sendRedirect("familyAdmin/buying.jsp"); //响应发出重定向
		    }
		    else if(method2==1){
		    response.sendRedirect("familyAdmin/selling.jsp");
		    }
	 }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
