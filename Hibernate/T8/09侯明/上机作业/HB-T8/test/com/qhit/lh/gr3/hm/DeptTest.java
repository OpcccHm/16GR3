package com.qhit.lh.gr3.hm;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qhit.lh.gr3.hm.bean.Dept;
import com.qhit.lh.gr3.hm.bean.Emp;
import com.qhit.lh.gr3.hm.bean.Userinfo;
import com.qhit.lh.gr3.hm.service.BaseService;
import com.qhit.lh.gr3.hm.service.impl.BaseServiceImpl;

public class DeptTest {
	private BaseService baseService = new BaseServiceImpl();
	
	@Test
	public void add(){
		Dept dept = new Dept();
		dept.setDname("神盾局");
		dept.setAddress("弗瑞局长");
		
		Emp emp1 = (Emp) baseService.getObjectById(Emp.class, 1);
		dept.getEmps().add(emp1);
		
		Emp emp2 = new Emp();
		emp2.setEname("浩克");
		emp2.setSex("M");
		
		Userinfo userinfo = new Userinfo();
		userinfo.setUname("hk");
		userinfo.setPassword("123456");
		
		emp2.setUserinfo(userinfo);
		userinfo.setEmp(emp2);
		
		emp1.setDept(dept);
		emp2.setDept(dept);
		
	}
	
	@Test
	public void delete(){
		Dept dept = (Dept) baseService.getObjectById(Dept.class, 2);
		baseService.delete(dept);
	}
	
	@Test
	public void update(){
		Dept dept = (Dept) baseService.getObjectById(Dept.class, 1);
		
		dept.setAddress("美国");
		baseService.update(dept);
	}
	
	@Test
	public void query(){
		Dept dept = (Dept) baseService.getObjectById(Dept.class, 2);
		for(Emp emp : dept.getEmps()){
			System.out.println(dept.getDname()+":"+emp.getEname());
		}
	}
}
