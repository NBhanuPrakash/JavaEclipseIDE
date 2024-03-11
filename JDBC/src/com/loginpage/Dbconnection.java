package com.loginpage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Dbconnection {

	public static PreparedStatement getconnection(Connection connection, String username, String password)
			throws SQLException {
		PreparedStatement prestatement = connection
				.prepareStatement("select * from logindet where login_id=? and password=?");
		prestatement.setString(1, username);
		prestatement.setString(2, password);
		ResultSet resultSet = prestatement.executeQuery();
		 if(resultSet.next()) {
			 System.out.println("UsernExits....!!!");
		 }else {
			 System.out.println("User not exits....");
		 }
		return prestatement;
	}

}
