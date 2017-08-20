package com.neuq.dao.Impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.neuq.bean.OutInfo;
import com.neuq.dao.I.IOutInfoDao;
import com.neuq.db.DBUtil;

import junit.framework.TestCase;

public class OutInfoDaoImplTest extends TestCase {

	IOutInfoDao iud = new OutInfoDaoImpl();
	Connection con  = DBUtil.getConnection();
	
	
	
	public void testSelect() throws SQLException {
		List<OutInfo> list = new ArrayList<OutInfo>();
		list = iud.select(con);
		System.out.println(list.toString());
	}

}
