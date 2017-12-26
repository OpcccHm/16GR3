package com.qhit.lh.gr3.hm.service;

import java.util.List;

import com.qhit.lh.gr3.hm.bean.Emp;

public interface BaseService {
	//添加
	public void add(Object obj);
	//删除
	public void delete(Object obj);
	//修改
	public void update(Object obj);
	//查询
	public List<Object> getAll(String fromObject);
	//根据ID查询
	public Object getObjectById(Class clazz, int id);
	//根据名字模糊查询
	public List<Emp> getEmpByName(String name);
}
