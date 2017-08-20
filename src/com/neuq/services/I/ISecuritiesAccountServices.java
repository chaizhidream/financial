package com.neuq.services.I;

import java.sql.SQLException;
import java.util.List;

import com.neuq.bean.SecuritiesAccount;

public interface ISecuritiesAccountServices {
	/*
	 * 新增证券账户信息
	 */
	public boolean insert(SecuritiesAccount sa) throws SQLException;
	/*
	 * 删除证券账户信息
	 */
	public boolean delete(String name) throws SQLException;
	/*
	 * 修改证券账户信息
	 */
	public boolean update(String name) throws SQLException;
	/*
	 * 查询证券账户信息
	 */
	public List<SecuritiesAccount> selectall() throws SQLException;
}
