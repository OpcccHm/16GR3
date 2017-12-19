package com.qhit.lh.gr3.hm.bean;

public class User {
	private Integer uid;
	private String uname;
	private String password;
	//一对一关系映射对象
	private Emp emp;
	
	public User(Integer uid, String uname, String password, Emp emp) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.password = password;
		this.emp = emp;
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
	public Emp getEmp() {
		return emp;
	}
	public void setEmp(Emp emp) {
		this.emp = emp;
	}
	
	
	
}
