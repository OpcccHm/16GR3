/**
 * 
 */
package com.qhit.lh.gr3.hm.exam.kmgl.bean;

import java.util.HashSet;
import java.util.Set;

import com.qhit.lh.gr3.hm.exam.tkgl.bean.MachineQuestion;
import com.qhit.lh.gr3.hm.exam.tkgl.bean.WrittenQuestion;

/**
 * @author 侯明
 * TODO
 * 2018-1-2下午8:33:58
 */
public class Course {
	
	private Integer csId;
	private String csName;
	private String stage;
	private String major;
	
	//1-n
	private Set<WrittenQuestion> writtenQuestions = new HashSet<>();
	private Set<MachineQuestion> machineQuestions = new HashSet<>();
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(Integer csId, String csName, String stage, String major) {
		super();
		this.csId = csId;
		this.csName = csName;
		this.stage = stage;
		this.major = major;
	}

	public Course(String csName, String stage) {
		super();
		this.csName = csName;
		this.stage = stage;
	}

	public Integer getCsId() {
		return csId;
	}

	public void setCsId(Integer csId) {
		this.csId = csId;
	}

	public String getCsName() {
		return csName;
	}

	public void setCsName(String csName) {
		this.csName = csName;
	}

	public String getStage() {
		return stage;
	}

	public void setStage(String stage) {
		this.stage = stage;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public Set<WrittenQuestion> getWrittenQuestions() {
		return writtenQuestions;
	}

	public void setWrittenQuestions(Set<WrittenQuestion> writtenQuestions) {
		this.writtenQuestions = writtenQuestions;
	}

	public Set<MachineQuestion> getMachineQuestions() {
		return machineQuestions;
	}

	public void setMachineQuestions(Set<MachineQuestion> machineQuestions) {
		this.machineQuestions = machineQuestions;
	}
	
}
