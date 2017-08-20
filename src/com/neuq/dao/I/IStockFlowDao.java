package com.neuq.dao.I;

import java.sql.Connection;
import java.util.Date;
import java.util.List;

import com.neuq.bean.*;

public interface IStockFlowDao {
	//分页查询所有证券股票流水信息
  public List<StockFlow> SelectAllStock(int start,int end,Connection con) throws Exception;
  //根据用户名查询证券股票流水信息
  public StockFlow SelectStockFlow(String username,Connection con)throws Exception;
   //插入证券股票流水信息
  public boolean InsertShockFlow(StockFlow sf,Connection con)throws Exception;
    //根据用户名删除证券股票流水信息
  public boolean DeleteShockFlow(String username,Connection con)throws Exception;
//查询一共有多少种证券股票
	public int getStockNum(Connection con) throws Exception;
    //根据用户名修改证券股票流水信息
  public boolean UpdateShockFlow(String username,Connection con,int stocknumber,int buyOrsell,Date transactiontime,double transactionprince)throws Exception;
}
