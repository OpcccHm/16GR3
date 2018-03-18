package com.qhit.lh.gr3.hm.exam.common.dao;

import com.qhit.lh.gr3.hm.exam.common.bean.User;

/**
 * @author 侯明
 * TODO
 * 2018年1月4日下午5:05:42
 */
public interface UserDao {
	/**
	 * @param user
	 * @return
	 * 登录
	 */
	public User login(User user);
}
