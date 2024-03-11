package com.LoginPageService;

import com.LoginPageDTO.UserLogin;

public interface UserService {
	
	public int createUser(UserLogin userLogin);
	
	public UserLogin userLogin(String emai, String Password);
	
	public UserLogin getUser(String email);
	
	public String otpSender(String email);
	
	public UserLogin updateUser(int id, String password);
	
	public String emailSent(String email);

}
