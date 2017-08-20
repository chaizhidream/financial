package com.neuq.dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


import com.neuq.bean.StockInfo;
import com.neuq.dao.I.IStockInfoDao;

public class StockInfoDaoImpl implements IStockInfoDao{

	//根据用户名查询持股信息
	public StockInfo SelectStockInfo(String username, Connection con) throws Exception {
		PreparedStatement pr=null;
		ResultSet rs=null;
		StockInfo si=new StockInfo();
		String sql="Select * from StockInfo where username=?";
	    pr=con.prepareStatement(sql); //获取preparestatement
		pr.setString(1, username);  //对SQL语句的第一个占位符赋值
		rs=pr.executeQuery();  //发送SQL语句，执行查询操作，返回结果集
		if(rs.next()){
			si.setId(rs.getInt(1));
			si.setUserName(rs.getString(2));
			si.setStockCode(rs.getInt(3));
			si.setStockName(rs.getString(4));
			si.setTotalNumber(rs.getInt(5));
		}
		    rs.close();
			pr.close();
			return si;
	}

	//新建持股信息
	public boolean InsertShockInfo(StockInfo si, Connection con) throws Exception {
		 PreparedStatement pr=null;
		 String sql="INSERT INTO StockInfo VALUES (id.nextval,?,?,?,?)";
		 boolean b=false;
		 pr=con.prepareStatement(sql);
		 pr.setInt(1,si.getId() );
		 pr.setString(2,si.getUserName());
		 pr.setInt(3, si.getStockCode());
		 pr.setString(4, si.getStockName());
		 pr.setInt(5, si.getTotalNumber());
		 int n=pr.executeUpdate();
			if(n>0)
		    b=true;
		 pr.close();
		 return b;
	 }

	//根据用户名删除持股信息
	public boolean DeleteShockInfo(String username, Connection con) throws Exception {
		PreparedStatement pr=null;
		boolean b=false;
		String sql="Delete from StockInfo where username=?"; //删除行
	    pr=con.prepareStatement(sql); 
		pr.setString(1, username); 
		int n=pr.executeUpdate(); 
		if(n>0)
		    b=true;
        pr.close();  
		return b; 
     }

	//根据用户名修改持股信息
	public boolean UpdateShockInfo(String username, Connection con, int totalnumber) throws Exception {
		 PreparedStatement pr=null;
		 boolean b=false;
		 String sql="UPDATE StockInfo SET totalnumber=? WHERE username=?";  
		 pr=con.prepareStatement(sql);
		 pr.setInt(1,totalnumber);
		 pr.setString(2, username);
		 int n=pr.executeUpdate();//发送SQL语句，执行查询操作，返回结果集
		 if(n>0){	
				b=true;
				}
		 pr.close( );	
		 return b;
	}

	//分页查询所有证券股票流水信息
	public List<StockInfo> SelectAllStock2(int start2, int end2, Connection con) throws Exception {
		PreparedStatement pr=null;
		ResultSet rs=null; 
		pr=con.prepareStatement("select * from(select rownum as rn,StockInfo.* from StockInfo)where rn>=? and rn<=?");
		pr.setInt(1, start2);
		pr.setInt(2, end2);
		rs=pr.executeQuery();
		List<StockInfo> list2=new ArrayList<StockInfo>();
		while(rs.next()){
			StockInfo si=new StockInfo();
			si.setId(rs.getInt(1));
			si.setUserName(rs.getString(2));
			si.setStockCode(rs.getInt(3));
			si.setStockName(rs.getString(4));
			si.setTotalNumber(rs.getInt(5));
			list2.add(si);
		}
		rs.close();
		 pr.close();
		 return list2;
	}

}
