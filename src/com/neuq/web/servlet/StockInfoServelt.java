package com.neuq.web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.neuq.bean.Paging2;

import com.neuq.bean.StockInfo;
import com.neuq.services.I.IStockFlowServices;
import com.neuq.services.I.IStockInfoServices;
import com.neuq.services.Impl.StockFlowServicesImpl;
import com.neuq.services.Impl.StockInfoServicesImpl;



public class StockInfoServelt extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public StockInfoServelt() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		HttpSession session=request.getSession();
		String methodName=request.getParameter("methodName");
	    int method=Integer.parseInt(methodName); //将字符串转为数值
	    String methodName2=request.getParameter("methodName2");
	    int method2=Integer.parseInt(methodName2);
		IStockInfoServices isis=new StockInfoServicesImpl();
		
		if(method==0){ //方式1是查询
			StockInfo si=new StockInfo();
			String username=request.getParameter("username");
			si=isis.SelectStockInfo(username);
			session.setAttribute("StockInfo", si); //查到值传给session
			response.sendRedirect("");
		}
		else if(method==1){ //方式1是添加信息
			boolean b=false;
			String ida=request.getParameter("id");
			int id=Integer.parseInt(ida);
			String username=request.getParameter("username");
			String stockcodea=request.getParameter("stockcode");  
			int stockcode=Integer.parseInt(stockcodea);
			String stockname=request.getParameter("stockname");
			String totalnumbera=request.getParameter("totalnumber");
			int totalnumber=Integer.parseInt(totalnumbera);
			
			StockInfo si=new StockInfo();
			si.setId(id);
			si.setUserName(username);
			si.setStockCode(stockcode);
			si.setStockName(stockname);
			si.setTotalNumber(totalnumber);
			b=isis.InsertShockInfo(si);
			session.setAttribute("check", b); //返回是否已插入
			response.sendRedirect("");
		}
		else if(method==2){//方式2是删除
			boolean b=false;
			String username=request.getParameter("username");
			b=isis.DeleteShockInfo(username);
			session.setAttribute("check", b); //返回是否已删除
			response.sendRedirect("");
		}
		else if(method==3){ //方式3是更新
			boolean b=false;
			String username=request.getParameter("username");
			String totalnumbera=request.getParameter("totalnumber");
			int totalnumber=Integer.parseInt(totalnumbera);
			b=isis.UpdateShockInfo(username, totalnumber);
			session.setAttribute("check", b); //返回是否已更新
			response.sendRedirect("");
		}
		
		
			IStockFlowServices isfs=new StockFlowServicesImpl();
		    //第一页分页逻辑的处理, 这个部分将paging对象p创建出来
		    Paging2 p2=new Paging2(isfs.getStockNum(),4);  //参数是：总行数，每页显示数量 ;isfs调用biz层方法返回总证券股份数量; paging方法计算总页数
		    p2.doPaging2(1);  //1为当前请求的页，reqPage;dopaging方法 计算start和end
		    //将所有证券股票的信息查询出来
		    List<StockInfo> list2=isis.SelectAllStock2(p2.getStart2(), p2.getEnd2());
		    session.setAttribute("SelectAll2",list2);
		    session.setAttribute("paging2", p2);
		    session.setAttribute("currentPage2",1);//当前页数是1
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
 


//待解决问题，等待一个信号进入买入或卖出页面，根据这个信号执行分页跳转到不同页面