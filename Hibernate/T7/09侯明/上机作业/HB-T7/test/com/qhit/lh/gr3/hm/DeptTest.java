/**
 * 
 */
package com.qhit.lh.gr3.hm;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qhit.lh.gr3.hm.bean.Dept;
import com.qhit.lh.gr3.hm.bean.Emp;
import com.qhit.lh.gr3.hm.dao.impl.BaseDaoImpl;
import com.qhit.lh.gr3.hm.service.BaseService;
import com.qhit.lh.gr3.hm.service.impl.BaseServiceImpl;

/**
 * @author 侯明
 * TODO
 * 2017-12-25下午6:50:16
 */
public class DeptTest {
	private BaseService baseService = new BaseServiceImpl();
	
	@Test
	public void add(){
		Dept dept = new Dept();
		dept.setDname("联盟部");
		
		Emp emp1 = new Emp();
		emp1.setEname("美国队长");
		
		dept.getEmps().add(emp1);
		
		baseService.add(dept);
	}
	
	@Test
	public void delete(){
		Dept dept = (Dept) baseService.getObjectById(Dept.class, 1);
		
		baseService.delete(dept);
	}
	
	@Test
	public void update(){
		Dept dept = (Dept) baseService.getObjectById(Dept.class, 2);
		dept.setDname("复仇者联盟部");
		
		baseService.update(dept);
	}
	
	@Test
	public void query(){
		Dept dept = (Dept) baseService.getObjectById(Dept.class, 1);
		
		for(Emp emp : dept.getEmps()){
			System.out.println(dept.getDname()+":"+emp.getEname());
		}
	}
	
}
