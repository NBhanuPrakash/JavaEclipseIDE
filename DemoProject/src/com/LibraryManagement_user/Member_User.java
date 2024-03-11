package com.LibraryManagement_user;

public class Member_User {
	
	private String nameString;
	
	private Integer idNumberInteger;
	
	private Integer noOfBooksIssuedInteger;

	public Member_User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Member_User(String nameString, Integer idNumberInteger, Integer noOfBooksIssuedInteger) {
		super();
		this.nameString = nameString;
		this.idNumberInteger = idNumberInteger;
		this.noOfBooksIssuedInteger = noOfBooksIssuedInteger;
	}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	public Integer getIdNumberInteger() {
		return idNumberInteger;
	}

	public void setIdNumberInteger(Integer idNumberInteger) {
		this.idNumberInteger = idNumberInteger;
	}

	public Integer getNoOfBooksIssuedInteger() {
		return noOfBooksIssuedInteger;
	}

	public void setNoOfBooksIssuedInteger(Integer noOfBooksIssuedInteger) {
		this.noOfBooksIssuedInteger = noOfBooksIssuedInteger;
	}

	@Override
	public String toString() {
		return "Member_User [nameString=" + nameString + ", idNumberInteger=" + idNumberInteger
				+ ", noOfBooksIssuedInteger=" + noOfBooksIssuedInteger + "]";
	}
	
	

}
