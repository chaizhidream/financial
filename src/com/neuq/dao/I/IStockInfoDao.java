package com.neuq.dao.I;

import java.sql.Connection;
import java.util.List;

import com.neuq.bean.*;

public interface IStockInfoDao {
	//分页查询所有持股信息
	  public List<StockInfo> SelectAllStock2(int start2,int end2,Connection con) throws Exception;
     //查询持股信息
	 public StockInfo SelectStockInfo(String username,Connection con)throws Exception;
	 //新建持股信息
	 public boolean InsertShockInfo(StockInfo si,Connection con)throws Exception;
	 //删除持股信息
	 public boolean DeleteShockInfo(String username,Connection con)throws Exception;
	  //修改持股信息
	 public boolean UpdateShockInfo(String username,Connection con,int totalnumber)throws Exception;
}
