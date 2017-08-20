package com.neuq.bean;

import java.io.Serializable;
import java.util.Date;

public class InInfo implements Serializable{

   private static final long serialVersionUID = 1L;
   
   private int id;
   private String username;	
   private double income;	
   private String incometype;		
   private String members;	
   private Date incometime;	
   private String payer;	
   private String information;	
   private String account;

   public InInfo(){
		
   }
   
   /**
 * @param id  主键（自增长）
 * @param username  用户名
 * @param income   收入金额
 * @param incometype 收入类别
 * @param members  成员
 * @param incometime 收入时间
 * @param payer  付款方
 * @param information  备注
 * @param account  收入账户
 */
   public InInfo(int id, String username, double income, String incometype, String members, Date incometime, String payer,
		String information, String account) {
	super();
	this.id = id;
	this.username = username;
	this.income = income;
	this.incometype = incometype;
	this.members = members;
	this.incometime = incometime;
	this.payer = payer;
	this.information = information;
	this.account = account;
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
public double getIncome() {
	return income;
}
public void setIncome(double income) {
	this.income = income;
}
public String getIncometype() {
	return incometype;
}
public void setIncometype(String incometype) {
	this.incometype = incometype;
}
public String getMembers() {
	return members;
}
public void setMembers(String members) {
	this.members = members;
}
public Date getIncometime() {
	return incometime;
}
public void setIncometime(Date incometime) {
	this.incometime = incometime;
}
public String getPayer() {
	return payer;
}
public void setPayer(String payer) {
	this.payer = payer;
}
public String getInformation() {
	return information;
}
public void setInformation(String information) {
	this.information = information;
}
public String getAccount() {
	return account;
}
public void setAccount(String account) {
	this.account = account;
}
@Override
public String toString() {
	return "InInfo [id=" + id + ", username=" + username + ", income=" + income + ", incometype=" + incometype
			+ ", members=" + members + ", incometime=" + incometime + ", payer=" + payer + ", information="
			+ information + ", account=" + account + "]";
}
   
   
}
