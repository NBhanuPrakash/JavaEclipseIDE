package com.SpringHibernate.DTO;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Students {
	@Id
	private String studentName;
	
	private int studentId;
	
	private String stdClass;

	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Students(String studentName, int studentId, String stdClass) {
		super();
		this.studentName = studentName;
		this.studentId = studentId;
		this.stdClass = stdClass;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStdClass() {
		return stdClass;
	}

	public void setStdClass(String stdClass) {
		this.stdClass = stdClass;
	}
	
	

}
