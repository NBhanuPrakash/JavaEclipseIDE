package com.demoproject;


public class Employeedata implements Comparable<Employeedata> {
	private int empId;
	
	private String empName;
	
	private String city;

	public Employeedata() {
		super();
	}

	public Employeedata(int empId, String empName, String city) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.city = city;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Employeedata [empId=" + empId + ", empName=" + empName + ", city=" + city + "]";
	}

	@Override
	public int compareTo(Employeedata empidd) {
		return this.empId>=empidd.empId?1:-1;
	}

	
	
	

	
	
	

}
