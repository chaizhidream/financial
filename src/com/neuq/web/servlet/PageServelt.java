package com.neuq.web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.neuq.bean.Paging;
import com.neuq.bean.StockFlow;
import com.neuq.services.I.IStockFlowServices;
import com.neuq.services.Impl.StockFlowServicesImpl;

public class PageServelt extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public PageServelt() {
        super();
     }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		HttpSession session=request.getSession();
		IStockFlowServices isfs=new StockFlowServicesImpl();
		Paging p=(Paging)session.getAttribute("paging"); 
	    int reqnum=Integer.parseInt(request.getParameter("reqNum")); //是请求的页数？？
		p.doPaging(reqnum);//又是另一个p对象
		List<StockFlow> list=isfs.SelectAllStock(p.getStart(), p.getEnd());
		session.setAttribute("SelectAll", list);
		session.setAttribute("currentPage",reqnum);//当前的页数是requnm
		response.sendRedirect("familyAdmin/flow.jsp");
		
	}

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
