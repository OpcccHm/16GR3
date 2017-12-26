/**
 * 
 */
package com.qhit.lh.gr3.hm;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qhit.lh.gr3.hm.bean.Role;
import com.qhit.lh.gr3.hm.bean.Userinfo;
import com.qhit.lh.gr3.hm.service.BaseService;
import com.qhit.lh.gr3.hm.service.impl.BaseServiceImpl;

/**
 * @author 侯明
 * TODO
 * 2017-12-26下午8:25:51
 */
public class RoleTest {
	private BaseService baseService = new BaseServiceImpl();
	
	@Test
	public void add(){
		Role role = new Role();
		role.setRname("复仇者no.1");
		role.setMemo("纽约");
		
		Userinfo userinfo = new Userinfo();
		
		role.getUsers().add(userinfo);
		
		baseService.add(role);
	}
	
	@Test
	public void delete() {	
		Role role = (Role) baseService.getObjectById(Role.class, 2);
		
		baseService.delete(role);
	}

	@Test
	public void update() {
		Role role = (Role) baseService.getObjectById(Role.class, 2);
		role.setRname("复仇者on.2");
		role.setMemo("皇后区");
		
		Userinfo aaa = (Userinfo) baseService.getObjectById(Role.class, 3);
		
		role.getUsers().add(aaa);
		
		baseService.update(role);
	}

	@Test
	public void query() {
		Role role = (Role) baseService.getObjectById(Role.class, 2);
		
		for(Userinfo userinfo : role.getUsers()){
			System.out.println(role.getRname()+""+userinfo.getUname());
		}
	}
}
