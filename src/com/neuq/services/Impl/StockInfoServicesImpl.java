package com.neuq.services.Impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;


import com.neuq.bean.StockInfo;
import com.neuq.dao.I.IStockInfoDao;
import com.neuq.dao.Impl.StockInfoDaoImpl;
import com.neuq.db.DBUtil;
import com.neuq.services.I.IStockInfoServices;

public class StockInfoServicesImpl implements IStockInfoServices {
    IStockInfoDao isi=new StockInfoDaoImpl();
	
	//根据用户名查询持股信息
	public StockInfo SelectStockInfo(String username) {
		Connection con=DBUtil.getConnection();
		StockInfo si=new StockInfo();
		try {
			si=isi.SelectStockInfo(username, con);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return si;
	}

	//新建持股信息
	public boolean InsertShockInfo(StockInfo si) {
		Connection con=DBUtil.getConnection();
		boolean b=false;
		try {
			b=isi.InsertShockInfo(si, con);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return b;
	}

	//根据用户名删除持股信息
	public boolean DeleteShockInfo(String username) {
		Connection con=DBUtil.getConnection();
		boolean b=false;
		try {
			b=isi.DeleteShockInfo(username, con);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return b;
	}

	//根据用户名修改持股信息
	public boolean UpdateShockInfo(String username, int totalnumber) {
		Connection con=DBUtil.getConnection();
		boolean b=false;
		try {
			b=isi.UpdateShockInfo(username, con, totalnumber);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{ 
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return b;
	}

	//分页查询所有持股信息
	public List<StockInfo> SelectAllStock2(int start2, int end2) {
		Connection con=DBUtil.getConnection(); 
		List<StockInfo> list2=null;
		try {
			list2=isi.SelectAllStock2(start2, end2, con);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}return list2;
}
	}
