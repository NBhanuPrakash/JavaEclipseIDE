package com.Condition_Operators;

import java.util.Scanner;

public class Boy_Or_Girl {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Gender:");
        String str = sc.next();
        System.out.println("Enter the Age:");
        int age = sc.nextInt();
        if (str.equalsIgnoreCase("male")  && age<=18){
            System.out.println("Your a Boy");
        }
        else if (str.equalsIgnoreCase("female") && age<=18){
            System.out.println("Your a Girl");
        }
        else if (str.equalsIgnoreCase("male") && age>=18){
            System.out.println("your a Men");
        }
        else if (str.equalsIgnoreCase("female") && age>=18){
            System.out.println("Your a Women");
        }
	}

}
