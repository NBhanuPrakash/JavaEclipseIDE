package com.Arrays;

import java.util.Scanner;

public class Even_r_Add_Using_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num= sc.nextInt();
		String[] array = {"Even","Odd"};
		System.out.println(array[num%2]);
	}

}
