package com.qhit.lh.gr3.hm.bean;


/**
 * @author 侯明
 * TODO
 * 2017-12-12下午12:08:32
 */
public class User {
	private int uid;
	private String uname;
	private String upwd;
	private String sex;
	private String birthday;
	
	public User(int uid, String uname, String upwd, String sex, String birthday) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.upwd = upwd;
		this.sex = sex;
		this.birthday = birthday;
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

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUpwd() {
		return upwd;
	}

	public void setUpwd(String upwd) {
		this.upwd = upwd;
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
	
	
}
