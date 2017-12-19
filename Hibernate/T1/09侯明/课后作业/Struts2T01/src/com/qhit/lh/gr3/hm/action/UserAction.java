package com.qhit.lh.gr3.hm.action;

import com.opensymphony.xwork2.ActionSupport;
import com.qhit.lh.gr3.hm.bean.User;
import com.qhit.lh.gr3.hm.service.BaseService;
import com.qhit.lh.gr3.hm.service.impl.BaseServiceImpl;

public class UserAction extends ActionSupport{
	private User user=new User();
	private BaseService bs=new BaseServiceImpl();
	
	/*
	 * 登录方法
	 */
	public String Login(){
		return "LoginSuccess";
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}

	
}
