package com.neuq.services.I;


import java.util.Date;
import java.util.List;

import com.neuq.bean.StockFlow;

public interface IStockFlowServices {
	  //分页查询所有证券股票流水信息
	  public List<StockFlow> SelectAllStock(int start,int end);
	  //根据id查询证券股票流水信息
	  public StockFlow SelectStockFlow(String username);
	   //插入证券股票流水信息
	  public boolean InsertShockFlow(StockFlow sf );
	    //删除证券股票流水信息
	  public boolean DeleteShockFlow(String username );
	//查询一共有多少种证券股票
	  public int  getStockNum( );
	      //修改证券股票流水信息
	  public boolean UpdateShockFlow(String username ,int stocknumber,int buyOrsell,Date transactiontime,double transactionprince);
	}
