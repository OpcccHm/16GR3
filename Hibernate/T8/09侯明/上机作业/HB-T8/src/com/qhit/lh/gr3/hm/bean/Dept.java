/**
 * 
 */
package com.qhit.lh.gr3.hm.bean;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 侯明
 * TODO
 * 2017年12月25日上午9:20:59
 */
public class Dept {
	private Integer deptid;
	private String dname;
	private String address;
	
	private Set<Emp> emps;

	public Dept(Integer deptid, String dname, String address, Set<Emp> emps) {
		super();
		this.deptid = deptid;
		this.dname = dname;
		this.address = address;
		this.emps = emps;
	}

	public Dept(Integer deptid, String dname, String address) {
		super();
		this.deptid = deptid;
		this.dname = dname;
		this.address = address;
	}

	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getDeptid() {
		return deptid;
	}

	public void setDeptid(Integer deptid) {
		this.deptid = deptid;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Set<Emp> getEmps() {
		return emps;
	}

	public void setEmps(Set<Emp> emps) {
		this.emps = emps;
	}
	
	
}
