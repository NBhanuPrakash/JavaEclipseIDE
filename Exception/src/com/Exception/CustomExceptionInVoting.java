package com.Exception;
import java.util.*;

public class CustomExceptionInVoting {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		voting();

	}

	public static void voting() {
		int age = sc.nextInt();
		if (age < 18) {
			throw new CustomException("Your A Minor...");
		} else {
			System.out.println("Go With Vote...");
		}
	}

}
