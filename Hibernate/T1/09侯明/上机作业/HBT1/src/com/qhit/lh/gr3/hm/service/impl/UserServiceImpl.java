/**
 * 
 */
package com.qhit.lh.gr3.hm.service.impl;

import java.util.List;

import com.qhit.lh.gr3.hm.bean.User;
import com.qhit.lh.gr3.hm.dao.UserDao;
import com.qhit.lh.gr3.hm.dao.impl.UserDaoImpl;
import com.qhit.lh.gr3.hm.service.UserService;

/**
 * @author 侯明
 * TODO
 * 2017-12-12下午12:22:12
 */
public class UserServiceImpl implements UserService {
	private UserDao ud = new UserDaoImpl();

	/* (non-Javadoc)
	 * @see com.qhit.lh.gr3.hm.service.UserService#add(java.lang.Object)
	 */
	@Override
	public void add(Object obj) {
		// TODO Auto-generated method stub
		ud.add(obj);
		
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.gr3.hm.service.UserService#delete(java.lang.Object)
	 */
	@Override
	public void delete(Object obj) {
		// TODO Auto-generated method stub
		ud.delete(obj);
		
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.gr3.hm.service.UserService#update(java.lang.Object)
	 */
	@Override
	public void update(Object obj) {
		// TODO Auto-generated method stub
		ud.update(obj);
		
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.gr3.hm.service.UserService#getall(java.lang.String)
	 */
	@Override
	public List<User> getAll(String fromObject) {
		// TODO Auto-generated method stub
		List list = ud.getAll(fromObject);
		return list;
	}

}
