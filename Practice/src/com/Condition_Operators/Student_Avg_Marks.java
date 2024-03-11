package com.Condition_Operators;

import java.util.Scanner;

public class Student_Avg_Marks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Maths Marks");
		byte marks1 = sc.nextByte();
		System.out.println("Enter the Chemistry Marks:");
		byte marks2 = sc.nextByte();
		System.out.println("Enter the Physics Marks:");
		byte marks3 = sc.nextByte();
		double totalmarks = ((marks1+marks2+marks3));
		double per = (totalmarks/300);
		double percentage = ((per*100));
		if (percentage>90) {
			System.out.println("A-Grade");
		}
		else if (percentage>=80 && percentage<=89) {
			System.out.println("B-Grade");
		}
		else if (percentage>=70 && percentage<=79) {
			System.out.println("C-Grade");
		}
		else if (percentage>=60 && percentage<=69) {
			System.out.println("D-Grade");
		}
		else if (percentage>=50 && percentage<=59) {
			System.out.println("E-Grade");
		}
		else {
			System.out.println("F-Grade");
		}
			
	}

}
