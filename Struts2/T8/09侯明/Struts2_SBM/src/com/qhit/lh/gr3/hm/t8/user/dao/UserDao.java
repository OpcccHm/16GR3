package com.qhit.lh.gr3.hm.t8.user.dao;

import java.util.List;

import com.qhit.lh.gr3.hm.t8.user.bean.User;

public interface UserDao {
	
	/**
	 * @return
	 * @throws Exception
	 * 查询所有用户
	 */
	public List<User> getAll() throws Exception;
	/**
	 * @param userName
	 * @param userPassword
	 * @return
	 * 登录的数据访问
	 */
	public User doLogin(String userName,String userPassword);
	
	/**
	 * @param user
	 * @return
	 * 添加用户
	 */
	public int addUser(User user);
}
