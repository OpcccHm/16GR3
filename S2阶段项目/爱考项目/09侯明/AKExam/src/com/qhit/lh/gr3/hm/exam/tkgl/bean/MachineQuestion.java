/**
 * 
 */
package com.qhit.lh.gr3.hm.exam.tkgl.bean;

import com.qhit.lh.gr3.hm.exam.kmgl.bean.Course;

/**
 * @author 侯明
 * TODO
 * 2018-1-9下午7:49:35
 */
public class MachineQuestion {

	private Integer qid;
	private String qtitle;
	private String degree;
	private Integer csId;
	private String chapter;
	
	private Course course;

	public MachineQuestion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MachineQuestion(Integer qid, String qtitle, String degree,
			Integer csId, String chapter) {
		super();
		this.qid = qid;
		this.qtitle = qtitle;
		this.degree = degree;
		this.csId = csId;
		this.chapter = chapter;
	}

	public Integer getQid() {
		return qid;
	}

	public void setQid(Integer qid) {
		this.qid = qid;
	}

	public String getQtitle() {
		return qtitle;
	}

	public void setQtitle(String qtitle) {
		this.qtitle = qtitle;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public Integer getCsId() {
		return csId;
	}

	public void setCsId(Integer csId) {
		this.csId = csId;
	}

	public String getChapter() {
		return chapter;
	}

	public void setChapter(String chapter) {
		this.chapter = chapter;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
	
}
