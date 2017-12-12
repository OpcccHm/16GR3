/**
 * 
 */
package com.qhit.lh.gr3.hm.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.qhit.lh.gr3.hm.bean.User;
import com.qhit.lh.gr3.hm.service.UserService;
import com.qhit.lh.gr3.hm.service.impl.UserServiceImpl;

/**
 * @author 侯明
 * TODO
 * 2017-12-12下午12:31:06
 */
public class UserAction extends ActionSupport{
	private UserService us = new UserServiceImpl();
	private List<User> users = new ArrayList<User>();
	private User user = new User();
	
	/*
	 * 查询
	 */
	public String all(){
		users= us.getAll("from User");
		
		return "allSuccess";
	}
	/*
	 * 添加
	 */
	public String add(){
		us.add(user);
		return "addSuccess";
	}
	/*
	 * 删除
	 */
	public String del(){
		us.delete(user);
		return "delSuccess";
	}
	/*
	 * 进入修改页面
	 */
	public String toupd(){
		
		return "toupdSuccess";
	}
	/*
	 * 修改
	 */
	public String upd(){
		us.update(user);
		return "updSuccess";
	}
	
	public List<User> getList() {
		return users;
	}
	public void setList(List<User> list) {
		this.users = list;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}
	
}
