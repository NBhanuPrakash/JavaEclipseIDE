package com.jfs;

import java.util.Scanner;


public class Terinary_Operator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the First Number:");
			int firstNum = sc.nextInt();
			System.out.println("Enter Secound NUmber:");
			int secoundNum = sc.nextInt();
			System.out.println("Enter the Third Number:");
			int thirdNum = sc.nextInt();
			int maxNum = (firstNum > secoundNum && firstNum > thirdNum) ? firstNum
					: (secoundNum > thirdNum) ? secoundNum : thirdNum;
			System.out.println("It's Highest Number Is:" + maxNum);
		} finally {
			sc.close();
		}
	}

}