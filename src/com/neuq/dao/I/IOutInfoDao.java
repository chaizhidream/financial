package com.neuq.dao.I;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.neuq.bean.OutInfo;

public interface IOutInfoDao {
	/**
	 * 查询全部用户的支出表
	 * @return 支出列表
	 * @throws SQLException 
	 */
	public List<OutInfo> select(Connection con) throws SQLException;
	/**
	 * 查询某一用户的支出表
	 * @param username  用户名
	 * @return  支出列表
	 * @throws SQLException 
	 */
	public List<OutInfo> select(String username,Connection con) throws SQLException;
	/**
	 * 插入一条记录
	 * @throws SQLException 
	 */
	public boolean insert(OutInfo outInfo,Connection con) throws SQLException;
	/**
	 * 修改一条记录
	 * @throws SQLException 
	 */
	public boolean update(OutInfo outInfo,Connection con) throws SQLException;
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
