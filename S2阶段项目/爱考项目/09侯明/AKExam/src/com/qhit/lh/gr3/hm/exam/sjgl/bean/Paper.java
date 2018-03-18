/**
 * 
 */
package com.qhit.lh.gr3.hm.exam.sjgl.bean;

import java.util.HashSet;
import java.util.Set;

import com.qhit.lh.gr3.hm.exam.kmgl.bean.Course;
import com.qhit.lh.gr3.hm.exam.tkgl.bean.WrittenQuestion;

/**
 * @author 侯明
 * TODO
 * 2018年1月9日下午5:32:43
 */
public class Paper {
	
	private Integer pid;
	private String pname;
	private Integer ptime;
	private Integer ptotalScore;
	private Integer csId;
	private Integer qtotal;
	private Integer qscore;
	private String ptype;
	private String pstate;
	
	//n-1
	private Course course;
	//1-n
	private Set<PaperClass> paperClasses = new HashSet<>();
	//m-n
	private Set<WrittenQuestion> writtenQuestions = new HashSet<>();
	
	public Paper() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Paper(String pname, Integer ptime, Integer ptotalScore,
			Integer csId, Integer qtotal, Integer qscore, String ptype,
			String pstate, Course course, Set<PaperClass> paperClasses) {
		super();
		this.pname = pname;
		this.ptime = ptime;
		this.ptotalScore = ptotalScore;
		this.csId = csId;
		this.qtotal = qtotal;
		this.qscore = qscore;
		this.ptype = ptype;
		this.pstate = pstate;
		this.course = course;
		this.paperClasses = paperClasses;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Integer getPtime() {
		return ptime;
	}

	public void setPtime(Integer ptime) {
		this.ptime = ptime;
	}

	public Integer getPtotalScore() {
		return ptotalScore;
	}

	public void setPtotalScore(Integer ptotalScore) {
		this.ptotalScore = ptotalScore;
	}

	public Integer getCsId() {
		return csId;
	}

	public void setCsId(Integer csId) {
		this.csId = csId;
	}

	public Integer getQtotal() {
		return qtotal;
	}

	public void setQtotal(Integer qtotal) {
		this.qtotal = qtotal;
	}

	public Integer getQscore() {
		return qscore;
	}

	public void setQscore(Integer qscore) {
		this.qscore = qscore;
	}

	public String getPtype() {
		return ptype;
	}

	public void setPtype(String ptype) {
		this.ptype = ptype;
	}

	public String getPstate() {
		return pstate;
	}

	public void setPstate(String pstate) {
		this.pstate = pstate;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Set<PaperClass> getPaperClasses() {
		return paperClasses;
	}

	public void setPaperClasses(Set<PaperClass> paperClasses) {
		this.paperClasses = paperClasses;
	}

	public void setWrittenQuestions(Set<WrittenQuestion> lisQuestions) {
		// TODO Auto-generated method stub
		this.writtenQuestions = writtenQuestions;
	}
	
}
