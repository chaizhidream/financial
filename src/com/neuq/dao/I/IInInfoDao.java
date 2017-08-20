package com.neuq.dao.I;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.neuq.bean.InInfo;

public interface IInInfoDao {
	/**
	 * 查询全部用户的收入表
	 * @return 收入列表
	 * @throws SQLException 
	 */
	public List<InInfo> select(Connection con) throws SQLException;
	/**
	 * 查询某一用户的收入表
	 * @param username  用户名
	 * @return  收入列表
	 * @throws SQLException 
	 */
	public List<InInfo> select(String username,Connection con) throws SQLException;
	/**
	 * 插入一条记录
	 * @throws SQLException 
	 */
	public boolean insert(InInfo inInfo,Connection con) throws SQLException;
	/**
	 * 修改一条记录
	 * @throws SQLException 
	 */
	public boolean update(InInfo inInfo,Connection con) throws SQLException;
	/**
	 * 删除全部记录
	 * @throws SQLException 
	 */
	public boolean delete(Connection con) throws SQLException;
	/**
	 * 删除某一用户全部记录
	 * @throws SQLException 
	 */
	public boolean delete(String username,Connection con) throws SQLException;
	/**
	 * 删除某一条记录
	 * @throws SQLException 
	 */
	public boolean delete(int id,Connection con) throws SQLException;
}
