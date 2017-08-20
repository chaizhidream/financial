package com.neuq.bean;

import java.io.Serializable;
import java.util.Date;

public class OutInfo implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public OutInfo () {
		// TODO 自动生成的构造函数存根
	}
	/**
	 * 主键 自增长
	 */
	private int id;
	/**
	 * 用户名
	 */
	private String username;
	/**
	 * 支出金额
	 */
	private Double outcome;
	/**
	 * 支出类别
	 */
	private String outcometype;
	/**
	 * 支出用途
	 */
	private String outcomeuse;
	/**
	 * 成员
	 */
	private String members;
	/**
	 * 时间
	 */
	private Date payouttime;
	/**
	 * 收款方
	 */
	private String beneficiary;
	/**
	 * 备注
	 */
	private String information;
	/**
	 * 支出账户
	 */
	private String account;
	/**
	 * @param id 主键
	 * @param username 用户名
	 * @param outcome 支出金额
	 * @param outcometype 支出类别
	 * @param outcomeuse 支出用途
	 * @param members 成员
	 * @param payouttime 时间
	 * @param beneficiary 收款方
	 * @param information 备注
	 * @param account 支出账户
	 */
	public OutInfo(int id, String username, Double outcome, String outcometype, String outcomeuse, String members,
			Date payouttime, String beneficiary, String information, String account) {
		super();
		this.id = id;
		this.username = username;
		this.outcome = outcome;
		this.outcometype = outcometype;
		this.outcomeuse = outcomeuse;
		this.members = members;
		this.payouttime = payouttime;
		this.beneficiary = beneficiary;
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
	public Double getOutcome() {
		return outcome;
	}
	public void setOutcome(Double outcome) {
		this.outcome = outcome;
	}
	public String getOutcometype() {
		return outcometype;
	}
	public void setOutcometype(String outcometype) {
		this.outcometype = outcometype;
	}
	public String getOutcomeuse() {
		return outcomeuse;
	}
	public void setOutcomeuse(String outcomeuse) {
		this.outcomeuse = outcomeuse;
	}
	public String getMembers() {
		return members;
	}
	public void setMembers(String members) {
		this.members = members;
	}
	public Date getPayouttime() {
		return payouttime;
	}
	public void setPayouttime(Date payouttime) {
		this.payouttime = payouttime;
	}
	public String getBeneficiary() {
		return beneficiary;
	}
	public void setBeneficiary(String beneficiary) {
		this.beneficiary = beneficiary;
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
		return "OutInfo [id=" + id + ", username=" + username + ", outcome=" + outcome + ", outcometype=" + outcometype
				+ ", outcomeuse=" + outcomeuse + ", members=" + members + ", payouttime=" + payouttime
				+ ", beneficiary=" + beneficiary + ", information=" + information + ", account=" + account + "]";
	}
	
}
