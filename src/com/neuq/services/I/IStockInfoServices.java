package com.neuq.services.I;


import java.util.List;

import com.neuq.bean.StockInfo;

public interface IStockInfoServices {
	     //分页查询所有持股信息
	     public List<StockInfo> SelectAllStock2(int start2,int end2);
	     //根据用户名查询持股信息
		 public StockInfo SelectStockInfo(String username ) ;
		 //新建持股信息
		 public boolean InsertShockInfo(StockInfo si ) ;
		 //根据用户名删除持股信息
		 public boolean DeleteShockInfo(String username ) ;
		 //根据用户名修改持股信息
		 public boolean UpdateShockInfo(String username ,int totalnumber) ;
}
