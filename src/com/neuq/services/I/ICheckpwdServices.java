package com.neuq.services.I;


import java.sql.SQLException;

import com.neuq.bean.Checkpwd;

public interface ICheckpwdServices {
public boolean delete(String username) throws SQLException;
	
	
	public boolean insert(String username,String checkcode) throws SQLException;
	
	
	public Checkpwd select(String username, String checkcode) throws SQLException;
}
