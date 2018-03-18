package com.qhit.lh.gr3.hm.exam.common.dao;

import org.hibernate.Hibernate;
import org.hibernate.Session;

import com.qhit.lh.gr3.hm.exam.common.utils.HibernateSessionFactory;

/**
 * @author 侯明
 * TODO
 * 2018年1月4日下午5:07:37
 */
public class BaseDao {
	/**
	 * @return
	 * 完成添加笔试题
	 */
	public Session getSession(){
		return HibernateSessionFactory.getSession();
		
	}
}
