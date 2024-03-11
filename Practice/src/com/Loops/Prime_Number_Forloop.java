package com.Loops;

import java.util.Scanner;

public class Prime_Number_Forloop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			if(num%i==0) {
				System.out.println("Its a Prime Number:"+i);
			}
			else {
				System.out.println("Its Not a Prime Number:"+i);
			}
			
		}

	}

}
