package com.neuq.services.I;


import java.sql.SQLException;
import java.util.List;
import com.neuq.bean.User;


public interface IUserServices {
	/**
	 * 新建用户
	 * @throws SQLException 
	 */
		public boolean insert(User user) throws SQLException;
	/*
	 *删除用户
	 */
		public boolean delete(String name) throws SQLException;
	/*
	 * 更改用户信息
	 */
		public boolean update(String name) throws SQLException;
	/*
	 *查询所有用户信息 
	 */
		public List<User> selectall() throws SQLException;
	/*
	 * 查询当前用户信息
	 */
		public User select(String name) throws SQLException;
	/*
	 * 统计用户数量
	 */
		public int count() throws SQLException;
	
		/*
		 * 检查用户登陆
		 */
public User login(String username,String password)throws SQLException;



/**
 * 寻找用户是否存在
 */
public User findUser(String nameOrEmail)throws SQLException;
public void changePassword(String uname, String upsw01) throws SQLException;
}
