package com.neuq.services.Impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import com.neuq.bean.StockFlow;
import com.neuq.dao.I.IStockFlowDao;
import com.neuq.dao.Impl.StockFlowDaoImpl;
import com.neuq.db.*;
import com.neuq.services.I.IStockFlowServices;

public class StockFlowServicesImpl implements IStockFlowServices{
    IStockFlowDao isf=new StockFlowDaoImpl();
	
    //根据用户名查询证券股票流水信息
	public StockFlow SelectStockFlow(String username) {
		Connection con=DBUtil.getConnection();
		StockFlow sf=new StockFlow();
		try {
			sf=isf.SelectStockFlow(username, con);//调用StockFlowDaoImpl类的SelectStockFlow（）方法，有返回值
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return sf;
	 }

	//插入证券股票流水信息
	public boolean InsertShockFlow(StockFlow sf) {
		Connection con=DBUtil.getConnection();
		boolean b=false;
		try {
			b=isf.InsertShockFlow(sf, con);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				con.close( );
			} catch (SQLException e) {  
				e.printStackTrace();
			}
		}
		return b;   
	}

	//根据用户名删除证券股票流水信息
	public boolean DeleteShockFlow(String username) {
		Connection con=DBUtil.getConnection();
		boolean b=false;
		try {
		    b=isf.DeleteShockFlow(username, con); 
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				con.close( );
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return b;
	}

	//根据用户名修改证券股票流水信息
	public boolean UpdateShockFlow(String username, int stocknumber, int buyOrsell, Date transactiontime,
			double transactionprince) {
		Connection con=DBUtil.getConnection();
		boolean b=false;
		try {
			b=isf.UpdateShockFlow(username, con, stocknumber, buyOrsell, transactiontime, transactionprince);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				con.close( );
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return b;
	}

	//分页查询所有证券股票流水信息
	public List<StockFlow> SelectAllStock(int start, int end) {
		Connection con=DBUtil.getConnection(); 
		List<StockFlow> list=null;
		try {
			list=isf.SelectAllStock(start, end, con);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				con.close( );
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	//查询一共有多少种证券股票
	public int getStockNum() {
		int num=0;
		Connection con=DBUtil.getConnection();
		    try {
				num=isf.getStockNum(con);
			} catch (Exception e1) {
				e1.printStackTrace();
			}finally {
				try {
			con.close( );
		} catch (SQLException e) {
			 e.printStackTrace();
		}
			}
		return num;
	}

}
