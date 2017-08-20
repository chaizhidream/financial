package com.neuq.dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.neuq.bean.Checkpwd;
import com.neuq.dao.I.ICheckpwd;
import com.neuq.db.DBUtil;

public class CheckpwdImpl implements ICheckpwd {

	@Override
	public boolean delete(String username, Connection con) throws SQLException {
		boolean b=false;
		PreparedStatement pst=con.prepareStatement("delete from checkpwd where username=?");
		pst.setString(1,username);	
		int n=pst.executeUpdate();
		if(n>0)
			b=true;
		DBUtil.CloseConnection(null, pst, con);
		return b;

	}

	@Override
	public boolean insert(String username, String checkcode, Connection con) throws SQLException {
		boolean b=false;
		PreparedStatement pst=con.prepareStatement("insert into checkpwd values (?,?)");
		pst.setString(1,username);	
		pst.setString(2,checkcode);
		int n=pst.executeUpdate();
		if(n>0)
			b=true;
		DBUtil.CloseConnection(null, pst, con);
		return b;
	}

	@Override
	public Checkpwd select(String username, String checkcode, Connection con) throws SQLException {
		Checkpwd chp=null;
		PreparedStatement pst=con.prepareStatement("select * from checkpwd where username=? and checkcode = ?");
		pst.setString(1,username);	
		pst.setString(2,checkcode);
		ResultSet rs=pst.executeQuery();
		while (rs.next()) {
		    chp=new Checkpwd();
			chp.setUsername(rs.getString(1));
			chp.setCheckcode(rs.getString(2));
		}
		
		
		DBUtil.CloseConnection(null, pst, con);
		return chp;
	}

}
