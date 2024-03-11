package com.Many_to_One;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Students {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studentId;
	
	private String name;
	
	private String books;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "teacherId")
	private Teacher teacher;

	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Students(int studentId, String name, String books, Teacher teacher) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.books = books;
		this.teacher = teacher;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBooks() {
		return books;
	}

	public void setBooks(String books) {
		this.books = books;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	@Override
	public String toString() {
		return "Students [studentId=" + studentId + ", name=" + name + ", books=" + books + ", teacher=" + teacher
				+ "]";
	}
	
	
	

}
