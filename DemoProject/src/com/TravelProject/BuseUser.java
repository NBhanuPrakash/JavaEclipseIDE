package com.TravelProject;

import java.util.Objects;


public class BuseUser {

	private String customerNameString;

	private Integer seatNInteger;

	private Integer totalCostDouble;

	private Integer age;

	private Integer refIdInteger;

	private String dateData;
	
	public BuseUser() {
		super();
	}

	public BuseUser(String customerNameString, Integer seatNInteger, Integer totalCostDouble, Integer age,
			Integer refIdInteger, String dateData) {
		super();
		this.customerNameString = customerNameString;
		this.seatNInteger = seatNInteger;
		this.totalCostDouble = totalCostDouble;
		this.age = age;
		this.refIdInteger = refIdInteger;
		this.dateData = dateData;
	}

	public String getCustomerNameString() {
		return customerNameString;
	}

	public void setCustomerNameString(String customerNameString) {
		this.customerNameString = customerNameString;
	}

	public Integer getSeatNInteger() {
		return seatNInteger;
	}

	public void setSeatNInteger(Integer seatNInteger) {
		this.seatNInteger = seatNInteger;
	}

	public Integer getTotalCostDouble() {
		return totalCostDouble;
	}

	public void setTotalCostDouble(Integer totalCostDouble) {
		this.totalCostDouble = totalCostDouble;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getRefIdInteger() {
		return refIdInteger;
	}

	public void setRefIdInteger(Integer refIdInteger) {
		this.refIdInteger = refIdInteger;
	}
	
	

	public String getDateData() {
		return dateData;
	}

	public void setDateData(String dateData) {
		this.dateData = dateData;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, customerNameString, seatNInteger, totalCostDouble, refIdInteger,dateData);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BuseUser other = (BuseUser) obj;
		return age == other.age && Objects.equals(customerNameString, other.customerNameString)
				&& Objects.equals(seatNInteger, other.seatNInteger)
				&& Objects.equals(totalCostDouble, other.totalCostDouble)
				&& Objects.equals(refIdInteger, other.refIdInteger)
				&& Objects.equals(dateData, dateData);

	}

	@Override
	public String toString() {
		return "BuseUser [customerNameString=" + customerNameString + ", seatNInteger=" + seatNInteger
				+ ", totalCostDouble=" + totalCostDouble + ", age=" + age + ",refIdInteger="+refIdInteger+",dateData="+dateData+"]";
	}

}
