package com.neuq.services.Impl;

import java.sql.Connection;
import java.sql.SQLException;

import com.neuq.bean.Checkpwd;
import com.neuq.dao.I.ICheckpwd;
import com.neuq.dao.Impl.CheckpwdImpl;
import com.neuq.db.DBUtil;
import com.neuq.services.I.ICheckpwdServices;

public class CheckpwdServicesImpl implements ICheckpwdServices {

	@Override
	public boolean delete(String username) throws SQLException {
		Connection con = DBUtil.getConnection();
		ICheckpwd ick=new CheckpwdImpl();
		boolean b = false;
		b=ick.delete(username, con);
		return b;
	}

	@Override
	public boolean insert(String username, String checkcode) throws SQLException {
		Connection con = DBUtil.getConnection();
		ICheckpwd ick=new CheckpwdImpl();
		boolean b = false;
		b=ick.insert(username, checkcode, con);
		return b;
	}

	@Override
	public Checkpwd select(String username, String checkcode) throws SQLException {
		Connection con = DBUtil.getConnection();
		ICheckpwd ick=new CheckpwdImpl();
		Checkpwd chk=null;
		chk=ick.select(username, checkcode, con);
		return chk;
	}

}
