package com.Loops;

import java.util.Scanner;

public class Tables {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=1; i<=10; i++) {
			int multi=num*i;
			System.out.println(+num+"*"+i+"="+multi);
		}
	}

}
