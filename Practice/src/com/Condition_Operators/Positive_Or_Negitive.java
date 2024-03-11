package com.Condition_Operators;

import java.util.Scanner;

public class Positive_Or_Negitive {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (num==0) {           
			System.out.println("Its Zero:"+num);
			
		}
		else {
	
		
		System.out.println((num>=1)?"Positive":"Negitive");
		}
	}

}
