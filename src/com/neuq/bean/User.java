package com.neuq.bean;

import java.io.Serializable;

public class User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public User() {
		// TODO 自动生成的构造函数存根
	}
	/**
	 * 主键自增长
	 */
	private int id;
	/**
	 * 用户名
	 */
	private String username;
	/**
	 * 密码
	 */
	private String password;
	/**
	 * 权限
	 */
	private int ru=3;
	/**
	 * 家庭编号
	 */
	private int familyid;
	/**
	 * 手机号
	 */
	private String telephone;
	/**
	 * 邮箱
	 */
	private String email;
	/**
	 * 性别
	 */
	private int sex;
	/**
	 * 身份账号码
	 */
	private String idcard;
	/**
	 * 家庭角色
	 */
	private String role;
	
	
	/**
	 * 验证码
	 */
	private String randomCode;
	
	
	/**
	 * @param id 主键
	 * @param username 用户名
	 * @param password 密码
	 * @param ru 权限
	 * @param familyid 家庭编号
	 * @param telephone 手机号
	 * @param email 邮箱
	 * @param sex 性别
	 * @param idcard 身份证号码
	 * @param role 家庭角色
	 */
	public User(String username, String password,  int familyid, String telephone, String email, int sex,
			String idcard, String role) {
		super();
		//this.id = id;
		this.username = username;
		this.password = password;
		//this.ru = ru;
		this.familyid = familyid;
		this.telephone = telephone;
		this.email = email;
		this.sex = sex;
		this.idcard = idcard;
		this.role = role;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getRu() {
		return ru;
	}
	public void setRu(int ru) {
		this.ru = ru;
	}
	public int getFamilyid() {
		return familyid;
	}
	public void setFamilyid(int familyid) {
		this.familyid = familyid;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public String getIdcard() {
		return idcard;
	}
	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	public String getRandomCode() {
		return randomCode;
	}
	public void setRandomCode(String randomCode) {
		this.randomCode = randomCode;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", ru=" + ru + ", familyid="
				+ familyid + ", telephone=" + telephone + ", email=" + email + ", sex=" + sex + ", idcard=" + idcard
				+ ", role=" + role + "]";
	}
	
}
