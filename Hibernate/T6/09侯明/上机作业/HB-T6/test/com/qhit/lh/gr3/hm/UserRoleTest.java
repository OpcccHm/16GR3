/**
 * 
 */
package com.qhit.lh.gr3.hm;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.qhit.lh.gr3.hm.bean.Role;
import com.qhit.lh.gr3.hm.bean.User;
import com.qhit.lh.gr3.hm.service.BaseService;
import com.qhit.lh.gr3.hm.service.impl.BaseServiceImpl;

/**
 * @author 侯明
 * TODO
 * 2017-12-20下午6:12:46
 */
public class UserRoleTest {
	private BaseService baseservice = new BaseServiceImpl();
	
	@Test
	public void add() {
		Role role = new Role();
		
		role.setRname("部门负责人");
		role.setMemo("管理部门");
		
		User user1 = (User) baseservice.getObjectById(User.class, 1);
		User user2 = (User) baseservice.getObjectById(User.class, 2);
		
		role.getUsers().add(user1);
		role.getUsers().add(user2);
		
		baseservice.add(role);
	}
	
	@Test
	public void delete(){
		Role role = (Role) baseservice.getObjectById(Role.class, 5);
		baseservice.delete(role);
	}
	
	@Test
	public void update(){
		Role role = (Role) baseservice.getObjectById(Role.class, 6);
		role.setMemo("安全部门");
		
		User user1 = (User) baseservice.getObjectById(User.class, 3);
		User user2 = (User) baseservice.getObjectById(User.class, 4);
		
		role.getUsers().add(user1);
		role.getUsers().add(user2);
		baseservice.update(role);
	}
	
	@Test
	public void getAll(){
		List<User> list = (List) baseservice.getAll("from User");
		for (User user : list) {
			System.out.println(user.toString());
		}
	}
	
	@Test
	public void getRole() {
		Role role = (Role) baseservice.getObjectById(Role.class, 3);
		System.out.println(role.toString());
		System.out.println("分配的账号");
		for (Object object : role.getUsers()) {
			System.out.println(object.toString());
		}
	}
	
	@Test
	public void getUser() {
		User user = (User) baseservice.getObjectById(User.class, 1);
		System.out.println(user.toString());
		System.out.println("分配的角色");
		for (Object object : user.getRoles()) {
			System.out.println(object.toString());
		}
	}
}
