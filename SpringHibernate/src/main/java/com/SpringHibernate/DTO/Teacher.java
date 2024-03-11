package com.SpringHibernate.DTO;


import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Teacher {
	@Id
	private int teacherId;
	
	private String teacherName;
	
	private String subjectName;
	


	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Teacher(int teacherId, String teacherName, String subjectName) {
		super();
		this.teacherId = teacherId;
		this.teacherName = teacherName;
		this.subjectName = subjectName;
	}

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}


	
	
	
	

}
