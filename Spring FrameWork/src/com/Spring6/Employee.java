package com.Spring6;

public class Employee {
	
	private int id;
	
	private String empString;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String empString) {
		super();
		this.id = id;
		this.empString = empString;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmpString() {
		return empString;
	}

	public void setEmpString(String empString) {
		this.empString = empString;
	}
	
	

}
