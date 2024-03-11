package com.RestAPI.Dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studentId;
	
	private String stdName;
	
	private String stdSubject;
	
	private int totalMarks;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int studentId, String stdName, String stdSubject, int totalMarks) {
		super();
		this.studentId = studentId;
		this.stdName = stdName;
		this.stdSubject = stdSubject;
		this.totalMarks = totalMarks;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public String getStdSubject() {
		return stdSubject;
	}

	public void setStdSubject(String stdSubject) {
		this.stdSubject = stdSubject;
	}

	public int getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", stdName=" + stdName + ", stdSubject=" + stdSubject
				+ ", totalMarks=" + totalMarks + "]";
	}
	
	

}
