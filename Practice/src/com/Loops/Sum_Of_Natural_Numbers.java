package com.Loops;

import java.util.Scanner;

public class Sum_Of_Natural_Numbers {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	
	int sum=0;
	int i=0;
	do {
		 sum=sum+i;
		 i++;
		 
		
	}while(i<=num); 
	System.out.println(sum);
	
	
  }
}