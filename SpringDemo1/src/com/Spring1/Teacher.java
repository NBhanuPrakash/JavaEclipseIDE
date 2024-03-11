package com.Spring1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("tec1")

public class Teacher {
	
	@Value("${teacherId}")
	private String teacherName;
	
	@Value("${teacherName}")
	private String teacherId;
	
	@Autowired
	private Students students;

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Teacher(String teacherName, String teacherId, Students students) {
		super();
		this.teacherName = teacherName;
		this.teacherId = teacherId;
		this.students = students;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}

	public Students getStudents() {
		return students;
	}

	public void setStudents(Students students) {
		this.students = students;
	}
	
	

}
