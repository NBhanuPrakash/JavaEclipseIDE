package com.Demo1;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Rowmapper implements org.springframework.jdbc.core.RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student st1 = new Student();
		st1.setId(rs.getInt(1));
		st1.setstdString(rs.getString(2));
		st1.setGenderString(rs.getString(3));
		return st1;
	}

}
