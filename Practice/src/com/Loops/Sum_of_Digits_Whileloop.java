package com.Loops;

import java.util.Scanner;

public class Sum_of_Digits_Whileloop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int tep=0;
		int sum=0;
		while(num>0) {
			tep=num%10;
			sum=sum+tep;
			num=num/10;
			
		}
		System.out.println(sum);
	}

}
