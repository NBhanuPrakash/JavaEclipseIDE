package com.lamdaExprestion;

import java.util.Scanner;
import java.util.function.Predicate;

public class armstrongnumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your armstrong number:");
		int num= sc.nextInt();
		int orginalnum = num;
		int rev = 0;
		while(num!=0) {
			int rem = num%10;
			rev+=Math.pow(rem, 3);
			num/=10;
		}
		int temp=rev;
		Predicate<Integer> armPredicate = (num1) -> (num1==temp);
		
		System.out.println(armPredicate.test(orginalnum)?("Its a armstrong number"):("Its not armstrong number"));
		
		sc.close();

		
	}



}
