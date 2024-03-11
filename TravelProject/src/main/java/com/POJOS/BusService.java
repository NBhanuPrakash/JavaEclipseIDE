package com.POJOS;




public class BusService {
	
	private String customerString;
	
	private int ref_Id;
	
	private String sourceString;
	
	private String destinationString;
	
	private String timeString;
	
	private String dateData;
	
	private int age;
	
	private int seatNum;
	
	private int totalCost;

	public BusService() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public BusService(String customerString, int ref_Id, String sourceString, String destinationString,
			String timeString, String dateData,  int seatNum,int age,int totalCost) {
		super();
		this.customerString = customerString;
		this.ref_Id = ref_Id;
		this.sourceString = sourceString;
		this.destinationString = destinationString;
		this.timeString = timeString;
		this.dateData = dateData;
		this.seatNum = seatNum;
		this.age=age;
		this.totalCost=totalCost;
	}



	public String getCustomerString() {
		return customerString;
	}

	public void setCustomerString(String customerString) {
		this.customerString = customerString;
	}

	public int getRef_Id() {
		return ref_Id;
	}

	public void setRef_Id(int ref_Id) {
		this.ref_Id = ref_Id;
	}

	public String getSourceString() {
		return sourceString;
	}

	public void setSourceString(String sourceString) {
		this.sourceString = sourceString;
	}

	public String getDestinationString() {
		return destinationString;
	}

	public void setDestinationString(String destinationString) {
		this.destinationString = destinationString;
	}

	public String getTimeString() {
		return timeString;
	}

	public void setTimeString(String timeString) {
		this.timeString = timeString;
	}

	public String getDateData() {
		return dateData;
	}

	public void setDateData(String dateString) {
		this.dateData = dateString;
	}
	

	public int getSeatNum() {
		return seatNum;
	}



	public void setSeatNum(int seatNum) {
		this.seatNum = seatNum;
	}
	


	public int getTotalCost() {
		return totalCost;
	}



	public void setTotalCost(int totalCost) {
		this.totalCost = totalCost;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}


	
	


	@Override
	public String toString() {
		return "BusService [customerString=" + customerString + ", ref_Id=" + ref_Id + ", sourceString=" + sourceString
				+ ", destinationString=" + destinationString + ", timeString=" + timeString + ", dateData=" + dateData
				+ ", age=" + age + ", seatNum=" + seatNum + ", totalCost=" + totalCost + "]";
	}





}
