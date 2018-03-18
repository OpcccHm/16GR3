package com.qhit.lh.gr3.hm.exam.jsgl.bean;

import java.util.Date;

import com.qhit.lh.gr3.hm.exam.common.bean.User;

/**
 * @author 侯明
 * TODO
 * 2018年1月9日下午5:08:38
 */
public class Teacher {
	
	private String tid;
	private String tname;
	private String sex;
	private Date brithday;
	private String education;
	private String tel;
	private String post;
	private String remarks;
	
	//单向1-1
	private User user;

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Teacher(String tname, String sex, String post) {
		super();
		this.tname = tname;
		this.sex = sex;
		this.post = post;
	}

	public Teacher(String tname, String sex, Date brithday, String education,
			String tel, String post, String remarks) {
		super();
		this.tname = tname;
		this.sex = sex;
		this.brithday = brithday;
		this.education = education;
		this.tel = tel;
		this.post = post;
		this.remarks = remarks;
	}

	public String getTid() {
		return tid;
	}

	public void setTid(String tid) {
		this.tid = tid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Date getBrithday() {
		return brithday;
	}

	public void setBrithday(Date brithday) {
		this.brithday = brithday;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
}
