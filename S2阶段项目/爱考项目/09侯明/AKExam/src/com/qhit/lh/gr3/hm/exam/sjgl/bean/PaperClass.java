/**
 * 
 */
package com.qhit.lh.gr3.hm.exam.sjgl.bean;

import java.util.Date;

import com.qhit.lh.gr3.hm.exam.bjgl.bean.ClassInfo;

/**
 * @author 侯明
 * TODO
 * 2018年1月9日下午5:33:22
 */
public class PaperClass {
	
	private Integer pcId;
	private Integer pid;
	private String ccode;
	private Date examDate;
	private Date endDate;
	
	private ClassInfo classInfo;
	
	private Paper paper;

	public PaperClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PaperClass(Integer pid, String ccode, Date examDate, Date endDate) {
		super();
		this.pid = pid;
		this.ccode = ccode;
		this.examDate = examDate;
		this.endDate = endDate;
	}

	public Integer getPcId() {
		return pcId;
	}

	public void setPcId(Integer pcId) {
		this.pcId = pcId;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getCcode() {
		return ccode;
	}

	public void setCcode(String ccode) {
		this.ccode = ccode;
	}

	public Date getExamDate() {
		return examDate;
	}

	public void setExamDate(Date examDate) {
		this.examDate = examDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public ClassInfo getClassInfo() {
		return classInfo;
	}

	public void setClassInfo(ClassInfo classInfo) {
		this.classInfo = classInfo;
	}

	public Paper getPaper() {
		return paper;
	}

	public void setPaper(Paper paper) {
		this.paper = paper;
	}
	
	
}
