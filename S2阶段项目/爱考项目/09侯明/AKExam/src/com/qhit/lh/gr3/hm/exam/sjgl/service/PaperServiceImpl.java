/**
 * 
 */
package com.qhit.lh.gr3.hm.exam.sjgl.service;

import java.util.List;
import java.util.Map;

import com.qhit.lh.gr3.hm.exam.common.bean.PageBean;
import com.qhit.lh.gr3.hm.exam.sjgl.bean.Paper;
import com.qhit.lh.gr3.hm.exam.sjgl.bean.PaperClass;
import com.qhit.lh.gr3.hm.exam.sjgl.dao.PaperDao;
import com.qhit.lh.gr3.hm.exam.sjgl.dao.PaperDaoImpl;

/**
 * @author 侯明
 * TODO
 * 2018-1-11上午11:19:40
 */
public class PaperServiceImpl implements PaperService {
	private PaperDao paperDao = new PaperDaoImpl();
	
	@Override
	public PageBean<Paper> getPaperList(PageBean<Paper> pageBean,
			Map<String, Object> parameter, int pageIndex) {
		// TODO Auto-generated method stub
		return paperDao.getPaperList(pageBean, parameter, pageIndex);
	}

	@Override
	public void createByChoose(Paper paper) {
		// TODO Auto-generated method stub
		paperDao.createByChoose(paper);
		
	}

	@Override
	public void startExam(List<PaperClass> paperClasses, Paper paper) {
		// TODO Auto-generated method stub
		paperDao.startExam(paperClasses);
		paperDao.updateExam(paper, "考试中");
		
	}

	@Override
	public void endExam(Paper paper) {
		// TODO Auto-generated method stub
		paperDao.updateExam(paper, "考试结束");
		
	}

	@Override
	public void createPaperRandom(Paper paper) {
		// TODO Auto-generated method stub
		paperDao.createPaperRandom(paper);
		
	}

}
