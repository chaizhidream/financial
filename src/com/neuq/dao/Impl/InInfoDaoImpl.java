package com.neuq.dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.neuq.bean.InInfo;
import com.neuq.dao.I.IInInfoDao;
import com.neuq.db.DBUtil;

public class InInfoDaoImpl implements IInInfoDao{

	public List<InInfo> select(Connection con) throws SQLException {
		List<InInfo> list=new ArrayList<InInfo>();
		PreparedStatement pst=null;
		pst=con.prepareStatement("select * from InInfo");
		ResultSet rs=pst.executeQuery();	
		while(rs.next()){
			InInfo in=new InInfo();
			in.setId(rs.getInt(1));
			in.setUsername(rs.getString(2));
			in.setIncome(rs.getDouble(3));	
			in.setIncometype(rs.getString(4));
			in.setMembers(rs.getString(5));   
			in.setIncometime(rs.getDate(6));   	
			in.setPayer(rs.getString(7));  	
			in.setInformation(rs.getString(8));	
			in.setAccount(rs.getString(9));   
			
			list.add(in);
		}
		DBUtil.CloseConnection(rs, pst, con);
		return list;
	}

	public List<InInfo> select(String username, Connection con) throws SQLException {
		List<InInfo> list=new ArrayList<InInfo>();
		PreparedStatement pst=null;
		pst=con.prepareStatement("select * from InInfo where username=?");
		pst.setString(1, username);
		ResultSet rs=pst.executeQuery();	
		while(rs.next()){
			InInfo in=new InInfo();
			in.setId(rs.getInt(1));
			in.setUsername(rs.getString(2));
			in.setIncome(rs.getDouble(3));	
			in.setIncometype(rs.getString(4));
			in.setMembers(rs.getString(5));   
			in.setIncometime(rs.getDate(6));   	
			in.setPayer(rs.getString(7));  	
			in.setInformation(rs.getString(8));	
			in.setAccount(rs.getString(9));   
			
			list.add(in);
		}
		DBUtil.CloseConnection(rs, pst, con);
		return list;
	}

	public boolean insert(InInfo inInfo,Connection con) throws SQLException {
		boolean b=false;
		PreparedStatement pst=con.prepareStatement("insert into InInfo (username,income,incometype,members,incometime,payer,information,account) values (?,?,?,?,?,?,?,?,?)");
		pst.setString(1,inInfo.getUsername());
		pst.setDouble(2,inInfo.getIncome());	
		pst.setString(3,inInfo.getIncometype());
		pst.setString(4,inInfo.getMembers());   
		pst.setDate(5,(java.sql.Date) inInfo.getIncometime());
		pst.setString(6, inInfo.getPayer());
		pst.setString(7, inInfo.getInformation());	
		pst.setString(8, inInfo.getAccount()); 
		
		int n=pst.executeUpdate();
		if(n>0)
			b=true;
		DBUtil.CloseConnection(null, pst, con);
		return b;
	}

	public boolean delete(Connection con) throws SQLException  {
		boolean b=false;
		PreparedStatement pst=
				con.prepareStatement("delete from InInfo");
		
		int n=pst.executeUpdate();
		if(n>0)
			b=true;
		DBUtil.CloseConnection(null, pst, con);
		return b;
	}

	public boolean update(InInfo inInfo, Connection con) throws SQLException {
		boolean b=false;
		PreparedStatement pst=
			con.prepareStatement("update InInfo set username=?,income=?,incometype=?,members=?,incometime=?,payer=?,information=?,account=? where id=?");
		
		pst.setString(1,inInfo.getUsername());
		pst.setDouble(2,inInfo.getIncome());	
		pst.setString(3,inInfo.getIncometype());
		pst.setString(4,inInfo.getMembers());   
		pst.setDate(5,(java.sql.Date) inInfo.getIncometime());
		pst.setString(6, inInfo.getPayer());
		pst.setString(7, inInfo.getInformation());	
		pst.setString(8, inInfo.getAccount()); 
		pst.setInt(9, inInfo.getId());
				
		int n=pst.executeUpdate();
		if(n>0)
			b=true;
		DBUtil.CloseConnection(null, pst, con);
		return b;
	}

	@Override
	public boolean delete(int id, Connection con) throws SQLException {
		boolean b=false;
		PreparedStatement pst=
			con.prepareStatement("delete InInfo where id=?");
		pst.setInt(1, id);
		
		int n=pst.executeUpdate();
		if(n>0)
			b=true;
		DBUtil.CloseConnection(null, pst, con);
		return b;
	}

	public boolean delete(String username, Connection con) throws SQLException {
		boolean b=false;
		PreparedStatement pst =
			con.prepareStatement("delete InInfo where username=?");
		pst.setString(1, username);
		
		int n=pst.executeUpdate();
		if(n>0)
			b=true;
		DBUtil.CloseConnection(null, pst, con);
		return b;
	}

}
