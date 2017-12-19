package com.qhit.lh.gr3.hm.bean;

import java.util.HashSet;
import java.util.Set;

public class Dept {
	private Integer deptId;
	private String dname;
	
	private Set<Emp> emps = new HashSet<Emp>();

	public Dept(Integer deptId, String dname, Set<Emp> emps) {
		super();
		this.deptId = deptId;
		this.dname = dname;
		this.emps = emps;
	}

	public Dept(Integer deptId, String dname) {
		super();
		this.deptId = deptId;
		this.dname = dname;
	}

	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public Set<Emp> getEmps() {
		return emps;
	}

	public void setEmps(Set<Emp> emps) {
		this.emps = emps;
	}

	
	
}
