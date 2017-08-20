package com.neuq.dao.I;



import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.neuq.bean.User;


public interface IUserDao {
	/**
	 * 新建用户
	 * @throws SQLException 
	 */
		public boolean insert(User user,Connection con) throws SQLException;
	/*
	 *删除用户
	 */
		public boolean delete(String name,Connection con) throws SQLException;
	/*
	 * 更改用户信息
	 */
		public boolean update(User user,Connection con) throws SQLException;
	/*
	 *查询所有用户信息 
	 */
		public List<User> selectall(Connection con) throws SQLException;
	/*
	 * 查询当前用户信息
	 */
		public User select(String name,Connection con) throws SQLException;
	/*
	 * 统计用户数量
	 */
		public int count(Connection con) throws SQLException;
		
		
		/**
		 * 找回密码时寻找用户是否存在
		 */
		public User findUser(String username,String email,Connection con)throws SQLException;
	
		
		/**
		 * 用户登录
		 */
		public User login(String username, String pwd,Connection con) throws SQLException;
		
		
		/**
		 * 修改密码
		 * @param username
		 * @param pwd
		 * @param con
		 * @return
		 * @throws SQLException
		 */
		public boolean changePassword(String username, String pwd,Connection con) throws SQLException;
}
