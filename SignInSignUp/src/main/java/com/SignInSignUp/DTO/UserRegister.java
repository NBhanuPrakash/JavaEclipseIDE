package com.SignInSignUp.DTO;

public class UserRegister {

	
	private String userName;
	
	private String email;
	
	private String dateOfBirth;
	
	private String password;

	public UserRegister() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserRegister(String userName, String email, String dateOfBirth, String password) {
		super();
		this.userName = userName;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
