package com.POJOS;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Register {
	
	public static Map<PersonUser, String> map = new HashMap<>();
	public static Scanner sc = new Scanner(System.in);
	public static void account(Connection connection) throws SQLException {
		String fullnameString = createfullName();
		String mobileNString = createMobileN();
		String genderString = creategender();
		String emailString = createEmail();
		String passString = createPassword();	
		
		PersonUser pUser = new PersonUser(fullnameString, mobileNString, genderString, emailString, passString);
		map.put(pUser, emailString);
		Controller.createUser(connection,pUser);
	
	}

	public static String createfullName() {
		Print("Enter Your First Name:");
		String firstNString = sc.next();
		Print("Enter Your Last Name:");
		String lastNString = sc.next();
		return firstNString + lastNString;
	}

	public static String createMobileN() {
		Print("Enter Your Mobile Number:");
		String mobileNString = sc.next();
		while (mobileNString.length() < 10) {
			Print("It's Inavlid Number Please re enter your Mobile Number");
			mobileNString = sc.next();
		}
		return mobileNString;
	}

	public static String creategender() {
		Print("Enter your Gender");
		String genderString = sc.next();
		while (!(genderString.equalsIgnoreCase("male") || genderString.equalsIgnoreCase("female")
				|| genderString.equalsIgnoreCase("Others"))) {
			Print("It's Invalid Gender ... Please enter correct Your Gender");
			genderString = sc.next();
		}
		return genderString;

	}

	public static String createEmail() {
		Print("Enter Your Email Address");
		String emailString = sc.next();
		Pattern pattern = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");
		Matcher matcher = pattern.matcher(emailString);
		while (!matcher.matches()) {
			Print("Its Invalid Email Id Please Enter your Correct Email ID");
			emailString = sc.next();
			matcher = pattern.matcher(emailString);
		}
		return emailString;
	}

	public static String createPassword() {
		Print("Enter Your Password");
		String passwordString = sc.next();
		Print("ENter Your COnform Password");
		String conformPassString = sc.next();
		while (!conformPassString.equals(passwordString)) {
			Print("Its Invalid Password... Please enter Conform Password");
			conformPassString = sc.next();
		}
		return conformPassString;
	}
	
	public static void Print(String printString) {
		System.out.println(printString);
	}

}
