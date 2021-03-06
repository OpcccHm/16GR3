package com.qhit.lh.gr3.hm.service.impl;

import java.util.List;

import com.qhit.lh.gr3.hm.bean.Emp;
import com.qhit.lh.gr3.hm.dao.BaseDao;
import com.qhit.lh.gr3.hm.dao.impl.BaseDaoImpl;
import com.qhit.lh.gr3.hm.service.BaseService;

public class BaseServiceImpl implements BaseService {

	private BaseDao baseDao = new BaseDaoImpl();
	
	@Override
	public void add(Object obj) {
		// TODO Auto-generated method stub
		baseDao.add(obj);
	}

	@Override
	public void delete(Object obj) {
		// TODO Auto-generated method stub
		baseDao.delete(obj);
	}

	@Override
	public void update(Object obj) {
		// TODO Auto-generated method stub
		baseDao.update(obj);
	}

	@Override
	public List<Object> getAll(String fromObject) {
		return baseDao.getAll(fromObject);
	}

	@Override
	public Object getObjectById(Class clazz, int id) {
		// TODO Auto-generated method stub
		return baseDao.getObjectById(clazz, id);
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.gr3.hm.service.BaseService#getEmpByName(java.lang.String)
	 */
	@Override
	public List<Emp> getEmpByName(String name) {
		// TODO Auto-generated method stub
		return baseDao.getEmpByName(name);
	}

}
