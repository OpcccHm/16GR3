/**
 * 
 */
package com.qhit.lh.gr3.hm.exam.bjgl.bean;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


import com.qhit.lh.gr3.hm.exam.sjgl.bean.PaperClass;
import com.qhit.lh.gr3.hm.exam.xsgl.bean.Student;

/**
 * @author 侯明
 * TODO
 * 2018-1-2下午8:31:47
 */
public class ClassInfo {
	
	private String ccode;
	private String cname;
	private String major;
	private String insId;
	private String iecId;
	private Date cdate;
	private Integer g1unm;
	private Integer g2unm;
	private Integer g3unm;
	private Integer csId;
	private String cremark;
	
	//1-n
	private Set<Student> students = new HashSet<>();
	
	//1-n
	private Set<PaperClass> paperClasses = new HashSet<>();

	public ClassInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ClassInfo(String ccode, String cname, String major, String insId,
			String iecId, Date cdate) {
		super();
		this.ccode = ccode;
		this.cname = cname;
		this.major = major;
		this.insId = insId;
		this.iecId = iecId;
		this.cdate = cdate;
	}

	public ClassInfo(String ccode, String cname, String major, String insId,
			String iecId, Date cdate, Integer g1unm, Integer g2unm,
			Integer g3unm, Integer csId, String cremark) {
		super();
		this.ccode = ccode;
		this.cname = cname;
		this.major = major;
		this.insId = insId;
		this.iecId = iecId;
		this.cdate = cdate;
		this.g1unm = g1unm;
		this.g2unm = g2unm;
		this.g3unm = g3unm;
		this.csId = csId;
		this.cremark = cremark;
	}

	public String getCcode() {
		return ccode;
	}

	public void setCcode(String ccode) {
		this.ccode = ccode;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getInsId() {
		return insId;
	}

	public void setInsId(String insId) {
		this.insId = insId;
	}

	public String getIecId() {
		return iecId;
	}

	public void setIecId(String iecId) {
		this.iecId = iecId;
	}

	public Date getCdate() {
		return cdate;
	}

	public void setCdate(Date cdate) {
		this.cdate = cdate;
	}

	public Integer getG1unm() {
		return g1unm;
	}

	public void setG1unm(Integer g1unm) {
		this.g1unm = g1unm;
	}

	public Integer getG2unm() {
		return g2unm;
	}

	public void setG2unm(Integer g2unm) {
		this.g2unm = g2unm;
	}

	public Integer getG3unm() {
		return g3unm;
	}

	public void setG3unm(Integer g3unm) {
		this.g3unm = g3unm;
	}

	public Integer getCsId() {
		return csId;
	}

	public void setCsId(Integer csId) {
		this.csId = csId;
	}

	public String getCremark() {
		return cremark;
	}

	public void setCremark(String cremark) {
		this.cremark = cremark;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

	public Set<PaperClass> getPaperClasses() {
		return paperClasses;
	}

	public void setPaperClasses(Set<PaperClass> paperClasses) {
		this.paperClasses = paperClasses;
	}
	
	
	
}
