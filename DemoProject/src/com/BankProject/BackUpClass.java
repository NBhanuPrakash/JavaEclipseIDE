package com.BankProject;

import java.util.Objects;

public class BackUpClass {
	
	private String fullName;
	private int aadhar;
	private String userNameString;
	private int dateOfBirth;
	private String gender;
	private int mobileNumber;
	private int accountNumber;
	private int accountbalance;
	private String pancardString;
	private int depositeAmount;
	
	
	public BackUpClass() {
		super();
	}
	
	
	public BackUpClass(String fullName, int aadhar, String userNameString, int dateOfBirth, String gender,
			int mobileNumber, int accountNumber, int accountbalance, String pancardString, int depositeAmount) {
		super();
		this.fullName = fullName;
		this.aadhar = aadhar;
		this.userNameString = userNameString;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.mobileNumber = mobileNumber;
		this.accountNumber = accountNumber;
		this.accountbalance = accountbalance;
		this.pancardString = pancardString;
		this.depositeAmount = depositeAmount;
	}


	public String getFullName() {
		return fullName;
	}


	public void setFullName(String fullName) {
		this.fullName = fullName;
	}


	public int getAadhar() {
		return aadhar;
	}


	public void setAadhar(int aadhar) {
		this.aadhar = aadhar;
	}


	public String getUserNameString() {
		return userNameString;
	}


	public void setUserNameString(String userNameString) {
		this.userNameString = userNameString;
	}


	public int getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public int getMobileNumber() {
		return mobileNumber;
	}


	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


	public int getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}


	public int getAccountbalance() {
		return accountbalance;
	}


	public void setAccountbalance(int accountbalance) {
		this.accountbalance = accountbalance;
	}


	public String getPancardString() {
		return pancardString;
	}


	public void setPancardString(String pancardString) {
		this.pancardString = pancardString;
	}


	public int getDepositeAmount() {
		return depositeAmount;
	}


	public void setDepositeAmount(int depositeAmount) {
		this.depositeAmount = depositeAmount;
	}


	@Override
	public String toString() {
		return "BackUpClass [fullName=" + fullName + ", aadhar=" + aadhar + ", userNameString=" + userNameString
				+ ", dateOfBirth=" + dateOfBirth + ", gender=" + gender + ", mobileNumber=" + mobileNumber
				+ ", accountNumber=" + accountNumber + ", accountbalance=" + accountbalance + ", pancardString="
				+ pancardString + ", depositeAmount=" + depositeAmount + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(aadhar, accountNumber, accountbalance, dateOfBirth, depositeAmount, fullName, gender,
				mobileNumber, pancardString, userNameString);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BackUpClass other = (BackUpClass) obj;
		return aadhar == other.aadhar && accountNumber == other.accountNumber && accountbalance == other.accountbalance
				&& dateOfBirth == other.dateOfBirth && depositeAmount == other.depositeAmount
				&& Objects.equals(fullName, other.fullName) && Objects.equals(gender, other.gender)
				&& mobileNumber == other.mobileNumber && Objects.equals(pancardString, other.pancardString)
				&& Objects.equals(userNameString, other.userNameString);
	}
	
	
	
	
	
	

}
