package com.qhit.lh.gr3.hm.exam.bjgl.service;

import java.util.List;

import com.qhit.lh.gr3.hm.exam.bjgl.bean.ClassInfo;

public interface ClazzService {
	
	/**
	 * @return
	 * 获取班级集合
	 */
	public List<ClassInfo> getClazzList();
}
