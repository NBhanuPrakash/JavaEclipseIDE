package com.Demo2;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class Rowmapper1 implements RowMapper<Worker> {

	@Override
	public Worker mapRow(ResultSet rs, int rowNum) throws SQLException {
		Worker worker = new Worker();
		worker.setId(rs.getInt(1));
		worker.setFirstname(rs.getString(2));
		worker.setLastname(rs.getString(3));
		worker.setSalary(rs.getInt(4));
		worker.setJoiningDate(rs.getString(5));
		worker.setDepartment(rs.getString(6));
		return worker;
	}

}
