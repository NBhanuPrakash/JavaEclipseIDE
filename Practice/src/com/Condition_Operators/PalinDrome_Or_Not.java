package com.Condition_Operators;

import java.util.Scanner;

public class PalinDrome_Or_Not {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp=num;
		int rem=0;
		int rev=0;
		while(num>0) {
			 rem=num%10;
			 rev=rev*10+rem;
			 num=num/10;
		}
		if(temp==rev) {
		System.out.println("Its a Palindrome number:"+rev);
		}
		else {
			System.out.println("It's Not a Palindrome NUmber:"+rev);
		}
		
	}

}
