package com.qhit.lh.gr3.hm.bean;

public class Emp {
	private Integer eid;
	private String ename;
	private String sex;
	private Integer deptId;
	//一对一关系映射对象
	private User user;
	
	private Dept dept;

	public Emp(Integer eid, String ename, String sex, Integer deptId,
			User user, Dept dept) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.sex = sex;
		this.deptId = deptId;
		this.user = user;
		this.dept = dept;
	}

	public Emp(Integer eid, String ename, String sex, Integer deptId) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.sex = sex;
		this.deptId = deptId;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}
	
}
