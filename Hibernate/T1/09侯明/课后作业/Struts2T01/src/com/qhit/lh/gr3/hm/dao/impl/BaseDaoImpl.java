package com.qhit.lh.gr3.hm.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.qhit.lh.gr3.hm.dao.BaseDao;
import com.qhit.lh.gr3.hm.utils.HibernateSessionFactory;

public class BaseDaoImpl implements BaseDao {

	@Override
	public void add(Object obj) {
		//获取session对象
		Session session = HibernateSessionFactory.getSession();
		//开启事务
		Transaction ts = session.beginTransaction();
		//执行添加
		session.save(obj);
		//提交事务
		ts.commit();
		//释放资源
		HibernateSessionFactory.closeSession();
		
	}

	@Override
	public void delete(Object obj) {
		//获取session对象
		Session session = HibernateSessionFactory.getSession();
		//开启事务
		Transaction ts = session.beginTransaction();
		//执行删除
		session.delete(obj);
		//提交事务
		ts.commit();
		//释放资源
		HibernateSessionFactory.closeSession();
		
	}

	@Override
	public void update(Object obj) {
		//获取session对象
		Session session = HibernateSessionFactory.getSession();
		//开启事务
		Transaction ts = session.beginTransaction();
		//执行修改
		session.update(obj);
		//提交事务
		ts.commit();
		//释放资源
		HibernateSessionFactory.closeSession();
		
	}

	@Override
	public List<Object> getAll(String fromObject) {
		//获取session对象
		Session session = HibernateSessionFactory.getSession();
		//开启事务
		Transaction ts = session.beginTransaction();
		//获取查询器对象
		Query query = session.createQuery(fromObject);
		List<Object> list = query.list();
		//释放资源
		HibernateSessionFactory.closeSession();
		return list;
	}

	@Override
	public Object getObjectById(Object obj, int id) {
		//获取session对象
		Session session = HibernateSessionFactory.getSession();
		//开启事务
		Transaction ts = session.beginTransaction();
		//根据ID查询出对象
		obj = session.get(obj.getClass(), id);
		//提交事务
		ts.commit();
		//释放资源
		HibernateSessionFactory.closeSession();
		return obj;
	}

}
