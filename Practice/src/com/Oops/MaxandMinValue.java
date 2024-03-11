package com.Oops;

import java.util.Scanner;

public class MaxandMinValue {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		max();
		

	}
	static void max() {
		int arrays = sc.nextInt();
		int []arr = new int[arrays];
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int max = arr[0];
		int min = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			else if(arr[i]<min) {
				min=arr[i];
			}
		}
		for(int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println(max);
		System.out.println(min);
		
	}
	
}
