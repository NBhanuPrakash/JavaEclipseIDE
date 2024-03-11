package com.jacksonDataBindingDto;

public class Address {
	
	private String doorNumber;
	
	private String colonyName;
	
	private String cityName;
	
	private String stateName;
	
	private int pincode;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(String doorNumber, String colonyName, String cityName, String stateName, int pincode) {
		super();
		this.doorNumber = doorNumber;
		this.colonyName = colonyName;
		this.cityName = cityName;
		this.stateName = stateName;
		this.pincode = pincode;
	}

	public String getDoorNumber() {
		return doorNumber;
	}

	public void setDoorNumber(String doorNumber) {
		this.doorNumber = doorNumber;
	}

	public String getColonyName() {
		return colonyName;
	}

	public void setColonyName(String colonyName) {
		this.colonyName = colonyName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	

}
