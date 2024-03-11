package com.LoginPageDAO;

import com.LoginPageDTO.UserLogin;

public interface UserRepo {
	
	public int saveUser(UserLogin userLogin);
	
	public UserLogin login(String email, String password);
	
	public UserLogin getUser(String email);
	
	public UserLogin updateUser(int id, String password);

}
