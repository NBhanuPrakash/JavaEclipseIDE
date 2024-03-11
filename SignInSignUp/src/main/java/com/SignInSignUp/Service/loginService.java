package com.SignInSignUp.Service;

import com.SignInSignUp.DTO.UserRegister;
import com.SignInSignUp.DTO.userLogin;

public interface loginService {
	
	public void signUpUser(UserRegister userRegister);
	
	public UserRegister signInUser(userLogin userLogin);
		
	public int setPassword(userLogin userRegister);
	
	public UserRegister emailValidate(String email);
	
//	public String sendOtpMail(String toEmail);

}
