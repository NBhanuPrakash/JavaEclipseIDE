package com.workersTable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DBCalling {
	

	
	public static List<Worker> dbDataList() throws SQLException, ClassNotFoundException{
		List<Worker> workers =null;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection dbConnection = DriverManager.getConnection(Dbusercredentials.DBURL_STRING, Dbusercredentials.USER_STRING, Dbusercredentials.PSSWORD_STRING);
		workers= dataList(dbConnection);
		
		return workers;
		
	}
	
	public static List<Worker> dataList(Connection connection) throws SQLException{
		PreparedStatement prepareStatement = connection.prepareStatement("Select * from worker");
		List<Worker> workers = new ArrayList();
		ResultSet execute = prepareStatement.executeQuery();
		while(execute.next()) {
			int int1 = execute.getInt(1);
			String string = execute.getString(2);
			String string2 = execute.getString(3);
			int int2 = execute.getInt(4);
			String string4 = execute.getString(5);
			String string5 = execute.getString(6);
			Worker worker = new Worker(int1, string, string2, int2, string4, string5);
			workers.add(worker);
		}
		return workers;
	}
	
	public static boolean loginList(User1 user) throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection dbConnection = DriverManager.getConnection(Dbusercredentials.DBURL_STRING, Dbusercredentials.USER_STRING, Dbusercredentials.PSSWORD_STRING);
		PreparedStatement prepareStatement = dbConnection.prepareStatement("select * from user1 where userid=? and password=?");
		prepareStatement.setString(1, user.getUserID());
		prepareStatement.setString(2, user.getPassword());
		boolean execute = prepareStatement.execute();
		return execute;
	}
	

}
