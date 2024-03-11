package com.callblestatment;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.credentials.Dbusercredentials;


public class StoredProcedure {
	public static void main(String[] args) throws SQLException {
		java.sql.Connection connection = DriverManager.getConnection(Dbusercredentials.DBURL_STRING, Dbusercredentials.USER_STRING, Dbusercredentials.PSSWORD_STRING);
		java.sql.CallableStatement callableStatement = connection.prepareCall("{call result2(?,?)}");
		int id = 1005;
		int marks=58;
		callableStatement.setInt(1, marks);
		callableStatement.setInt(2, id);
		int execute = callableStatement.executeUpdate();
		System.out.println(execute);
	}

}
