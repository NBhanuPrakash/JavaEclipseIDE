package com.springProperties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Customers {
	
	@Value("${customerName}")
	private String customerName;
	
	@Value("${customerId}")
	private int customerId;

	public Customers() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customers(String customerName, int customerId) {
		super();
		this.customerName = customerName;
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
	

}
