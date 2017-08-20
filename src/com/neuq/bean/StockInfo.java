package com.neuq.bean;

import java.io.Serializable;

public class StockInfo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8861357652455425621L;

	public int id;
	public String username;
	public int stockcode;
	public String stockname;
	public int totalnumber;

	/**
	 * @param id 主键
	 * @param username 用户名
	 * @param stockcode
	 *            持有股票代码
	 * @param stockname
	 *            股票名称
	 * @param totalnumber
	 *            持有数量
	 */
	public StockInfo(int id, String username, int stockcode, String stockname, int totalnumber) {
		super();
		this.id = id;
		this.username = username;
		this.stockcode = stockcode;
		this.stockname = stockname;
		this.totalnumber = totalnumber;
	}

	public StockInfo() {

	}

	public String toString() {
		return "StockInfo [id=" + id + ", username=" + username + ", stockcode=" + stockcode + ", stockname="
				+ stockname + ", totalnumber=" + totalnumber + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return username;
	}

	public void setUserName(String username) {
		this.username = username;
	}

	public int getStockCode() {
		return stockcode;
	}

	public void setStockCode(int stockcode) {
		this.stockcode = stockcode;
	}

	public String getStockName() {
		return stockname;
	}

	public void setStockName(String stockname) {
		this.stockname = stockname;
	}

	public int getTotalNumber() {
		return totalnumber;
	}

	public void setTotalNumber(int totalnumber) {
		this.totalnumber = totalnumber;
	}
}
