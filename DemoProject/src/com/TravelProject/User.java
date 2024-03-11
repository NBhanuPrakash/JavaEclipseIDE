package com.TravelProject;

public class User {
	
	private String fullName;
	
	private String mobileNString;
	
	private String genderString;
	
	private String emailIdString;
	
	private String passwordString;
	
	public User() {
		super();
	}

	public User(String fullName, String mobileNString, String genderString, String emailIdString,
			String passwordString) {
		super();
		this.fullName = fullName;
		this.mobileNString = mobileNString;
		this.genderString = genderString;
		this.emailIdString = emailIdString;
		this.passwordString = passwordString;
	}



	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getMobileNString() {
		return mobileNString;
	}

	public void setMobileNString(String mobileNString) {
		this.mobileNString = mobileNString;
	}

	public String getGenderString() {
		return genderString;
	}

	public void setGenderString(String genderString) {
		this.genderString = genderString;
	}

	public String getEmailIdString() {
		return emailIdString;
	}

	public void setEmailIdString(String emailIdString) {
		this.emailIdString = emailIdString;
	}

	public String getPasswordString() {
		return passwordString;
	}

	public void setPasswordString(String passwordString) {
		this.passwordString = passwordString;
	}

	@Override
	public String toString() {
		return "User [fullName=" + fullName + ", mobileNString=" + mobileNString + ", genderString=" + genderString
				+ ", emailIdString=" + emailIdString + ", passwordString=" + passwordString + "]";
	}
	
	
	

}
