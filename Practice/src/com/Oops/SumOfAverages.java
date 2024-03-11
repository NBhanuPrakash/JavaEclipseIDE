package com.Oops;

import java.util.Scanner;

public class SumOfAverages extends Sum_Of_Arrays {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] agrs) {
		sumofaverage();
		Sum_Of_Arrays obj = new Sum_Of_Arrays();
		obj.sum();
		
		
	}
	static void sumofaverage() {
		System.out.println("Enter the  Size Array");
		int arrys = sc.nextInt();
		int []arr = new int[arrys];
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
		}
		double avg = (double)sum/arr.length;
		System.out.println(avg);
	}

}
