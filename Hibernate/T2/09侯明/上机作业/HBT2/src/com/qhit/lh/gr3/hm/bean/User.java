package com.qhit.lh.gr3.hm.bean;

public class User {
	private int uid;
	private String name;
	private String password;
	
	private Emp emp;

	public User(int uid, String name, String password, Emp emp) {
		super();
		this.uid = uid;
		this.name = name;
		this.password = password;
		this.emp = emp;
	}

	public User(int uid, String name, String password) {
		super();
		this.uid = uid;
		this.name = name;
		this.password = password;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
