/**
 * 
 */
package com.qhit.lh.gr3.hm.bean;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 侯明
 * TODO
 * 2017-12-20下午4:22:45
 */
public class User {
	private Integer uid;
	private String uname;
	private String password;
	
	private Set<Role> roles = new HashSet<Role>();

	public User(Integer uid, String uname, String password, Set<Role> roles) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.password = password;
		this.roles = roles;
	}
	
	public User(Integer uid, String uname, String password) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.password = password;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	
	
}
