/**
 * 
 */
package com.qhit.lh.gr3.hm;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.qhit.lh.gr3.hm.bean.Dept;
import com.qhit.lh.gr3.hm.bean.Emp;
import com.qhit.lh.gr3.hm.bean.User;
import com.qhit.lh.gr3.hm.service.BaseService;
import com.qhit.lh.gr3.hm.service.impl.BaseServiceImpl;

/**
 * @author 侯明
 * TODO
 * 2017-12-25下午6:50:29
 */
public class EmpTest {
	private BaseService baseService = new BaseServiceImpl();
	
	@Test
	public void add(){
		Emp emp = new Emp();
		emp.setEname("罗杰斯");
		User user = new User();
		user.setUname("meidui");
		user.setPassword("123456");
		
		Dept dept = (Dept) baseService.getObjectById(Dept.class, 1);
		
		emp.setUser(user);
		user.setEmp(emp);
		
		emp.setDept(dept);
		baseService.add(emp);
	}
	
	@Test
	public void sel(){
		List<Emp> list = baseService.getEmpByName("%斯");
		for(Emp emp : list){
			System.out.println(emp.getDeptId()+":"+emp.getEname());
		}
	}
}
