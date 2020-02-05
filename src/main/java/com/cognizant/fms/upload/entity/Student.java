package com.cognizant.fms.upload.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
  
	@Id
	private Long studentId;
    private String studentEmail;
    private String studentName;
    private String purchasedPackage;
  
    public Student() {}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getPurchasedPackage() {
		return purchasedPackage;
	}

	public void setPurchasedPackage(String purchasedPackage) {
		this.purchasedPackage = purchasedPackage;
	}

	public Student(Long studentId, String studentEmail, String studentName, String purchasedPackage) {
		super();
		this.studentId = studentId;
		this.studentEmail = studentEmail;
		this.studentName = studentName;
		this.purchasedPackage = purchasedPackage;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentEmail=" + studentEmail + ", studentName=" + studentName
				+ ", purchasedPackage=" + purchasedPackage + "]";
	}

	

	
}