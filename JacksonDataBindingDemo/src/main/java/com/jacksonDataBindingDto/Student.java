package com.jacksonDataBindingDto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Student{
	
	private String stdName;
	
	private int stdId;
	
	private String stdSubject;
	
	private Address address;
	

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	

	public Student(String stdName, int stdId, String stdSubject, Address address) {
		super();
		this.stdName = stdName;
		this.stdId = stdId;
		this.stdSubject = stdSubject;
		this.address = address;
	}




	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	public String getStdSubject() {
		return stdSubject;
	}

	public void setStdSubject(String stdSubject) {
		this.stdSubject = stdSubject;
	}
	

	public Address getAddress() {
		return address;
	}




	public void setAddress(Address address) {
		this.address = address;
	}




	@Override
	public String toString() {
		return "Student [stdName=" + stdName + ", stdId=" + stdId + ", stdSubject=" + stdSubject + "]";
	}
	
	

}
