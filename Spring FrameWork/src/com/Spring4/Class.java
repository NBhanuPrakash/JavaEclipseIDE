package com.Spring4;

public class Class {
	
	
	private String classNameString;
	
	private Students students;
	
	private Teacher teacher;

	public Class() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Class(String classNameString, Students students, Teacher teacher) {
		super();
		this.classNameString = classNameString;
		this.students = students;
		this.teacher = teacher;
	}



	public String getClassNameString() {
		return classNameString;
	}

	public void setClassNameString(String classNameString) {
		this.classNameString = classNameString;
	}

	public Students getStudents() {
		return students;
	}

	public void setStudents(Students students) {
		this.students = students;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	
	

}
