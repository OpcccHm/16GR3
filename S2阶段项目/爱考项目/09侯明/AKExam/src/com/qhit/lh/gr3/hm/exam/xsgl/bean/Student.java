/**
 * 
 */
package com.qhit.lh.gr3.hm.exam.xsgl.bean;

import com.qhit.lh.gr3.hm.exam.common.bean.User;

/**
 * @author 侯明
 * TODO
 * 2018-1-2下午8:03:26
 */
public class Student {
	private String sid;
	private String sname;
	private String sex;
	private String enterSchool;
	private String cCode;
	private String photo;
	private String birthday;
	private String IDCard;
	private String pOutlook;
	private String province;
	private String city;
	private String tel;
	private String address;
	private String ptel;
	private String pRelation;
	private String hostelBuil;
	private String hostelNo;
	private String baseInfol;
	private String eduBg;
	private String remarke;
	
	private User user;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String sname, String sex, String enterSchool, String cCode) {
		super();
		this.sname = sname;
		this.sex = sex;
		this.enterSchool = enterSchool;
		this.cCode = cCode;
	}

	public Student(String sname, String sex, String enterSchool, String cCode,
			String photo, String birthday, String iDCard, String pOutlook,
			String province, String city, String tel, String address,
			String ptel, String pRelation, String hostelBuil, String hostelNo,
			String baseInfol, String eduBg, String remarke) {
		super();
		this.sname = sname;
		this.sex = sex;
		this.enterSchool = enterSchool;
		this.cCode = cCode;
		this.photo = photo;
		this.birthday = birthday;
		IDCard = iDCard;
		this.pOutlook = pOutlook;
		this.province = province;
		this.city = city;
		this.tel = tel;
		this.address = address;
		this.ptel = ptel;
		this.pRelation = pRelation;
		this.hostelBuil = hostelBuil;
		this.hostelNo = hostelNo;
		this.baseInfol = baseInfol;
		this.eduBg = eduBg;
		this.remarke = remarke;
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getEnterSchool() {
		return enterSchool;
	}

	public void setEnterSchool(String enterSchool) {
		this.enterSchool = enterSchool;
	}

	public String getcCode() {
		return cCode;
	}

	public void setcCode(String cCode) {
		this.cCode = cCode;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getIDCard() {
		return IDCard;
	}

	public void setIDCard(String iDCard) {
		IDCard = iDCard;
	}

	public String getpOutlook() {
		return pOutlook;
	}

	public void setpOutlook(String pOutlook) {
		this.pOutlook = pOutlook;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPtel() {
		return ptel;
	}

	public void setPtel(String ptel) {
		this.ptel = ptel;
	}

	public String getpRelation() {
		return pRelation;
	}

	public void setpRelation(String pRelation) {
		this.pRelation = pRelation;
	}

	public String getHostelBuil() {
		return hostelBuil;
	}

	public void setHostelBuil(String hostelBuil) {
		this.hostelBuil = hostelBuil;
	}

	public String getHostelNo() {
		return hostelNo;
	}

	public void setHostelNo(String hostelNo) {
		this.hostelNo = hostelNo;
	}

	public String getBaseInfol() {
		return baseInfol;
	}

	public void setBaseInfol(String baseInfol) {
		this.baseInfol = baseInfol;
	}

	public String getEduBg() {
		return eduBg;
	}

	public void setEduBg(String eduBg) {
		this.eduBg = eduBg;
	}

	public String getRemarke() {
		return remarke;
	}

	public void setRemarke(String remarke) {
		this.remarke = remarke;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
}
