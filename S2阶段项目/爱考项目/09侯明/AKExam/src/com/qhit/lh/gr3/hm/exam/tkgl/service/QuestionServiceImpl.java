package com.qhit.lh.gr3.hm.exam.tkgl.service;

import java.util.List;
import java.util.Map;

import com.qhit.lh.gr3.hm.exam.common.bean.PageBean;
import com.qhit.lh.gr3.hm.exam.kmgl.bean.Course;
import com.qhit.lh.gr3.hm.exam.tkgl.bean.WrittenQuestion;
import com.qhit.lh.gr3.hm.exam.tkgl.dao.QuestionDao;
import com.qhit.lh.gr3.hm.exam.tkgl.dao.QuestionDaoImpl;

public class QuestionServiceImpl implements QuestionService {
	private QuestionDao questionDao = new QuestionDaoImpl();
	
	
	@Override
	public int getQuestionsMax(int csId, String qtype, String degree) {
		// TODO Auto-generated method stub
		return questionDao.getQuestionsMax(csId, qtype, degree);
	}

	
	@Override
	public List<Course> getCourseInfo(Map parameter) {
		// TODO Auto-generated method stub
		return questionDao.getCourseInfo(parameter);
	}

	
	@Override
	public PageBean<WrittenQuestion> getWrittenList(
			PageBean<WrittenQuestion> pageBean, Course course, int PageIndex) {
		// TODO Auto-generated method stub
		return questionDao.getWrittenList(pageBean, course, PageIndex);
	}

	
	@Override
	public void addWrittenQuestion(WrittenQuestion writtenQuestion) {
		// TODO Auto-generated method stub
		questionDao.addWrittenQuestion(writtenQuestion);
	}

	
	@Override
	public WrittenQuestion getWrittenQuestionById(
			WrittenQuestion writtenQuestion) {
		// TODO Auto-generated method stub
		return questionDao.getWrittenQuestionById(writtenQuestion);
	}

	
	@Override
	public void updateWrittenQuestion(WrittenQuestion writtenQuestion) {
		// TODO Auto-generated method stub
		questionDao.updateWrittenQuestion(writtenQuestion);
	}

	
	@Override
	public void inportWrittenQuestions(List<WrittenQuestion> listWQuestions) {
		// TODO Auto-generated method stub
		questionDao.inportWrittenQuestions(listWQuestions);
	}


	@Override
	public List<WrittenQuestion> getQuestionsByType(int csId, String qtype,
			String degree) {
		// TODO Auto-generated method stub
		return questionDao.getQuestionsByType(csId, qtype, degree);
	}
	
}
