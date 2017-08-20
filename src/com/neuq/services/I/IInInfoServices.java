package com.neuq.services.I;

import java.sql.SQLException;
import java.util.List;

import com.neuq.bean.InInfo;

public interface IInInfoServices {
	/**
	 * 查询全部用户的收入表
	 * @return 收入列表
	 * @throws SQLException 
	 */
	public List<InInfo> select() throws SQLException;
	/**
	 * 查询某一用户的收入表
	 * @param username  用户名
	 * @return  收入列表
	 * @throws SQLException 
	 */
	public List<InInfo> select(String username) throws SQLException;
	/**
	 * 插入一条记录
	 * @throws SQLException 
	 */
	public boolean insert(InInfo inInfo) throws SQLException;
	/**
	 * 修改一条记录
	 * @throws SQLException 
	 */
	public boolean update(InInfo inInfo) throws SQLException;
	/**
	 * 删除全部记录
	 * @throws SQLException 
	 */
	public boolean delete() throws SQLException;
	/**
	 * 删除某一用户全部记录
	 * @throws SQLException 
	 */
	public boolean delete(String username) throws SQLException;
	/**
	 * 删除某一条记录
	 * @throws SQLException 
	 */
	public boolean delete(int id) throws SQLException;
}
