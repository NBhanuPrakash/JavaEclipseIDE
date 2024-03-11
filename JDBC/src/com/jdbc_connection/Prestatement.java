package com.jdbc_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.credentials.Dbusercredentials;

public class Prestatement {

	public static void main(String[] args) {
		try {
			Connection connection = DriverManager.getConnection(Dbusercredentials.DBURL_STRING,
					Dbusercredentials.USER_STRING, Dbusercredentials.PSSWORD_STRING);
			PreparedStatement prestatement = connection.prepareStatement("insert into result(?,?,?,?)");
//			prestatement.setString(1, "nnsaibhanuprakash@gmail.com");
//			prestatement.setInt(2, 9);
//			insertDAta(prestatement);
			prestatement.setInt(1, 1011);
			prestatement.setString(2, "BHanu");
			boolean executeQuery = prestatement.execute();
//			System.out.println(executeQuery+" Rows effected");
			System.out.println(executeQuery);
//			while(executeQuery.next()) {
//				System.out.println(executeQuery.getString(2));
//			}
//			printedData(executeQuery);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

//	private static void printedData(int executeQuery) {
//		while(executeQuery.next()) {
//			System.out.println("worker_id = "+executeQuery.getInt(1));
//		    System.out.println("firstname = "+executeQuery.getString(2));
//		    System.out.println("Lastname = "+executeQuery.getString(3));
//		    System.out.println("salary = "+executeQuery.getString(4));
//		    System.out.println("DateOfJoining = "+executeQuery.getString(5));
//		    System.out.println("Dept = "+executeQuery.getString(6));
//		    
//		}
//	}

	private static void insertDAta(PreparedStatement prestatement) throws SQLException {
		prestatement.setInt(1, 1);
		prestatement.setString(2, "nnsaibhanuprakash@gmail.com");
		prestatement.setString(3, "Bhanu@898");

	}

}
