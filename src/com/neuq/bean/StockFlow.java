package com.neuq.bean;

import java.util.Date;
import java.io.Serializable;

public class StockFlow implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8861357652455425621L;
	/**
	 * id 主键 username 用户名 stockcode 持有股票代码 stockname 股票名称 stocknumber 股票数量
	 * buyOrsell 买入/卖出 transactiontime 交易时间 transactionprince 交易单价
	 */
	public int id;
	public String username;
	public int stockcode;
	public String stockname;
	public int stocknumber;
	public int buyOrsell;
	public Date transactiontime;
	public double transactionprince;

	/**
	 * @paramid 主键
	 * @param username
	 *            用户名
	 * @param stockcode
	 *            持有股票代码
	 * @param stockname
	 *            股票名称
	 * @param stocknumber
	 *            股票数量
	 * @param buyOrsell
	 *            买入/卖出
	 * @param transactiontime
	 *            交易时间
	 * @param transactionprince
	 *            交易单价
	 */
	public StockFlow(int id, String username, int stockcode, String stockname, int stocknumber, int buyOrsell,
			Date transactiontime, double transactionprince) {
		super();
		this.id = id;
		this.username = username;
		this.stockcode = stockcode;
		this.stockname = stockname;
		this.stocknumber = stocknumber;
		this.buyOrsell = buyOrsell;
		this.transactiontime = transactiontime;
		this.transactionprince = transactionprince;
	}

	public StockFlow() {

	}

	public String toString() {
		return "StockFlow [id=" + id + ", username=" + username + ", stockcode=" + stockcode + ", stockname="
				+ stockname + ", stocknumber=" + stocknumber + ", buyOrsell=" + buyOrsell + ", transactiontime="
				+ transactiontime + ", transactionprince=" + transactionprince + "]";
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

	public int getStockNumber() {
		return stocknumber;
	}

	public void setStockNumber(int stocknumber) {
		this.stocknumber = stocknumber;
	}

	public int getBuyOrSell() {
		return buyOrsell;
	}

	public void setBuyOrSell(int buyOrsell) {
		this.buyOrsell = buyOrsell;
	}

	public Date getTransactionTime() {
		return transactiontime;
	}

	public void setTransactionTime(Date transactiontime) {
		this.transactiontime = transactiontime;
	}

	public double getTransactionPrince() {
		return transactionprince;
	}

	public void setTransactionPrince(double transactionprince) {
		this.transactionprince = transactionprince;
	}

}
