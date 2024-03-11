package com.POJOS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Objects;

public class Bus {
	
	private String busNameString;
	
	private Integer noOfSeatString;
	
	private String departureTimeString;
	
	private String sourceString;
	
	private Integer avilableSeatString;
	
	private String destinationString;
	
	private Integer busCoString;
	
	private Integer busIDInteger;
	
	public Bus() {
		super();
	}

	public Bus(String busNameString, Integer noOfSeatString, String departureTimeString, String sourceString,
			Integer avilableSeatString, String destinationString, Integer busCoString, Integer busIDInteger) {
		super();
		this.busNameString = busNameString;
		this.noOfSeatString = noOfSeatString;
		this.departureTimeString = departureTimeString;
		this.sourceString = sourceString;
		this.avilableSeatString = avilableSeatString;
		this.destinationString = destinationString;
		this.busCoString = busCoString;
		this.busIDInteger = busIDInteger;
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

	public Integer getAvilableSeatString() {
		return avilableSeatString;
	}

	public void setAvilableSeatString(Integer avilableSeatString) {
		this.avilableSeatString = avilableSeatString;
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
	public int hashCode() {
		return Objects.hash(avilableSeatString, busCoString, busIDInteger, busNameString, departureTimeString,
				destinationString, noOfSeatString, sourceString);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bus other = (Bus) obj;
		return Objects.equals(avilableSeatString, other.avilableSeatString)
				&& Objects.equals(busCoString, other.busCoString) && Objects.equals(busIDInteger, other.busIDInteger)
				&& Objects.equals(busNameString, other.busNameString)
				&& Objects.equals(departureTimeString, other.departureTimeString)
				&& Objects.equals(destinationString, other.destinationString)
				&& Objects.equals(noOfSeatString, other.noOfSeatString)
				&& Objects.equals(sourceString, other.sourceString);
	}

	@Override
	public String toString() {
		return "Bus [busNameString=" + busNameString + ", noOfSeatString=" + noOfSeatString + ", departureTimeString="
				+ departureTimeString + ", sourceString=" + sourceString + ", avilableSeatString=" + avilableSeatString
				+ ", destinationString=" + destinationString + ", busCoString=" + busCoString + ", busIDInteger="
				+ busIDInteger + "]";
	}
	

	

}
