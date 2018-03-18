/**
 * 
 */
package com.qhit.lh.gr3.hm.exam.kmgl.serivce;

import java.util.List;
import java.util.Map;

import com.qhit.lh.gr3.hm.exam.kmgl.bean.Course;

/**
 * @author 侯明
 * TODO
 * 2018-1-8下午3:09:21
 */
public interface CourseService {
	/**
	 * @param paramter
	 * @return
	 * 根据参数查询课程列表数据
	 */
	public List<Course> getCoursesList(Map<String ,Object> parameter);
}
