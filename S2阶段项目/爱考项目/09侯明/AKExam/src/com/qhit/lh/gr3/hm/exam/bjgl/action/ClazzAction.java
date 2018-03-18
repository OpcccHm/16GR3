package com.qhit.lh.gr3.hm.exam.bjgl.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.qhit.lh.gr3.hm.exam.bjgl.bean.ClassInfo;
import com.qhit.lh.gr3.hm.exam.bjgl.dao.ClazzDao;
import com.qhit.lh.gr3.hm.exam.bjgl.dao.ClazzDaoImpl;

public class ClazzAction extends ActionSupport {
	private ClazzDao clazzDao = new ClazzDaoImpl();
	
	public List<ClassInfo> getClazzList(){
		return clazzDao.getClazzList();
	}
}
