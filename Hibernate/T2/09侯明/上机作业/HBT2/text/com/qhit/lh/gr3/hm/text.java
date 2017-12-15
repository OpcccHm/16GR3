package com.qhit.lh.gr3.hm;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.qhit.lh.gr3.hm.bean.Emp;
import com.qhit.lh.gr3.hm.bean.User;
import com.qhit.lh.gr3.hm.service.BaseService;
import com.qhit.lh.gr3.hm.service.impl.BaseServiceImpl;

public class text {
	private BaseService bs=new BaseServiceImpl();
	
	@org.junit.Test
	public void add(){
		Emp emp = new Emp();
		emp.setName("wow");;
		emp.setSex("男");
		emp.setBirthday("1997");
		
		User user =new User();
		user.setName("admin");
		user.setPassword("123456");
		
		user.setEmp(emp);
		emp.setUser(user);
		
		bs.add(emp);
	}
	public void update(){
		Emp emp = new Emp(); 
		emp.setEid(2);
		emp.setName("tom");
		emp.setSex("女");
		emp.setBirthday("1994");
		
		User user = new User();
		user.setName("tom");
		user.setPassword("654321");
		
		
		emp.setUser(user);
		user.setEmp(emp);
		
		bs.update(emp);
		
	}
	public void delete(){
		Emp emp = new Emp(); 
		emp = (Emp) bs.getObjectById(emp, 2);
		bs.delete(emp);
		
	}
	public void query(){
		List<Object> list = bs.getAll("from emp");
		for (Object object : list) {
			Emp emp = (Emp) object;
			System.out.println(emp.toString());
		}
		
	}
	

}
