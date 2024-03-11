package com.SignInSignUp.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.SignInSignUp.DTO.UserRegister;
import com.SignInSignUp.DTO.userLogin;

@Repository
public class Repositorypage {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public int insertTable(UserRegister register) {
		int update = 0;
		try {
			String userName = register.getUserName();
			String email = register.getEmail();
			String dateOfBirth = register.getDateOfBirth();
			String password = register.getPassword();
			Object[] inputArgs = { userName, email, dateOfBirth, password };
			update = jdbcTemplate.update("insert into register values(?,?,?,?);", inputArgs);
			return update;
		} catch (DataAccessException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return update;
	}

	public UserRegister credentials(userLogin login) {
		String userEmail = login.getUserEmail();
		String password = login.getPassword();
		Rowmapper rowmapper = new Rowmapper();
		UserRegister userRegister = null;

		userRegister = jdbcTemplate.queryForObject("select * from register where email=? and password=?", rowmapper,
				userEmail, password);
		if (userRegister.getEmail() == null && userRegister.getPassword() == null) {
			return credentials(login);
		}

		return userRegister;
	}

	public UserRegister emailValidation(String email) {
		Rowmapper rowmapper = new Rowmapper();
		UserRegister queryForObject = null;
		try {
			queryForObject = jdbcTemplate.queryForObject("select * from register where email=?", rowmapper, email);
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return queryForObject;
	}

	public int setPassword(userLogin userRegister) {
		String email = userRegister.getUserEmail();
		String password = userRegister.getPassword();
		int update = jdbcTemplate.update("update register set password=? where email=?", password, email);
		return update;
	}

}
