package com.Spring6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Ceo {
	
	private String ceoN;
	
	private String ceoPhN;
	
	@Autowired
	@Qualifier("emp2")  //  i have two refarenace objects we have to use Qualifer...
	private Employee employee;

	public Ceo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ceo(String ceoN, String ceoPhN, Employee employee) {
		super();
		this.ceoN = ceoN;
		this.ceoPhN = ceoPhN;
		this.employee = employee;
	}

	public String getCeoN() {
		return ceoN;
	}

	public void setCeoN(String ceoN) {
		this.ceoN = ceoN;
	}

	public String getCeoPhN() {
		return ceoPhN;
	}

	public void setCeoPhN(String ceoPhN) {
		this.ceoPhN = ceoPhN;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	
	

}
