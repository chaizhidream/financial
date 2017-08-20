package com.neuq.services.Impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.neuq.bean.SecuritiesAccount;
import com.neuq.dao.I.ISecuritiesAccountDao;
import com.neuq.dao.Impl.SecuritiesAccountDaoImpl;
import com.neuq.db.DBUtil;
import com.neuq.services.I.ISecuritiesAccountServices;

public class SecuritiesAccountServicesImpl implements ISecuritiesAccountServices{
	ISecuritiesAccountDao isad=new SecuritiesAccountDaoImpl();

	@Override
	public boolean insert(SecuritiesAccount sa) throws SQLException {
		Connection con=DBUtil.getConnection();
		boolean b=false;
		b=isad.insert(sa, con);
		DBUtil.CloseConnection(null, null, con);
		return b;
	}

	@Override
	public boolean delete(String name) throws SQLException {
		Connection con=DBUtil.getConnection();
		boolean b=false;
		b=isad.delete(name, con);
		DBUtil.CloseConnection(null, null, con);
		return b;
	}

	@Override
	public boolean update(String name) throws SQLException {
		Connection con=DBUtil.getConnection();
		boolean b=false;
		b=isad.update(name, con);
		DBUtil.CloseConnection(null, null, con);
		return b;
	}

	@Override
	public List<SecuritiesAccount> selectall() throws SQLException {
		Connection con=DBUtil.getConnection();
		List<SecuritiesAccount> list=isad.selectall(con);
		DBUtil.CloseConnection(null, null, con);
		return list;
	}

}
