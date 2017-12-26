/**
 * 
 */
package com.qhit.lh.gr3.hm.bean;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 侯明
 * TODO
 * 2017年12月25日上午9:21:12
 */
public class Userinfo {
	private Integer uid;
	private String uname;
	private String password;
	
	private Emp emp;
	private Set<Role> roles = new HashSet<Role>();
	
	public Userinfo(Integer uid, String uname, String password, Emp emp,
			Set<Role> roles) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.password = password;
		this.emp = emp;
		this.roles = roles;
	}
	
	public Userinfo(Integer uid, String uname, String password) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.password = password;
	}
	
	public Userinfo() {
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
	
	public Emp getEmp() {
		return emp;
	}
	
	public void setEmp(Emp emp) {
		this.emp = emp;
	}
	
	public Set<Role> getRoles() {
		return roles;
	}
	
	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
}
