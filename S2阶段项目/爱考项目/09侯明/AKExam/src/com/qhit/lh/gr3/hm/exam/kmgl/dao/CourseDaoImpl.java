/**
 * 
 */
package com.qhit.lh.gr3.hm.exam.kmgl.dao;

import java.util.List;
import java.util.Map;

import org.hibernate.Query;

import com.qhit.lh.gr3.hm.exam.common.dao.BaseDao;
import com.qhit.lh.gr3.hm.exam.kmgl.bean.Course;



/**
 * @author 侯明
 * TODO
 * 2018年1月8日上午11:45:53
 */
public class CourseDaoImpl extends BaseDao implements CourseDao {
	
	
	@Override
	public List<Course> getCoursesList(Map<String, Object> parameter) {
		// TODO Auto-generated method stub
		StringBuffer hql = new StringBuffer("select c from Course c where 1 = 1");
		//拼接HQL语句
		if(parameter.get("major") !=null && !"".equals(parameter.get("major"))){
			hql.append(" and course.major = :major");
		}
		if(parameter.get("stage") !=null && !"".equals(parameter.get("stage"))){
			hql.append(" and course.stage = :stage");
		}
		//获取查询器
		Query query = getSession().createQuery(hql.toString());
		//设置参数
		if(parameter.get("major") !=null && !"".equals(parameter.get("major"))){
			query.setString("major" ,(String) parameter.get("major"));
		}
		if(parameter.get("stage") !=null && !"".equals(parameter.get("stage"))){
			query.setString("stage", (String) parameter.get("stage"));
		}
		//执行查询
		return query.list();
	}

}
