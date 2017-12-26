/**
 * 
 */
package com.qhit.lh.gr3.hm.bean;

/**
 * @author 侯明
 * TODO
 * 2017年12月25日上午9:17:07
 */
public class Emp {
	private Integer eid;
	private String ename;
	private String sex;
	private Integer deptid;
	
	private Userinfo userinfo;
	private Dept dept;
	
	/**
	 * @param eid
	 * @param ename
	 * @param sex
	 * @param deptid
	 * @param userinfo
	 * @param dept
	 */
	public Emp(Integer eid, String ename, String sex, Integer deptid,
			Userinfo userinfo, Dept dept) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.sex = sex;
		this.deptid = deptid;
		this.userinfo = userinfo;
		this.dept = dept;
	}
	
	/**
	 * @param eid
	 * @param ename
	 * @param sex
	 * @param deptid
	 */
	public Emp(Integer eid, String ename, String sex, Integer deptid) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.sex = sex;
		this.deptid = deptid;
	}
	
	/**
	 * 
	 */
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

	public Integer getDeptid() {
		return deptid;
	}

	public void setDeptid(Integer deptid) {
		this.deptid = deptid;
	}

	public Userinfo getUserinfo() {
		return userinfo;
	}

	public void setUserinfo(Userinfo userinfo) {
		this.userinfo = userinfo;
	}

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}
	
	
}
