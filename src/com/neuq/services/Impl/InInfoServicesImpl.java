package com.neuq.services.Impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.neuq.bean.InInfo;
import com.neuq.dao.I.IInInfoDao;
import com.neuq.dao.Impl.InInfoDaoImpl;
import com.neuq.db.DBUtil;
import com.neuq.services.I.IInInfoServices;

public class InInfoServicesImpl implements IInInfoServices{

	@Override
	public List<InInfo> select() throws SQLException {
		Connection con=DBUtil.getConnection();
		IInInfoDao iid=new InInfoDaoImpl();
		List<InInfo> list =iid.select(con);
		DBUtil.CloseConnection(null, null, con);
		return list;
	}

	@Override
	public List<InInfo> select(String username) throws SQLException {
		Connection con=DBUtil.getConnection();
		IInInfoDao iid=new InInfoDaoImpl();
		List<InInfo> list =iid.select(username,con);
		DBUtil.CloseConnection(null, null, con);
		return list;
	}

	@Override
	public boolean insert(InInfo inInfo) throws SQLException {
		Connection con=DBUtil.getConnection();
		IInInfoDao iid=new InInfoDaoImpl();
		boolean b=false;
		b=iid.insert(inInfo, con);
		DBUtil.CloseConnection(null, null, con);
		return b;
	}

	@Override
	public boolean update(InInfo inInfo) throws SQLException {
		Connection con=DBUtil.getConnection();
		IInInfoDao iid=new InInfoDaoImpl();
		boolean b=false;
		b=iid.update(inInfo, con);
		DBUtil.CloseConnection(null, null, con);
		return b;
	}

	@Override
	public boolean delete() throws SQLException {
		Connection con=DBUtil.getConnection();
		IInInfoDao iid=new InInfoDaoImpl();
		boolean b=false;
		b=iid.delete(con);
		DBUtil.CloseConnection(null, null, con);
		return b;
	}

	@Override
	public boolean delete(String username) throws SQLException {
		Connection con=DBUtil.getConnection();
		IInInfoDao iid=new InInfoDaoImpl();
		boolean b=false;
		b=iid.delete(username, con);
		DBUtil.CloseConnection(null, null, con);
		return b;
	}

	@Override
	public boolean delete(int id) throws SQLException {
		Connection con=DBUtil.getConnection();
		IInInfoDao iid=new InInfoDaoImpl();
		boolean b=false;
		b=iid.delete(id, con);
		DBUtil.CloseConnection(null, null, con);
		return b;
	}

}
