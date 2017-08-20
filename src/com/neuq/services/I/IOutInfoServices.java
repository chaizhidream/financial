package com.neuq.services.I;

import java.sql.SQLException;
import java.util.List;

import com.neuq.bean.OutInfo;

public interface IOutInfoServices {
	/**
	 * 查询全部用户的支出表
	 * @return 支出列表
	 * @throws SQLException 
	 */
	public List<OutInfo> select() throws SQLException;
	/**
	 * 查询某一用户的支出表
	 * @param username  用户名
	 * @return  支出列表
	 * @throws SQLException 
	 */
	public List<OutInfo> select(String username) throws SQLException;
	/**
	 * 插入一条记录
	 * @throws SQLException 
	 */
	public boolean insert(OutInfo outInfo) throws SQLException;
	/**
	 * 修改一条记录
	 * @throws SQLException 
	 */
	public boolean update(OutInfo outInfo) throws SQLException;
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
