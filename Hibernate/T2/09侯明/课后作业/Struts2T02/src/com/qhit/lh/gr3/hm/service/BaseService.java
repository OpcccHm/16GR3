package com.qhit.lh.gr3.hm.service;

import java.util.List;

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
	public Object getObjectById(Object obj,int id);

}
