package com.neuq.services.Impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.neuq.bean.User;
import com.neuq.dao.I.IUserDao;
import com.neuq.dao.Impl.UserDaoImpl;
import com.neuq.db.DBUtil;
import com.neuq.services.I.IUserServices;

public class UserServicesImpl implements IUserServices{
	IUserDao iud=new UserDaoImpl();
	@Override
	public boolean insert(User user) throws SQLException {
		Connection con=DBUtil.getConnection();
		boolean b=false;
		b=iud.insert(user, con);
		DBUtil.CloseConnection(null, null, con);
		return b;
	}

	@Override
	public boolean delete(String name) throws SQLException {
		Connection con=DBUtil.getConnection();
		boolean b=false;
		b=iud.delete(name, con);
		DBUtil.CloseConnection(null, null, con);
		return b;
	}

	@Override
	public boolean update(String name) throws SQLException {
		Connection con=DBUtil.getConnection();
		boolean b=false;
		b=iud.update(name, con);
		DBUtil.CloseConnection(null, null, con);
		return b;
	}

	@Override
	public List<User> selectall() throws SQLException {
		Connection con=DBUtil.getConnection();
		List<User> list=iud.selectall(con);
		DBUtil.CloseConnection(null, null, con);
		return list;
	}

	@Override
	public User select(String name) throws SQLException {
		Connection con=DBUtil.getConnection();
		User u=iud.select(name, con);
		DBUtil.CloseConnection(null, null, con);
		return u;
	}

	@Override
	public int count() throws SQLException {
		Connection con=DBUtil.getConnection();
		int i=iud.count(con);
		DBUtil.CloseConnection(null, null, con);
		return i;
	}

	@Override
	public User login(String username, String password) throws SQLException {
		// TODO Auto-generated method stub
		Connection con=DBUtil.getConnection();
		User u=iud.login(username, password,con);
		DBUtil.CloseConnection(null, null, con);
		return u;
	}

	@Override
	public User findUser(String nameOrEmail) throws SQLException {
		Connection con=DBUtil.getConnection();
		User u=iud.findUser(nameOrEmail, con);
		DBUtil.CloseConnection(null, null, con);
		return u;
	}

	@Override
	public void changePassword(String uname, String upsw01) throws SQLException {
		// TODO 自动生成的方法存根
		
	}
	
}
