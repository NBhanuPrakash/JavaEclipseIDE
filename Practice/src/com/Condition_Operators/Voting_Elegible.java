package com.Condition_Operators;

import java.util.Scanner;

public class Voting_Elegible {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Age:");
		byte age = sc.nextByte();
		if(age > 18) {
			System.out.println("Elgible For Voting:"+age);
		}
		else {
			System.out.println("Not Elgible For Voting:"+age);
		}

	}

}
