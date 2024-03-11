package com.Condition_Operators;

import java.util.Scanner;

public class Integer {
	public static void mai(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Numbers:");
		int num1 = sc.nextInt();
		System.out.println("Enter the Numbers:");
		int num2 = sc.nextInt();
		if(num1%2==0 && num2%2==0) {
			int sub = num1-num2;
			System.out.println("Differences In two Numbers:"+sub);
		}
		else if(num1%2!=0 && num2%2!=0) {
			int sum = num1+num2;
			System.out.println("Sum of Two Numbers:"+sum);
		}
		else if((num1%2==0 || num1%2!=0) && (num2%2==0 || num2%2!=0)) {
			int multi = num1*num2;
			System.out.println("Product of Two Numbers:"+multi);
		}
	}

}
