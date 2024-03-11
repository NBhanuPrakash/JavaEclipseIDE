package com.BankProject;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class BankMain {
	static Map<Integer, BackUpClass> userobjMap = new HashMap<>();
	static Scanner scanner = new Scanner(System.in);
	static boolean exit = true;
	public static void main(String[] args) {
		while (exit) {
			Print("Create a New User Account Registration :)");
			Print("Access existing account :)");
			Print("Exit");
			int intUser = scanner.nextInt();
			switch (intUser) {
			case 1:
			{
				userDetails();
				break;
			}

			default:
				break;
			}
			
			
		}
	}
	public static void userDetails() {
		String fullName = captureFullName();
		
	}
	public static String captureFullName() {
		return null;
		
	}
	public static void Print(String msg) {
		System.out.println(msg);
	}

}
