package com.neuq.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.neuq.services.I.IInInfoServices;
import com.neuq.services.Impl.InInfoServicesImpl;

/**
 * Servlet implementation class IncomeAction
 */

public class IncomeAction extends HttpServlet {

	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IncomeAction() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.checkAction(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.checkAction(request, response);
	}
	
	
	public void checkAction(HttpServletRequest request, HttpServletResponse response) {
	  IInInfoServices iis=new InInfoServicesImpl();
	 HttpSession session=request.getSession();

	String action=request.getParameter("action");
	    if (action.equals("deleteAll")) {
	    	
			}
	    
	    if (action.equals("deleteOne")) {
	    	
		}
	    if (action.equals("insert")) {
	    	
	  		}
	    if (action.equals("selectAll")) {
	    	
		}
	    
	    
	    if (action.equals("selectOne")) {
	    	
		}
	    
	    
	    if (action.equals("selectUser")) {
	    	
		}
	    
	    if (action.equals("update")) {
	    	
		}
	}
	
	
	


}
