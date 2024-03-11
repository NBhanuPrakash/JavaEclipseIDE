package com.predicate;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateExmple {
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		Example2();
		example1();
		example3();

	}

	private static void Example2() {
		Predicate<Integer> subPredicate = num -> {
			int rev = 0;
			int rem;
			int temp = num;

			while (num > 0) {
				rem = num % 10;
				rev += rem * rem * rem;
				num = num / 10;

			}
			return temp == rev;
		};
		int number = 123;
		if (subPredicate.test(number)) {
			System.out.println("Its a Armstrong Number:");

		} else {
			System.out.println("Its Not a Armstrong Number");
		}
	}

	private static void example3() {
//		System.out.println("Enter Your armstrong number:");
//		int num2= scanner.nextInt();

		Predicate<Integer> predicate = (num1) -> {
			int orginalnum = num1;
			int rev = 0;
			while (num1 != 0) {
				int rem = num1 % 10;
				rev += Math.pow(rem, 3);
				num1 /= 10;
			}
			return orginalnum == rev;

		};
		System.out.println(predicate.test(153) ? ("Its a armstrong number") : ("Its not armstrong number"));
	}

	private static void example1() {
		Predicate<Integer> sd = (s) -> s % 2 == 0;
		System.out.println(sd.test(14));
	}

}
