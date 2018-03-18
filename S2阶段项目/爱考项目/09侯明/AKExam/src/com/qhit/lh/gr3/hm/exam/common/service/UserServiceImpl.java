/**
 * 
 */
package com.qhit.lh.gr3.hm.exam.common.service;

import com.qhit.lh.gr3.hm.exam.common.bean.User;
import com.qhit.lh.gr3.hm.exam.common.dao.UserDao;
import com.qhit.lh.gr3.hm.exam.common.dao.UserDaoImpl;

/**
 * @author 侯明
 * TODO
 * 2018年1月4日下午5:28:19
 */
public class UserServiceImpl implements UserService {
	private UserDao userDao = new UserDaoImpl();

	/* (non-Javadoc)
	 * @see com.qhit.lh.gr3.hm.exam.common.service.UserService#login(com.qhit.lh.gr3.hm.exam.common.bean.User)
	 */
	@Override
	public User login(User user) {
		// TODO Auto-generated method stub
		return userDao.login(user);
	}

}
