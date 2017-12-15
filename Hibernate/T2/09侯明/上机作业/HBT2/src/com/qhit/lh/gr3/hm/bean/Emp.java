package com.qhit.lh.gr3.hm.bean;

public class Emp {
	private int eid;
	private String name;
	private String sex;
	private String birthday;
	
	private User user;

	public Emp(int eid, String name, String sex, String birthday, User user) {
		super();
		this.eid = eid;
		this.name = name;
		this.sex = sex;
		this.birthday = birthday;
		this.user = user;
	}

	public Emp(int eid, String name, String sex, String birthday) {
		super();
		this.eid = eid;
		this.name = name;
		this.sex = sex;
		this.birthday = birthday;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
