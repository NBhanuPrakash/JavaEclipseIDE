package com.Spring4;

public class Students {
	
	private String studentName;
	
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
