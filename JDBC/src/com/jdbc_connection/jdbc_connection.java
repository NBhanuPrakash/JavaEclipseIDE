package com.jdbc_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc_connection {


	public static void main(String[] args) {

		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "root", "Bhanu@898");
			Statement statement = connection.createStatement();
			String createtableString = "create table jdbc(id int, name varchar(35), phone int, date date)";
			String imsertTableString = "insert into jdbc(id,name,phone,date) values(251,'Bhanu',99896,'2023-08-02')";
//			statement.execute(createtableString);
			statement.executeUpdate(imsertTableString);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
