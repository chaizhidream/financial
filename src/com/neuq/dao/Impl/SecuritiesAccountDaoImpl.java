package com.neuq.dao.Impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.neuq.bean.SecuritiesAccount;

import com.neuq.dao.I.ISecuritiesAccountDao;
import com.neuq.db.DBUtil;

public class SecuritiesAccountDaoImpl implements ISecuritiesAccountDao{
		/*
		 * 新建用户
		 */
	@Override
	public boolean insert(SecuritiesAccount sa, Connection con) throws SQLException {
			java.sql.PreparedStatement pst=null;
			ResultSet rs=null;
			String sql="insert into SecuritiesAccount(Username,Password,Idcard,,Telephone) values(?,?,?,?)";
			boolean b=false;
			pst=con.prepareStatement(sql);
			pst.setString(1, sa.getUsername());
			pst.setString(2, sa.getPassword());
			pst.setString(3, sa.getIdcard());
			pst.setString(4, sa.getTelephone());
			rs=pst.executeQuery();
			if (rs.next()) {
				b=true;
			}
			DBUtil.CloseConnection(rs,pst,con);
			return b;
	}
	/*
	 * 删除用户
	 */
	@Override
	public boolean delete(String name, Connection con) throws SQLException {
		java.sql.PreparedStatement pst=null;
		ResultSet rs=null;
		String sql="delete from SecuritiesAccount where username=?";
		boolean b=false;
		pst=con.prepareStatement(sql);
		pst.setString(1, name);
		rs=pst.executeQuery();
		if (rs.next()) {
			b=true;
		}
		return b;
	}
	/*
	 * 更改用户信息
	 */
	@Override
	public boolean update(String name, Connection con) throws SQLException {
		java.sql.PreparedStatement pst=null;
		ResultSet rs=null;
		String sql="update user set";
		boolean b=false;
		pst=con.prepareStatement(sql);
		pst.setString(1,name);
		rs=pst.executeQuery();
		if (rs.next()) {
			b=true;
		}
		DBUtil.CloseConnection(rs,pst,con);
		return b;
	}
	/*
	 * 查询所有户信息
	 */
	@Override
	public List<SecuritiesAccount> selectall(Connection con) throws SQLException {
		java.sql.PreparedStatement pst=null;
		ResultSet rs=null;
		List<SecuritiesAccount> list=new ArrayList<SecuritiesAccount>();
		String sql="select * from SecuritiesAccount";
		pst=con.prepareStatement(sql);
		rs=pst.executeQuery();
		while (rs.next()) {
			SecuritiesAccount sa=new SecuritiesAccount();
			sa.setUsername(rs.getString(1));
			sa.setPassword(rs.getString(2));
			sa.setIdcard(rs.getString(3));
			sa.setTelephone(rs.getString(4));
			list.add(sa);
		}
		DBUtil.CloseConnection(rs, pst, con);
		return list;
	}

	
}
