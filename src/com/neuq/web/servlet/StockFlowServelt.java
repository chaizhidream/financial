package com.neuq.web.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.bind.ParseConversionEvent;

import com.neuq.bean.Paging;
import com.neuq.bean.StockFlow;
import com.neuq.services.I.IStockFlowServices;
import com.neuq.services.Impl.StockFlowServicesImpl;

    public class StockFlowServelt extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public StockFlowServelt() {
        super();
        
    }

	
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		HttpSession session=request.getSession();
		String methodName=request.getParameter("methodName");
	    int method=Integer.parseInt(methodName); //将字符串转为数值
		IStockFlowServices isfs=new StockFlowServicesImpl();
		
		if(method==0){ //方式1是查询
			StockFlow sf=new StockFlow();
			String username=request.getParameter("username");
			sf=isfs.SelectStockFlow(username); //调用services层查询信息，返回值是对象
			session.setAttribute("StockFlow", sf); //查到值传给session
			response.sendRedirect("");           //请求转发
		 }
		else if (method==1) { //方式1是添加信息
			boolean b=false;
			String ida=request.getParameter("id");
			int id=Integer.parseInt(ida);
			String username=request.getParameter("username");
			String stockcodea=request.getParameter("stockcode");  
			int stockcode=Integer.parseInt(stockcodea);
			String stockname=request.getParameter("stockname");
			String stocknumbera=request.getParameter("stocknumber");  
			int stocknumber=Integer.parseInt(stocknumbera);
			String buyOrsella=request.getParameter("buyOrsell");  
			int buyOrsell=Integer.parseInt(buyOrsella);
			String transactiontimea=request.getParameter("transactiontime");
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy.mm.dd");//SimpleDateFormat中的parse方法将string字符串转成特定格式的date类型
			Date transactiontime = null;
			try {
				transactiontime = sdf.parse(transactiontimea);
			} catch (ParseException e) {
			    e.printStackTrace();
			}
		    String transactionprincea=request.getParameter("transactionprince");
			double transactionprince=Double.parseDouble(transactionprincea);
			
			StockFlow sf=new StockFlow();
			sf.setId(id);
			sf.setUserName(username);
			sf.setStockCode(stockcode);
			sf.setStockName(stockname);
			sf.setStockNumber(stocknumber);
			sf.setBuyOrSell(buyOrsell);
			sf.setTransactionTime(transactiontime);
			sf.setTransactionPrince(transactionprince);
			b=isfs.InsertShockFlow(sf); //调用services层的插入方法
			session.setAttribute("check", b); //返回是否已插入
			response.sendRedirect("");
		}
		else if(method==2){//方式2是删除
			boolean b=false;
			String username=request.getParameter("username");
			b=isfs.DeleteShockFlow(username);
			session.setAttribute("check", b); //返回是否已删除
			response.sendRedirect("");
		}
		else if(method==3){ //方式3是更新
			boolean b=false;
			String username=request.getParameter("username");
			String stocknumbera=request.getParameter("stocknumber");  
			int stocknumber=Integer.parseInt(stocknumbera);
			String buyOrsella=request.getParameter("buyOrsell");  
			int buyOrsell=Integer.parseInt(buyOrsella);
			String transactiontimea=request.getParameter("transactiontime");
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy.mm.dd");//SimpleDateFormat中的parse方法将string字符串转成特定格式的date类型
			Date transactiontime = null;
			try {
				transactiontime = sdf.parse(transactiontimea);
			} catch (ParseException e) {
			    e.printStackTrace();
			}
		    String transactionprincea=request.getParameter("transactionprince");
			double transactionprince=Double.parseDouble(transactionprincea);
			b=isfs.UpdateShockFlow(username, stocknumber, buyOrsell, transactiontime, transactionprince);
			session.setAttribute("check", b); //返回是否已更新
			response.sendRedirect("");
		}
		else{
			//第一页分页逻辑的处理, 这个部分将paging对象p创建出来
		    Paging p=new Paging(isfs.getStockNum(),4);  //参数是：总行数，每页显示数量 ;isfs调用biz层方法返回总证券股份数量; paging方法计算总页数
		    p.doPaging(1);  //1为当前请求的页，reqPage=repP;dopaging方法 计算start和end
		    
		    //将所有证券股票的信息查询出来
		    List<StockFlow> list=isfs.SelectAllStock(p.getStart(), p.getEnd());
		    session.setAttribute("SelectAll",list);
		    session.setAttribute("paging", p);
		    session.setAttribute("currentPage",1);   //当前页数是1
		    response.sendRedirect("familyAdmin/flow.jsp"); //响应发出重定向
		}
    }

	
	 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		doGet(request, response);
	}


    }
  

