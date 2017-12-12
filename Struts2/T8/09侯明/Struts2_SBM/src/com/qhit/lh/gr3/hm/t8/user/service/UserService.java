/**
 * 
 */
package com.qhit.lh.gr3.hm.t8.user.service;

import java.util.List;

import com.qhit.lh.gr3.hm.t8.user.bean.User;

/**
 * @author 侯明
 * TODO
 * 2017-12-12上午10:32:06
 */
public interface UserService {
	
	/**
	 * @return
	 * 查询所有的用户
	 * @throws Exception 
	 */
	public List<User> getAll() throws Exception;
	
	/**
	 * @param user
	 * @return
	 * 添加用户
	 */
	public int addUser(User user);

	/**
	 * @param userName
	 * @param userPassword
	 * @return
	 * 登陆业务
	 */
	public User doLogin(String userName,String userPassword);
}
