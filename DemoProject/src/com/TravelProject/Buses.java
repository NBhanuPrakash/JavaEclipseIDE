package com.TravelProject;

import java.util.Objects;


public class Buses {
	
	private String busNameString;
	
	private Integer noOfSeatString;
	
	private String departureTimeString;
	
	private String sourceString;
	
	private String destinationString;
	
	private Integer busCoString;
	
	private Integer busIDInteger;

	public Buses() {
		super();
	}

	public Buses(String busNameString, Integer noOfSeatString, String departureTimeString, String sourceString,
			String destinationString, Integer busCoString, Integer busInteger) {
		super();
		this.busNameString = busNameString;
		this.noOfSeatString = noOfSeatString;
		this.departureTimeString = departureTimeString;
		this.sourceString = sourceString;
		this.destinationString = destinationString;
		this.busCoString = busCoString;
		this.busIDInteger=busInteger;
	}

	public String getBusNameString() {
		return busNameString;
	}

	public void setBusNameString(String busNameString) {
		this.busNameString = busNameString;
	}

	public Integer getNoOfSeatString() {
		return noOfSeatString;
	}

	public void setNoOfSeatString(Integer noOfSeatString) {
		this.noOfSeatString = noOfSeatString;
	}

	public String getDepartureTimeString() {
		return departureTimeString;
	}

	public void setDepartureTimeString(String departureTimeString) {
		this.departureTimeString = departureTimeString;
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

	public Integer getBusCoString() {
		return busCoString;
	}

	public void setBusCoString(Integer busCoString) {
		this.busCoString = busCoString;
	}
	

	public Integer getBusIDInteger() {
		return busIDInteger;
	}

	public void setBusIDInteger(Integer busIDInteger) {
		this.busIDInteger = busIDInteger;
	}

	@Override
	public String toString() {
		return "Buses [busNameString=" + busNameString + ", noOfSeatString=" + noOfSeatString + ", departureTimeString="
				+ departureTimeString + ", sourceString=" + sourceString + ", destinationString=" + destinationString
				+ ", busCoString=" + busCoString + ",busIDInteger=" + busIDInteger + ",]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(busCoString, busNameString, departureTimeString, destinationString, noOfSeatString,
				sourceString,busIDInteger);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Buses other = (Buses) obj;
		return Objects.equals(busCoString, other.busCoString) && Objects.equals(busNameString, other.busNameString)
				&& Objects.equals(departureTimeString, other.departureTimeString)
				&& Objects.equals(destinationString, other.destinationString)
				&& Objects.equals(noOfSeatString, other.noOfSeatString)
				&& Objects.equals(sourceString, other.sourceString)
				&& Objects.equals(busIDInteger, other.busIDInteger);
		
	}
	
	

}
