package com.stu.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="StudentD")
public class Student {
	@Id
	private Integer stdId;//setter getter created for all fields and to string created for all fields
	
	private String stdName;
	private String stdEmail;
	private long stdPhone;
	private String stdDob;
	private int stdAge;
	private String courseName;
	private long courseFee;
public Integer getStdId() {
		return stdId;
	}
	public void setStdId(Integer stdId) {
		this.stdId = stdId;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public String getStdEmail() {
		return stdEmail;
	}
	public void setStdEmail(String stdEmail) {
		this.stdEmail = stdEmail;
	}
	public long getStdPhone() {
		return stdPhone;
	}
	public void setStdPhone(long stdPhone) {
		this.stdPhone = stdPhone;
	}
	public String getStdDob() {
		return stdDob;
	}
	public void setStdDob(String stdDob) {
		this.stdDob = stdDob;
	}
	public int getStdAge() {
		return stdAge;
	}
	public void setStdAge(int stdAge) {
		this.stdAge = stdAge;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public long getCourseFee() {
		return courseFee;
	}
	public void setCourseFee(long courseFee) {
		this.courseFee = courseFee;
	}
	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", stdEmail=" + stdEmail + ", stdPhone=" + stdPhone
				+ ", stdDob=" + stdDob + ", stdAge=" + stdAge + ", courseName=" + courseName + ", courseFee="
				+ courseFee + "]";
	}


}
