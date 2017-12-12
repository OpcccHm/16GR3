package com.qhit.lh.gr3.hm.dao;

import java.util.List;

public interface UserDao {
	//添加
	public void add(Object obj);
	//删除
	public void delete(Object obj);
	//修改
	public void update(Object obj);
	//查询
	public List<Object> getAll(String fromObject);
}
