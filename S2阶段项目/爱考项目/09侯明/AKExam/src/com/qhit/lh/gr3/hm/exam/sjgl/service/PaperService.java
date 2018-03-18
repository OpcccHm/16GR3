/**
 * 
 */
package com.qhit.lh.gr3.hm.exam.sjgl.service;

import java.util.List;
import java.util.Map;

import com.qhit.lh.gr3.hm.exam.common.bean.PageBean;
import com.qhit.lh.gr3.hm.exam.sjgl.bean.Paper;
import com.qhit.lh.gr3.hm.exam.sjgl.bean.PaperClass;

/**
 * @author 侯明
 * TODO
 * 2018-1-11上午11:13:42
 */
public interface PaperService {
	
	/**
	 *@param paper
	 */
	public void createByChoose(Paper paper);
	
	/**
	 *@param paperClass
	 *@param paper
	 */
	public void startExam(List<PaperClass> paperClasses, Paper paper);
	
	/**
	 * 结束考试
	 */
	public void endExam(Paper paper);
	
	/**
	 *@param paper
	 *随机组卷
	 */
	public void createPaperRandom(Paper paper);
	
	/**
	 * @param pageBean
	 * @param parameter
	 * @param pageIndex
	 * @return
	 * 查询试卷列表
	 */
	public PageBean<Paper> getPaperList(PageBean<Paper> pageBean , Map<String , Object> parameter , int pageIndex); 
}
