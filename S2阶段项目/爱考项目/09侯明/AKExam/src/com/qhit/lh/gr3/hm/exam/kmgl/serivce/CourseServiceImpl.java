/**
 * 
 */
package com.qhit.lh.gr3.hm.exam.kmgl.serivce;

import java.util.List;
import java.util.Map;

import com.qhit.lh.gr3.hm.exam.kmgl.bean.Course;
import com.qhit.lh.gr3.hm.exam.kmgl.dao.CourseDao;
import com.qhit.lh.gr3.hm.exam.kmgl.dao.CourseDaoImpl;

/**
 * @author 侯明
 * TODO
 * 2018-1-10下午3:11:53
 */
public class CourseServiceImpl implements CourseService {
	private CourseDao courseDao = new CourseDaoImpl();
	
	@Override
	public List<Course> getCoursesList(Map<String, Object> parameter) {
		// TODO Auto-generated method stub
		return courseDao.getCoursesList(parameter);
	}

}
