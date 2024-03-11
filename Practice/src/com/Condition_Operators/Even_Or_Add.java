package com.Condition_Operators;

import java.util.Scanner;

public class Even_Or_Add {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num = sc.nextInt();
		if (num%2==0) {
			System.out.println("its a Even Number:"+num);
		}
		else {
			System.out.println("Its ADD Number:"+num);
		}
	}

}
