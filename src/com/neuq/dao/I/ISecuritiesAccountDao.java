package com.neuq.dao.I;

import java.sql.Connection;
import java.sql.SQLException;


import com.neuq.bean.SecuritiesAccount;


public interface ISecuritiesAccountDao {
	/*
	 * 新增证券账户信息
	 */
	public boolean insert(SecuritiesAccount sa,Connection con) throws SQLException;
	/*
	 * 删除证券账户信息
	 */
	public boolean delete(String name,Connection con) throws SQLException;
	/*
	 * 修改证券账户信息
	 */
	public boolean update(String name,Connection con) throws SQLException;
	/*
	 * 查询证券账户信息
	 */
	public java.util.List<SecuritiesAccount> selectall(Connection con) throws SQLException;

}
