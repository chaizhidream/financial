package com.neuq.services.Impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import com.neuq.bean.OutInfo;
import com.neuq.dao.I.IOutInfoDao;
import com.neuq.dao.Impl.OutInfoDaoImpl;
import com.neuq.db.DBUtil;
import com.neuq.services.I.IOutInfoServices;

public class OutInfoServicesImpl implements IOutInfoServices {

	@Override
	public List<OutInfo> select() throws SQLException {
		Connection con = DBUtil.getConnection();
		IOutInfoDao oid = new OutInfoDaoImpl();
		List<OutInfo> list = oid.select(con);
		DBUtil.CloseConnection(null, null, con);
		return list;
	}

	@Override
	public List<OutInfo> select(String username) throws SQLException {
		Connection con = DBUtil.getConnection();
		IOutInfoDao oid = new OutInfoDaoImpl();
		List<OutInfo> list = oid.select(username, con);
		DBUtil.CloseConnection(null, null, con);
		return list;
	}

	@Override
	public boolean insert(OutInfo outInfo) throws SQLException {
		Connection con = DBUtil.getConnection();
		IOutInfoDao oid = new OutInfoDaoImpl();
		boolean b = false;
		b = oid.insert(outInfo, con);
		DBUtil.CloseConnection(null, null, con);
		return b;
	}

	@Override
	public boolean update(OutInfo outInfo) throws SQLException {
		Connection con = DBUtil.getConnection();
		IOutInfoDao oid = new OutInfoDaoImpl();
		boolean b = false;
		b = oid.update(outInfo, con);
		DBUtil.CloseConnection(null, null, con);
		return b;
	}

	@Override
	public boolean delete() throws SQLException {
		Connection con = DBUtil.getConnection();
		IOutInfoDao oid = new OutInfoDaoImpl();
		boolean b = false;
		b = oid.delete(con);
		DBUtil.CloseConnection(null, null, con);
		return b;
	}

	@Override
	public boolean delete(String username) throws SQLException {
		Connection con = DBUtil.getConnection();
		IOutInfoDao oid = new OutInfoDaoImpl();
		boolean b = false;
		b = oid.delete(username, con);
		DBUtil.CloseConnection(null, null, con);
		return b;
	}

	@Override
	public boolean delete(int id) throws SQLException {
		Connection con = DBUtil.getConnection();
		IOutInfoDao oid = new OutInfoDaoImpl();
		boolean b = false;
		b = oid.delete(id, con);
		DBUtil.CloseConnection(null, null, con);
		return b;
	}

}
