package com.neuq.dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.neuq.bean.OutInfo;
import com.neuq.dao.I.IOutInfoDao;
import com.neuq.db.DBUtil;

public class OutInfoDaoImpl implements IOutInfoDao{

	public List<OutInfo> select(Connection con) throws SQLException {
		List<OutInfo> list=new ArrayList<OutInfo>();
		PreparedStatement pst=null;
		pst=con.prepareStatement("select * from OutInfo");
		ResultSet rs=pst.executeQuery();	
		while(rs.next()){
			OutInfo out=new OutInfo();
			out.setId(rs.getInt(1));
			out.setUsername(rs.getString(2));
			out.setOutcome(rs.getDouble(3));	
			out.setOutcometype(rs.getString(4));
			out.setMembers(rs.getString(5));   
			out.setPayouttime(rs.getDate(6));   	
			out.setBeneficiary(rs.getString(7));  	
			out.setInformation(rs.getString(8));	
			out.setAccount(rs.getString(9));   
			
			list.add(out);
		}
		DBUtil.CloseConnection(rs, pst, con);
		return list;
	}

	public List<OutInfo> select(String username, Connection con) throws SQLException {
		List<OutInfo> list=new ArrayList<OutInfo>();
		PreparedStatement pst=null;
		pst=con.prepareStatement("select * from OutInfo where username=?");
		pst.setString(1, username);
		ResultSet rs=pst.executeQuery();	
		while(rs.next()){
			OutInfo out=new OutInfo();
			out.setId(rs.getInt(1));
			out.setUsername(rs.getString(2));
			out.setOutcome(rs.getDouble(3));	
			out.setOutcometype(rs.getString(4));
			out.setMembers(rs.getString(5));   
			out.setPayouttime(rs.getDate(6)); 	
			out.setBeneficiary(rs.getString(7));  	
			out.setInformation(rs.getString(8));	
			out.setAccount(rs.getString(9));   
			
			list.add(out);
		}
		DBUtil.CloseConnection(rs, pst, con);
		return list;
	}

	public boolean insert(OutInfo outInfo,Connection con) throws SQLException {
		boolean b=false;
		PreparedStatement pst=con.prepareStatement("insert into OutInfo (username,outcome,outcometype,outcomeuse,members,payouttime,beneficiary,information,account) values (?,?,?,?,?,?,?,?,?,?)");
		pst.setString(1,outInfo.getUsername());
		pst.setDouble(2,outInfo.getOutcome());	
		pst.setString(3,outInfo.getOutcometype());
		pst.setString(4,outInfo.getOutcomeuse());
		pst.setString(5,outInfo.getMembers());   
		pst.setDate(6,(java.sql.Date) outInfo.getPayouttime());
		pst.setString(7, outInfo.getBeneficiary());
		pst.setString(8, outInfo.getInformation());	
		pst.setString(9, outInfo.getAccount()); 
		
		int n=pst.executeUpdate();
		if(n>0)
			b=true;
		DBUtil.CloseConnection(null, pst, con);
		return b;
	}

	public boolean delete(Connection con) throws SQLException  {
		boolean b=false;
		PreparedStatement pst=
				con.prepareStatement("delete from OutInfo");
		
		int n=pst.executeUpdate();
		if(n>0)
			b=true;
		DBUtil.CloseConnection(null, pst, con);
		return b;
	}

	public boolean update(OutInfo outInfo, Connection con) throws SQLException {
		boolean b=false;
		PreparedStatement pst=
			con.prepareStatement("update OutInfo set username=?,outcome=?,outcometype=?,outcomeuse=?£¬members=?,payouttime=?,beneficiary=?,information=?,account=? where id=?");
		
		pst.setString(1,outInfo.getUsername());
		pst.setDouble(2,outInfo.getOutcome());	
		pst.setString(3,outInfo.getOutcometype());
		pst.setString(4,outInfo.getOutcomeuse());
		pst.setString(5,outInfo.getMembers());   
		pst.setDate(6,(java.sql.Date) outInfo.getPayouttime());
		pst.setString(7, outInfo.getBeneficiary());
		pst.setString(8, outInfo.getInformation());	
		pst.setString(9, outInfo.getAccount()); 
		pst.setInt(10, outInfo.getId());
				
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
			con.prepareStatement("delete OutInfo where id=?");
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
			con.prepareStatement("delete OutInfo where username=?");
		pst.setString(1, username);
		
		int n=pst.executeUpdate();
		if(n>0)
			b=true;
		DBUtil.CloseConnection(null, pst, con);
		return b;
	}

}
