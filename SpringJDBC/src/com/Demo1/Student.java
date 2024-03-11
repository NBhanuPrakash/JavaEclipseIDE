package com.Demo1;

public class Student {
	
	private int id;
	
	private String stdNameString;
	
	private String genderString;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String stdNameString, String genderString) {
		super();
		this.id = id;
		this.stdNameString = stdNameString;
		this.genderString = genderString;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public String getstdString() {
		return stdNameString;
	}
	
	public void setstdString(String stdString) {
		this.stdNameString=stdString;
	}
	
	public String getGenderString() {
		return genderString;
	}
	
	public void setGenderString(String genderString) {
		this.genderString=genderString;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", stdNameString=" + stdNameString + ", genderString=" + genderString + "]";
	}

	
	

}
