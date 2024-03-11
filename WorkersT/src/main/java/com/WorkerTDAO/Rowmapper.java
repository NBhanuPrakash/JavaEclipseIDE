package com.WorkerTDAO;

import java.sql.ResultSet;
import java.sql.SQLException;


import com.WorkerTDto.User;

public class Rowmapper implements org.springframework.jdbc.core.RowMapper<User> {

	@Override
	public User mapRow(ResultSet rs, int arg1) throws SQLException {
		User user = new User();
		user.setUserName(rs.getString(1));
		user.setPassword(rs.getString(2));
		return user;
	}

}
