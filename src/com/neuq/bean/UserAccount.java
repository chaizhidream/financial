package com.neuq.bean;

import java.io.Serializable;

public class UserAccount implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String username;	
	private double cash;	
	private double bankcard;	
	private double balance;
	private double borrowing;
	
	
	public UserAccount(){
		
	}	
	
	
	/**
	 * @param id 主键（自增长）
	 * @param username 用户名
	 * @param cash 现金
	 * @param bankcard 银行卡
	 * @param balance 余额宝
	 * @param borrowing 借贷
	 */	
	public UserAccount(int id, String username, double cash, double bankcard, double balance, double borrowing) {
		super();
		this.id = id;
		this.username = username;
		this.cash = cash;
		this.bankcard = bankcard;
		this.balance = balance;
		this.borrowing = borrowing;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public double getCash() {
		return cash;
	}
	public void setCash(double cash) {
		this.cash = cash;
	}
	public double getBankcard() {
		return bankcard;
	}
	public void setBankcard(double bankcard) {
		this.bankcard = bankcard;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getBorrowing() {
		return borrowing;
	}
	public void setBorrowing(double borrowing) {
		this.borrowing = borrowing;
	}
	@Override
	public String toString() {
		return "UserAccount [id=" + id + ", username=" + username + ", cash=" + cash + ", bankcard=" + bankcard
				+ ", balance=" + balance + ", borrowing=" + borrowing + "]";
	}

	
}
