package com.credentials;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DbUtilties {
	
	public static Connection getDbConnection(String url, String user, String password) throws SQLException {
		System.out.println("Db connection Processing...");
	try {
		Class.forName("com.mysql.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		Connection connection = DriverManager.getConnection(url, user, password);
		
		System.out.println("Connection SucessFully !!");
		return connection;
	}
	
	public static Statement statementConnect(Connection connection) throws SQLException {
		Statement statement = connection.createStatement();
		return statement;
	}
	
	public static void excute(Statement statement, String operation) throws SQLException {
		if (DMLOperation(operation)) {
			System.out.println("DML Operition are executed..!!");
			statement.executeUpdate(operation);
			
		}
		else {
			System.out.println("DDl Operitions are Executed...");
			statement.execute(operation);
		}
	}
	
	public static boolean DMLOperation(String operation) {
		boolean isDelete = operation.contains("delete") || operation.contains("DELETE");
		boolean isDML = operation.contains("insert") || operation.contains("INSERT") || operation.contains("update") || operation.contains("UPDATE") || isDelete;
		if (!(isDelete && operation.contains("where") || operation.contains("WHERE"))) {
			System.out.println("******Warning******  , Delete must have where clause !!!");
			
		}
		return isDML;
		
		
	}

}
