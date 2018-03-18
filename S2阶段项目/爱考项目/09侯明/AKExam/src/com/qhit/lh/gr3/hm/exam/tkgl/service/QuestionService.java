package com.qhit.lh.gr3.hm.exam.tkgl.service;

import java.util.List;
import java.util.Map;

import com.qhit.lh.gr3.hm.exam.common.bean.PageBean;
import com.qhit.lh.gr3.hm.exam.kmgl.bean.Course;
import com.qhit.lh.gr3.hm.exam.tkgl.bean.WrittenQuestion;

/**
 * @author 侯明
 * TODO
 * 2018年1月10日上午10:55:34
 */
public interface QuestionService {
	
	/**
	 * @return
	 * 获取试题集合
	 */
	public List<WrittenQuestion> getQuestionsByType(int csId,String qtype,String degree);
	
	/**
	 * @return
	 * 获取题目数
	 */
	public int getQuestionsMax(int csId,String qtype,String degree);
	
	/**
	 * 题库管理
	 * @param parameter
	 * @return
	 * 题库列表
	 */
	public List<Course> getCourseInfo(Map parameter);
	
	/**
	 * @param pageBean
	 * @param course
	 * @param PageIndex
	 * @return
	 * 笔试题列表分页数据
	 */
	public PageBean<WrittenQuestion> getWrittenList(
			PageBean<WrittenQuestion> pageBean,
			Course course,
			int PageIndex);
	
	/**
	 * @param writtenQuestion
	 * 添加笔试题
	 */
	public void addWrittenQuestion(WrittenQuestion writtenQuestion);
	
	/**
	 * @param writtenQuestion
	 * @return
	 * 根据ID查询试题
	 */
	public WrittenQuestion getWrittenQuestionById(WrittenQuestion writtenQuestion);
	
	/**
	 * @param writtenQuestion
	 * 更新试题
	 */
	public void updateWrittenQuestion(WrittenQuestion writtenQuestion);
	
	/**
	 * @param listWQuestions
	 * 批量导入笔试题
	 */
	public void inportWrittenQuestions(List<WrittenQuestion> listWQuestions);
}
