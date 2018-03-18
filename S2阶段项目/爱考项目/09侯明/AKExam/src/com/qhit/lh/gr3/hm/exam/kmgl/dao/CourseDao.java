/**
 * 
 */
package com.qhit.lh.gr3.hm.exam.kmgl.dao;

import java.util.List;
import java.util.Map;

import com.qhit.lh.gr3.hm.exam.kmgl.bean.Course;



/**
 * @author 侯明
 * TODO
 * 2018年1月8日上午11:25:29
 */
public interface CourseDao {
	/**
	 * @param paramter
	 * @return
	 * 根据参数查询课程列表数据
	 */
	public List<Course> getCoursesList(Map<String ,Object> parameter);
}
