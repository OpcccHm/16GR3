/** 
 * 
 */
package com.qhit.lh.gr3.hm.exam.tkgl.action;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;
import com.qhit.lh.gr3.hm.exam.common.bean.PageBean;
import com.qhit.lh.gr3.hm.exam.kmgl.bean.Course;
import com.qhit.lh.gr3.hm.exam.tkgl.bean.WrittenQuestion;
import com.qhit.lh.gr3.hm.exam.tkgl.service.QuestionService;
import com.qhit.lh.gr3.hm.exam.tkgl.service.QuestionServiceImpl;

/**
 * @author 侯明
 * TODO
 * 2018年1月10日上午11:38:06
 */
public class QuestionAction extends ActionSupport{
	private QuestionService questionService = new QuestionServiceImpl();
	private Course course;	//课程
	private String major;	//专业
	private String stage;	//阶段
	private WrittenQuestion writtenQuestion;	//笔试对象
	private List<Course> listCourses = new ArrayList<>();
	//实体列表分页数据
	private PageBean<WrittenQuestion> pageBean = new PageBean<>();
	private int pageIndex = 1;	//指定页，初始化为1
	//导入试题集合
	private List<WrittenQuestion> listWQuestions = new ArrayList<>();
	//导入文件对象
	private File questionfile;
	
	private int radioEasyMax,radioNormalMax,radioDiffMax,cbEasyMax,cbNormalMax,cbDiffMax;
	
	
	/**
	 * @return
	 * 题库列表
	 */
	public String getCourseInfo(){
		//设置参数
		Map<String , Object> parameter = new HashMap<>();
		if(major != null && !"".equals(major)){
			parameter.put("major", major);
		}
		if(stage != null && !"".equals(stage)){
			parameter.put("stage", stage);
		}
		//查询题库列表数据
		listCourses = questionService.getCourseInfo(parameter);
		return "listCourse";
	}
}
