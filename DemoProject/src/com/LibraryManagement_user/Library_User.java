package com.LibraryManagement_user;

public class Library_User {
	
	private String addBookString;
	
	private String displayBookString;
	
	private String searchBookString;
	
	private String issueBookString;
	
	private String returnBookString;

	public Library_User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Library_User(String addBookString, String displayBookString, String searchBookString, String issueBookString,
			String returnBookString) {
		super();
		this.addBookString = addBookString;
		this.displayBookString = displayBookString;
		this.searchBookString = searchBookString;
		this.issueBookString = issueBookString;
		this.returnBookString = returnBookString;
	}
	
	

	public String getAddBookString() {
		return addBookString;
	}

	public void setAddBookString(String addBookString) {
		this.addBookString = addBookString;
	}

	public String getDisplayBookString() {
		return displayBookString;
	}

	public void setDisplayBookString(String displayBookString) {
		this.displayBookString = displayBookString;
	}

	public String getSearchBookString() {
		return searchBookString;
	}

	public void setSearchBookString(String searchBookString) {
		this.searchBookString = searchBookString;
	}

	public String getIssueBookString() {
		return issueBookString;
	}

	public void setIssueBookString(String issueBookString) {
		this.issueBookString = issueBookString;
	}

	public String getReturnBookString() {
		return returnBookString;
	}

	public void setReturnBookString(String returnBookString) {
		this.returnBookString = returnBookString;
	}

	@Override
	public String toString() {
		return "Library_User [addBookString=" + addBookString + ", displayBookString=" + displayBookString
				+ ", searchBookString=" + searchBookString + ", issueBookString=" + issueBookString
				+ ", returnBookString=" + returnBookString + "]";
	}
	
	

}
