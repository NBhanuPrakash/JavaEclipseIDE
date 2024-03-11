package com.Exception;

import java.util.Scanner;

public class Throw {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Even_Or_Add();

	}

	public static void Even_Or_Add() {
		int num = sc.nextInt();
		if (num % 2 != 0) {
			try {
				throw new IllegalArgumentException();
			} catch (Exception e) {
				System.out.println("Its A Add NUmber...");
			}
		} else {
			System.out.println("Its a Even NUmber...");
		}
	}

}
