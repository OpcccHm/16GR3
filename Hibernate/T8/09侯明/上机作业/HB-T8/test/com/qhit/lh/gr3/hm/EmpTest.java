/**
 * 
 */
package com.qhit.lh.gr3.hm;

import static org.junit.Assert.*;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.junit.Test;

import com.qhit.lh.gr3.hm.bean.Dept;
import com.qhit.lh.gr3.hm.bean.Emp;
import com.qhit.lh.gr3.hm.bean.Userinfo;
import com.qhit.lh.gr3.hm.service.BaseService;
import com.qhit.lh.gr3.hm.service.impl.BaseServiceImpl;
import com.qhit.lh.gr3.hm.utils.HibernateSessionFactory;

/**
 * @author 侯明
 * TODO
 * 2017年12月25日上午10:39:29
 */
public class EmpTest {
	private BaseService baseService = new BaseServiceImpl();
	
	@Test
	public void add(){
		Emp emp = new Emp();
		emp.setEname("斯塔克");
		emp.setSex("M");
		emp.setDeptid(new Integer(1));
		
		Userinfo userinfo = new Userinfo();
		userinfo.setUname("stk");
		userinfo.setPassword("123456");
		
		userinfo.setEmp(emp);
		emp.setUserinfo(userinfo);
		
		Dept dept = new Dept();
		dept = (Dept) baseService.getObjectById(Dept.class, 1);
		
		emp.setDept(dept);
		
		baseService.add(emp);
	}
	
	@Test
	public void update(){
		Emp emp = (Emp) baseService.getObjectById(Emp.class, 1);
		emp.setEname("钢铁侠");
		Dept dept = (Dept) baseService.getObjectById(Dept.class, 2);
		emp.setDept(dept);
		baseService.update(emp);
	}
	
	@Test
	public void delete(){
		Emp emp = (Emp) baseService.getObjectById(Emp.class, 1);
		baseService.delete(emp);
	}
	
	@Test
	public void getAll(){
		List<Object> emps = baseService.getAll("from Emp");
		for(Object object : emps){
			Emp emp = (Emp) object;
			System.out.println(emp.toString());
		}
	}
	
	@Test
	public void getEmpByName(){
		List<Emp> res = baseService.getEmpByName("%斯%");
		for(Emp emp : res){
			System.out.println(emp.getEid()+":"+emp.getEname());;
		}
	}
	
	@Test
	public void getEmpLikeName(){
		Session session = HibernateSessionFactory.getSession();
		
		Criteria criteria = session.createCriteria(Emp.class)
				.add(Restrictions.like("ename", "%袁%"));
		List<Emp> list = criteria.list();
		
		for(Emp emp : list){
			System.out.println(emp.getEid()+":"+emp.getEname());
		}
	}
	
	@Test
	public void getEmpByDeptName(){
		Session session = HibernateSessionFactory.getSession();
		
		Criteria criteria = session.createCriteria(Emp.class)
				.setFetchMode("dept", FetchMode.JOIN)
				.createAlias("dept", "d")
				.add(Restrictions.eq("d.dname", "斯塔克工业大厦"));
		
		List<Emp> list = criteria.list();
		
		for(Emp emp : list){
			System.out.println(emp.getEid()+":"+emp.getEname());
		}
	}
	
	@Test
	public void getDeptInfo(){
		Session session = HibernateSessionFactory.getSession();
		
		Criteria criteria = session.createCriteria(Dept.class)
				.setFetchMode("emps", FetchMode.JOIN)
				.createAlias("emps", "e");
		
		ProjectionList pList = Projections.projectionList()
				.add(Projections.groupProperty("deptid"))
				.add(Projections.groupProperty("dname"))
				.add(Projections.groupProperty("address"))
				.add(Projections.count("e.eid"));
		criteria.setProjection(pList);
		
		List<Object[]> list = criteria.list();
		
		for(Object[] obj : list){
			System.out.println(obj[0]+"|"+obj[1]+"|"+obj[2]+"|"+obj[3]);
		}
	}
}
