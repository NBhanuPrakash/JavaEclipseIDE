package com.jfs;

import java.util.Scanner;

public class Sum_Of_Digits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
		int num = sc.nextInt();
		System.out.println((num%9==0)?9:(num%9));
		}
		finally {
			sc.close();
		}

	}

}
