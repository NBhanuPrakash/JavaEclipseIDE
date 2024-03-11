package com.serlizationandDeserlization;

import java.io.Serializable;


public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public transient int number;

	public transient String nameString;

	public String emailString;

	public String deptString;

	public Employee() {
		super();
	}

	public Employee(int number, String nameString, String emailString, String deptString) {
		super();
		this.number = number;
		this.nameString = nameString;
		this.emailString = emailString;
		this.deptString = deptString;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	public String getEmailString() {
		return emailString;
	}

	public void setEmailString(String emailString) {
		this.emailString = emailString;
	}

	public String getDeptString() {
		return deptString;
	}

	public void setDeptString(String deptString) {
		this.deptString = deptString;
	}

	@Override
	public String toString() {
		return "employee [number=" + number + ", nameString=" + nameString + ", emailString=" + emailString
				+ ", deptString=" + deptString + "]";
	}

}
