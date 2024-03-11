package com.TravelProjectmain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


import com.TravelProject.*;

public class Services {
	public static Scanner sc = new Scanner(System.in);
	public static boolean exitflag = true;
	public static Map<String, User> map = new HashMap<>();
	
	public static void menu() {

		
		while(exitflag) {
			Print("Press 1 : Create account ");
			Print("Press 2 : Login account ");
			Print("Press 3 : Plan Journey ");
			Print("Enter Your Option");
			int usrchioce = sc.nextInt();
			switch (usrchioce) {
			case 1:
				account();
				break;
				
			case 2:
				LoginContext();
				break;
				
			case 3:
				BusServices.plainJourney();
				break;
				


			default:
				throw new Exception("Its Invalid OPtion");
			}
		}
	}
	
	public static void account() {
		String fullnameString = createfullName();
		String mobileNString = createMobileN();
		String genderString = creategender();
		String emailString = createEmail();
		String passString = createPassword();
		User user = new User(fullnameString, mobileNString, genderString, emailString, passString);
		List<User> list = new ArrayList<>();
		list.add(user);
		map.put(emailString, user);
		System.out.println("Registration Sucessfully....!!");
		
		
	}
	
	public static String createfullName() {
		Print("Enter Your First Name:");
		String firstNString = sc.next();
		Print("Enter Your Last Name:");
		String lastNString = sc.next();
		return firstNString+lastNString;
	}
	public static String createMobileN() {
		Print("Enter Your Mobile Number:");
		String mobileNString = sc.next();
		while(mobileNString.length()<10) {
			Print("It's Inavlid Number Please re enter your Mobile Number");
			mobileNString= sc.next();
		}
		return mobileNString;
	}
	
	public static String creategender() {
		Print("Enter your Gender");
		String genderString = sc.next();
		while(!(genderString.equalsIgnoreCase("male")||genderString.equalsIgnoreCase("female")||genderString.equalsIgnoreCase("Others"))) {
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
		while(!matcher.matches()) {
			Print("Its Invalid Email Id Please Enter your Correct Email ID");
			emailString = sc.next();
			matcher = pattern.matcher(emailString);
		}
		return emailString;
	}
	public static String createPassword() {
		Print("Enter Your Password");
		String passwordString= sc.next();
		Print("ENter Your COnform Password");
		String conformPassString=sc.next();
		while(!conformPassString.equals(passwordString)) {
			Print("Its Invalid Password... Please enter Conform Password");
			conformPassString= sc.next();
		}
		return conformPassString;
	}
	
	public static void LoginContext() {
		Print("Enter Your Email Id:");
		String emailString = sc.next();
		User emUser = map.get(emailString);
		
		while(emUser == null) {
			Print("Inavlid Email Id Please Enter Your Correct Email ID...");
			emailString=sc.next();
			emUser=map.get(emailString);
		}
		if (emUser != null) {
			Print("Enter Your Password");
			String passwordString = sc.next();
			int LoginCount=0;
			while(!emUser.getPasswordString().equals(passwordString)) {
				LoginCount++;
				if (LoginCount>5) {
					Print("Your Account Is Blocked...");
					System.exit(0);
				}
				Print("Inavlid Password... Please Enter Your Correct Password..");
				passwordString = sc.next();
			}
			if (emUser.getPasswordString().equals(passwordString)) {
				Print("SuceesFully Logined...!");
			}
			
		}
	}
	

	public static void Print(String print) {
		System.out.println(print);
		
	}

}
