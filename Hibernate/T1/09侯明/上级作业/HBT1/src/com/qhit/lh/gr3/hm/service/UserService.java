/**
 * 
 */
package com.qhit.lh.gr3.hm.service;

import java.util.List;

import com.qhit.lh.gr3.hm.bean.User;

/**
 * @author 侯明
 * TODO
 * 2017-12-12下午12:20:40
 */
public interface UserService {
	//添加
	public void add(Object obj);
	//删除
	public void delete(Object obj);
	//修改
	public void update(Object obj);
	//查询
	public List<User> getAll(String fromObject);
}
