package com.neuq.dao.Impl;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import com.neuq.bean.User;
import com.neuq.dao.I.IUserDao;
import com.neuq.db.DBUtil;


public class UserDaoImpl implements IUserDao{
	/*
	 * 新建用户
	 */
	@Override
	public boolean insert(User user, Connection con) throws SQLException {
		PreparedStatement pst=null;
		int i=0;
		String sql="insert into User(Username,Pwd,Ru,Familyid,Telephone,Email,Sex,Idcard,Role) values(?,?,?,?,?,?,?,?,?)";
		boolean b=false;
		pst=con.prepareStatement(sql);
		pst.setString(1, user.getUsername());
		pst.setString(2, user.getPassword());
		pst.setInt(3, user.getRu());
		pst.setInt(4, user.getFamilyid());
		pst.setString(5, user.getTelephone());
		pst.setString(6, user.getEmail());
		pst.setInt(7, user.getSex());
		pst.setString(8, user.getIdcard());
		pst.setString(9, user.getRole());
		i=pst.executeUpdate();
		if (i>0) {
			b=true;
		}
		DBUtil.CloseConnection(null,pst,con);
		return b;
	}
	
	/*
	 * 删除用户
	 */
	@Override
	public boolean delete(String name, Connection con) throws SQLException{
		PreparedStatement pst=null;
		int i=0;
		String sql="delete from user where username=?";
		boolean b=false;
		pst=con.prepareStatement(sql);
		i=pst.executeUpdate();
		if (i>0) {
			b=true;
		}
		DBUtil.CloseConnection(null,pst,con);
		return b;
	}
	/*
	 * 更改用户信息
	 */
	@Override
	public boolean update(User user, Connection con) throws SQLException{
		PreparedStatement pst=null;
		int i=0;
		String sql="update user set";
		boolean b=false;
		pst=con.prepareStatement(sql);
		pst.setString(1,name);
		i=pst.executeUpdate();
		if (i>0) {
			b=true;
		}
		DBUtil.CloseConnection(null,pst,con);
		return b;
	}
	/*
	 * 查询所有户信息
	 */
	@Override
	public List<User> selectall(Connection con) throws SQLException{
		PreparedStatement pst=null;
		ResultSet rs=null;
		List<User> list=new ArrayList<User>();
		String sql="select * from User";
		pst=con.prepareStatement(sql);
		rs=pst.executeQuery();
		while (rs.next()) {
			User u=new User();
			u.setId(rs.getInt(1));
			u.setUsername(rs.getString(2));
			u.setPassword(rs.getString(3));
			u.setRu(rs.getInt(4));
			u.setFamilyid(rs.getInt(5));
			u.setTelephone(rs.getString(6));
			u.setEmail(rs.getString(7));
			u.setSex(rs.getInt(8));
			u.setIdcard(rs.getString(9));
			u.setRole(rs.getString(10));
			list.add(u);
		}
		DBUtil.CloseConnection(rs, pst, con);
		return list;
	}
	/*
	 *查询当前用户信息
	 */
	@Override
	public User select(String name, Connection con) throws SQLException {
		User u=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		String sql="select * from user where username=?";
		pst=con.prepareStatement(sql);
		pst.setString(1,name);
		rs=pst.executeQuery();
		if (rs.next()) {
			u=new User();
			u.setId(rs.getInt(1));
			u.setUsername(rs.getString(2));
			u.setPassword(rs.getString(3));
			u.setRu(rs.getInt(4));
			u.setFamilyid(rs.getInt(5));
			u.setTelephone(rs.getString(6));
			u.setEmail(rs.getString(7));
			u.setSex(rs.getInt(8));
			u.setIdcard(rs.getString(9));
			u.setRole(rs.getString(10));
		}
		DBUtil.CloseConnection(rs, pst, con);
		return u;
	}
	/**
	 * 统计用户数量
	 */

	@Override
	public int count(Connection con) throws SQLException{
		PreparedStatement pst=null;
		ResultSet rs =null;
		String sql="select count(*) from User";
		int i=0;
	     pst=con.prepareStatement(sql);
		rs=pst.executeQuery();
		if (rs.next()) {
			i=rs.getInt(1);	
		}
		DBUtil.CloseConnection(rs,pst,con);
		return i;
	}
	/**
	 * 登陆验证
	 */
	@Override
	public User login(String username, String pwd,Connection con ) throws SQLException {
		
		PreparedStatement pst=null;
		ResultSet rs =null;
		User info=null;
		String sql = "select * from User where username = ? and pwd=?";
		pst = con.prepareStatement(sql);
		pst.setString(1, username);
		pst.setString(2,pwd);
		rs = pst.executeQuery();
		if(rs.next()) {
			info=new User();
			info.setUsername(rs.getString(2));
			info.setPassword(rs.getString(3));
			info.setRu(rs.getInt(4));
			info.setFamilyid(rs.getInt(5));
			info.setTelephone(rs.getString(6));
			info.setEmail(rs.getString(7));
			info.setSex(rs.getInt(8));
			info.setIdcard(rs.getString(9));
			info.setRole(rs.getString(10));
		}
		DBUtil.CloseConnection(rs, pst, con);
		return info;
	}

	@Override
	public User findUser(String usernameOrEmail, Connection con) throws SQLException {

		PreparedStatement pst=null;
		ResultSet rs =null;
		User info=null;
		String sql = "select * from User where username = ? or email=?";
		pst = con.prepareStatement(sql);
		pst.setString(1, usernameOrEmail);
		pst.setString(2,usernameOrEmail);
		rs = pst.executeQuery();
		if(rs.next()) {
			info=new User();
			info.setUsername(rs.getString(2));
			info.setPassword(rs.getString(3));
			info.setRu(rs.getInt(4));
			info.setFamilyid(rs.getInt(5));
			info.setTelephone(rs.getString(6));
			info.setEmail(rs.getString(7));
			info.setSex(rs.getInt(8));
			info.setIdcard(rs.getString(9));
			info.setRole(rs.getString(10));
		}
		DBUtil.CloseConnection(rs, pst, con);
		return info;
	}

	@Override
	public User findUser(String username, String email, Connection con) throws SQLException {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public boolean changePassword(String username, String pwd, Connection con) throws SQLException {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public boolean update(String name, Connection con) throws SQLException {
		// TODO 自动生成的方法存根
		return false;
	}
	

	
	
	
}
