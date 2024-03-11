package com.Spring5;

import org.springframework.beans.factory.annotation.Autowired;

public class Students {
	
	private String studentName;
	@Autowired
	private Books books;

	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Students(String studentName, Books books) {
		super();
		this.studentName = studentName;
		this.books = books;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Books getBooks() {
		return books;
	}

	public void setBooks(Books books) {
		this.books = books;
	}
	
	

}
