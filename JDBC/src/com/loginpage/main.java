package com.loginpage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.credentials.Dbusercredentials;

public class main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your User name");
		String userString = scanner.next();
		System.out.println("Enter your Password");
		String passwordString = scanner.next();

		try {
			Connection connection = DriverManager.getConnection(Dbusercredentials.DBURL_STRING,
					Dbusercredentials.USER_STRING, Dbusercredentials.PSSWORD_STRING);
			PreparedStatement prestatement = Dbconnection.getconnection(connection, userString,passwordString);
//			System.out.println(prestatement);
			prestatement.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			scanner.close();
			
		}
	}

}
