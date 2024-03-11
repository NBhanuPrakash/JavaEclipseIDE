package com.SignInSignUp.DTO;

public class userLogin {
	
	private String userEmail;
	
	private String password;

	public userLogin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public userLogin(String userEmail, String password) {
		super();
		this.userEmail = userEmail;
		this.password = password;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
