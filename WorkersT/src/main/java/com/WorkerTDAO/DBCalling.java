package com.WorkerTDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import com.WorkerTDto.User;

public class DBCalling {
	

	

	
	
	public static boolean loginList(User user) throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection dbConnection = DriverManager.getConnection(Dbusercredentials.DBURL_STRING, Dbusercredentials.USER_STRING, Dbusercredentials.PSSWORD_STRING);
		PreparedStatement prepareStatement = dbConnection.prepareStatement("select * from user1 where userid=? and password=?");
		prepareStatement.setString(1, user.getUserName());
		prepareStatement.setString(2, user.getPassword());
		ResultSet executeQuery = prepareStatement.executeQuery();
		boolean next = executeQuery.next();
		return next;
	}
	

}
