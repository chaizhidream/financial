package com.neuq.dao.I;

import java.sql.Connection;
import java.sql.SQLException;

import com.neuq.bean.Checkpwd;





public interface ICheckpwd {
	public boolean delete(String username,Connection con) throws SQLException;
	
	
	public boolean insert(String username,String checkcode,Connection con) throws SQLException;
	
	
	public Checkpwd select(String username, String checkcode,Connection con) throws SQLException;
	
}
