package com.SignInSignUp.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.SignInSignUp.DTO.UserRegister;

public class Rowmapper implements RowMapper<UserRegister> {

	@Override
	public UserRegister mapRow(ResultSet result, int arg1) throws SQLException {
		UserRegister user = new UserRegister();
		user.setUserName(result.getString(1));
		user.setEmail(result.getString(2));
		user.setDateOfBirth(result.getString(3));
		user.setPassword(result.getString(4));
		return user;
	}

}
