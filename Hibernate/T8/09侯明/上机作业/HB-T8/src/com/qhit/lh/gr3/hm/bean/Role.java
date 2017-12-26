/**
 * 
 */
package com.qhit.lh.gr3.hm.bean;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 侯明
 * TODO
 * 2017年12月25日上午9:25:56
 */
public class Role {
	private Integer rid;
	private String rname;
	private String memo;
	
	private Set<Userinfo> users = new HashSet<Userinfo>();

	public Role(Integer rid, String rname, String memo, Set<Userinfo> users) {
		super();
		this.rid = rid;
		this.rname = rname;
		this.memo = memo;
		this.users = users;
	}

	public Role(Integer rid, String rname, String memo) {
		super();
		this.rid = rid;
		this.rname = rname;
		this.memo = memo;
	}

	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getRid() {
		return rid;
	}

	public void setRid(Integer rid) {
		this.rid = rid;
	}

	public String getRname() {
		return rname;
	}

	public void setRname(String rname) {
		this.rname = rname;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public Set<Userinfo> getUsers() {
		return users;
	}

	public void setUsers(Set<Userinfo> users) {
		this.users = users;
	}
	
	
}
