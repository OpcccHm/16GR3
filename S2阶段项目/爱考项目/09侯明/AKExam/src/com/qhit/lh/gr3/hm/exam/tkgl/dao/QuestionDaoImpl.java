/**
 * 
 */
package com.qhit.lh.gr3.hm.exam.tkgl.dao;

import java.util.List;
import java.util.Map;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.RestoreAction;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Transaction;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.qhit.lh.gr3.hm.exam.common.bean.PageBean;
import com.qhit.lh.gr3.hm.exam.common.dao.BaseDao;
import com.qhit.lh.gr3.hm.exam.kmgl.bean.Course;
import com.qhit.lh.gr3.hm.exam.tkgl.bean.WrittenQuestion;

/**
 * @author 侯明
 * TODO
 * 2018-1-9下午8:22:38
 */
public class QuestionDaoImpl extends BaseDao implements QuestionDao {

	@Override
	public int getQuestionsMax(int csId, String qtype, String degree) {
		// TODO Auto-generated method stub
		Criteria criteria = getSession().createCriteria(WrittenQuestion.class)
				.add(Restrictions.eq("csId",csId))
				.add(Restrictions.eq("qtype",qtype))
				.add(Restrictions.eq(degree, degree));
		
		ProjectionList projectionList = Projections.projectionList()
				.add(Projections.count("qid"));
		
		criteria.setProjection(projectionList);
		long num = (long) criteria.list().get(0);
		return (int)num;
	}

	
	@Override
	public List<Course> getCourseInfo(Map parameter) {
		// TODO Auto-generated method stub
		StringBuffer hql = new StringBuffer();
		hql.append("select course from Course course where 1 = 1");
		//拼接HQL
		if(parameter.get("major") != null && !"".equals(parameter.get("major"))){
			hql.append(" and course.major = :major");
		}
		if(parameter.get("stage") != null && !"".equals(parameter.get("stage"))){
			 hql.append(" and course.stage = :stage");
		}
		//获取查询器
		Query query = getSession().createQuery(hql.toString());
		//设置参数
		if(parameter.get("major") != null && !"".equals(parameter.get("major"))){
			query.setString("major", (String)parameter.get("major"));
		}
		if(parameter.get("stage") != null && !"".equals(parameter.get("stage"))){
			query.setString("stage", (String) parameter.get("major"));
		}
		//执行查询
		return query.list();
	}

	
	@Override
	public PageBean<WrittenQuestion> getWrittenList(
			PageBean<WrittenQuestion> pageBean, Course course, int PageIndex) {
		// TODO Auto-generated method stub
		//HQL语句
		StringBuffer hql = new StringBuffer();
		hql.append("select w from WrittenQuestion w where w.csId = :csId");
		//获取查询器
		Query query = getSession().createQuery(hql.toString());
		//设置分页查询参数
		query.setInteger("csId", course.getCsId());
		//总记录数
		int count = query.list().size();
		pageBean.setTotalNumber(count);
		pageBean.setPageSize(PageIndex);
		//当前页数据
		List<WrittenQuestion> items = query.setFirstResult(pageBean.getCurrentIndex()-1*pageBean.getPageSize())
				.setMaxResults(pageBean.getPageSize())
				.list();
		pageBean.setItems(items);
		return pageBean;
	}

	
	@Override
	public void addWrittenQuestion(WrittenQuestion writtenQuestion) {
		// TODO Auto-generated method stub
		//开启事务
		Transaction ts = getSession().beginTransaction();
		//执行添加，返回新纪录的主键
		long id = (Integer) getSession().save(writtenQuestion);
		//提交事务
		ts.commit();
	}

	
	@Override
	public WrittenQuestion getWrittenQuestionById(
			WrittenQuestion writtenQuestion) {
		// TODO Auto-generated method stub
		return (WrittenQuestion) getSession().get(WrittenQuestion.class, writtenQuestion.getQid());
	}

	
	@Override
	public void updateWrittenQuestion(WrittenQuestion writtenQuestion) {
		// TODO Auto-generated method stub
		//清除session中缓存对象
		getSession().clear();
		Transaction ts = getSession().beginTransaction();
		getSession().update(writtenQuestion);
		ts.commit();
	}

	
	@Override
	public void inportWrittenQuestions(List<WrittenQuestion> listWQuestions) {
		// TODO Auto-generated method stub
		//开启事务
		Transaction ts = getSession().beginTransaction();
		for(WrittenQuestion writtenQuestion : listWQuestions){
			//执行添加返回新纪录主键
			getSession().save(writtenQuestion);
		}
		//提交事务
		ts.commit();
	}


	@Override
	public List<WrittenQuestion> getQuestionsByType(int csId, String qtype,
			String degree) {
		// TODO Auto-generated method stub
		Criteria criteria = getSession().createCriteria(WrittenQuestion.class)
				.add(Restrictions.eq("csId", csId))
				.add(Restrictions.eq("qtype", qtype))
				.add(Restrictions.eq("degree", degree));
		
		return criteria.list();
	}

}
