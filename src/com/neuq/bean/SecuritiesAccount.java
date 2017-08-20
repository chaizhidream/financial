package com.neuq.bean;

import java.io.Serializable;

/**
 * 证券账户信息类
 */

public  class SecuritiesAccount implements Serializable{

	private static final long serialVersionUID = 1L;
	
	protected int id;
	protected String username;
	protected String password;
	protected String idcard;
	protected String telephone;
	/**
	 * @param id			证券账户信息id
	 * @param username		用户名
	 * @param password		密码
	 * @param idcard		身份证号
	 * @param telephone		手机号
	 */
	public SecuritiesAccount(int id, String username, String password, String idcard, String telephone) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.idcard = idcard;
		this.telephone = telephone;
	}
	
	public SecuritiesAccount(){
		
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SecuritiesAccount [id=" + id + ", username=" + username + ", password=" + password + ", idcard="
				+ idcard + ", telephone=" + telephone + "]";
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the idcard
	 */
	public String getIdcard() {
		return idcard;
	}
	/**
	 * @param idcard the idcard to set
	 */
	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}
	/**
	 * @return the telephone
	 */
	public String getTelephone() {
		return telephone;
	}
	/**
	 * @param telephone the telephone to set
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
