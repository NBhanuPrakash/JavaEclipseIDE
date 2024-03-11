package com.Exception;


import java.text.ParseException;
import java.util.*;

public class Throwss {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws InputMismatchException, ParseException {
		Throwss th = new Throwss();
		th.getnumber();
		getname();
		
		int number = 589;
		
		System.out.println(number);
		
		

	}
	
	public void getnumber() throws ParseException {
		int numbers = sc.nextInt();
		System.out.println(numbers);
		
	}
	
	public static void getname() throws InputMismatchException {
		String str = "bhanu";
		System.out.println(str);
		
	}

}
