package com.springProperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("car")
public class Car {
	
	@Value("${carname}")
	private String carName;
	
	@Value("${carId}")
	private int carId;
	
	@Autowired
	private Customers customers;

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(String carName, int carId, Customers customers) {
		super();
		this.carName = carName;
		this.carId = carId;
		this.customers = customers;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public Customers getCustomers() {
		return customers;
	}

	public void setCustomers(Customers customers) {
		this.customers = customers;
	}
	
	

}
