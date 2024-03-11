package com.Demoproject1;


public class Travel implements Comparable<Travel> {
	private String category;
	
	private int driverId;
	
	private String driverName;
	
	private int totalDistance;

	public Travel() {
		super();
	}

	public Travel(String category, int driverId, String driverName, int totalDistance) {
		super();
		this.category = category;
		this.driverId = driverId;
		this.driverName = driverName;
		this.totalDistance = totalDistance;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getDriverId() {
		return driverId;
	}

	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public int getTotalDistance() {
		return totalDistance;
	}

	public void setTotalDistance(int totalDistance) {
		this.totalDistance = totalDistance;
	}

	@Override
	public String toString() {
		return "Travel [category=" + category + ", driverId=" + driverId + ", driverName=" + driverName
				+ ", totalDistance=" + totalDistance + "]";
	}

	

	@Override
	public int compareTo(Travel name) {
		return this.category.compareTo(name.category);
	}
}	
	

	

	
	
	
	
	
	
	


