package com.jdbc_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import com.credentials.*;

public class SelectQuery {

	public static void main(String[] args) {

		try {
			Connection connection = DriverManager.getConnection(Dbusercredentials.DBURL_STRING,
					Dbusercredentials.USER_STRING, Dbusercredentials.PSSWORD_STRING);
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from logindet");
			
//			count column we have to use this method  //
//			ResultSetMetaData metadataString = resultSet.getMetaData();
//			int columnCount = metadataString.getColumnCount();
			
			
//			System.out.println(columnCount);
			while(resultSet.next())
				System.out.println(resultSet.getString(1)+" |"+resultSet.getString(2)+" |"+resultSet.getString(3)+" |");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
