package com.Spring4;

public class Books {
	
	private String bookNameString;
	
	private String bookAuthor;

	public Books() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Books(String bookNameString, String bookAuthor) {
		super();
		this.bookNameString = bookNameString;
		this.bookAuthor = bookAuthor;
	}

	public String getBookNameString() {
		return bookNameString;
	}

	public void setBookNameString(String bookNameString) {
		this.bookNameString = bookNameString;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	
	

}
