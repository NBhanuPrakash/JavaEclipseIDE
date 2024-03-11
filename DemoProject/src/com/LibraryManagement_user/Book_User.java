package com.LibraryManagement_user;

public class Book_User {
	
	private String titileString;
	
	private String authorString;
	
	private String isbnString;
	
	private Integer noOfCopiesInteger;
	
	private Integer avilableCopiesInteger;

	public Book_User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book_User(String titileString, String authorString, String isbnString, Integer noOfCopiesInteger,
			Integer avilableCopiesInteger) {
		super();
		this.titileString = titileString;
		this.authorString = authorString;
		this.isbnString = isbnString;
		this.noOfCopiesInteger = noOfCopiesInteger;
		this.avilableCopiesInteger = avilableCopiesInteger;
	}

	public String getTitileString() {
		return titileString;
	}

	public void setTitileString(String titileString) {
		this.titileString = titileString;
	}

	public String getAuthorString() {
		return authorString;
	}

	public void setAuthorString(String authorString) {
		this.authorString = authorString;
	}

	public String getIsbnString() {
		return isbnString;
	}

	public void setIsbnString(String isbnString) {
		this.isbnString = isbnString;
	}

	public Integer getNoOfCopiesInteger() {
		return noOfCopiesInteger;
	}

	public void setNoOfCopiesInteger(Integer noOfCopiesInteger) {
		this.noOfCopiesInteger = noOfCopiesInteger;
	}

	public Integer getAvilableCopiesInteger() {
		return avilableCopiesInteger;
	}

	public void setAvilableCopiesInteger(Integer avilableCopiesInteger) {
		this.avilableCopiesInteger = avilableCopiesInteger;
	}

	@Override
	public String toString() {
		return "Book_User [titileString=" + titileString + ", authorString=" + authorString + ", isbnString="
				+ isbnString + ", noOfCopiesInteger=" + noOfCopiesInteger + ", avilableCopiesInteger="
				+ avilableCopiesInteger + "]";
	}
	
	

}
