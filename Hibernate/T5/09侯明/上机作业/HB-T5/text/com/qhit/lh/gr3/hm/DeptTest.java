/**
 * 
 */
package com.qhit.lh.gr3.hm;

import org.junit.Test;

import com.qhit.lh.gr3.hm.bean.Dept;
import com.qhit.lh.gr3.hm.bean.Emp;
import com.qhit.lh.gr3.hm.service.BaseService;
import com.qhit.lh.gr3.hm.service.impl.BaseServiceImpl;

/**
 * @author 侯明
 * TODO
 * 2017-12-20下午9:36:54
 */
public class DeptTest {
	private BaseService bs = new BaseServiceImpl();
	
	@Test
	public void add(){
		Dept dept = new Dept();
		dept.setDname("党政部");
		
		Emp emp = new Emp();
		emp.setEname("王德发");
		emp.setSex("M");
		emp.setDeptId(17);
		
		dept.getEmps().add(emp);
		bs.add(dept);
	}
	
	@Test
	public void delete(){
		Dept dept = (Dept) bs.getObjectById(Dept.class, 1);
		
		bs.delete(dept);
		
	}
	
	@Test
	public void update(){
		Dept dept = (Dept) bs.getObjectById(Dept.class, 2);
		dept.setDname("美国银河舰队");
		
		bs.update(dept);
	}
	
	@Test
	public void query(){
		Dept dept = (Dept) bs.getObjectById(Dept.class, 1);
		
		for(Emp emp:dept.getEmps()){
			System.out.println(dept.getDname()+":"+emp.getEname());
		}
	}
}
