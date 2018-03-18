/**
 * 
 */
package com.qhit.lh.gr3.hm.exam.common.bean;

/**
 * @author 侯明
 * TODO
 * 2018-1-2下午8:22:26
 */
public class User {
	private String name;
	private String pwd;
	private String role;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String pwd, String role) {
		super();
		this.pwd = pwd;
		this.role = role;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	
}
