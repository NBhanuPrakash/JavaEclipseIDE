package com.Oops;

import java.util.Scanner;

public class evenandadd extends SumOfAverages {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		evenoradd();
		sumofaverage();
		

	}
	static int evenoradd() {
		int arrays = sc.nextInt();
		int []arr = new int[arrays];
		int evencount=0;
		int addcount=0;
		for(int i=0; i<arr.length; i++) {
			arr[i]= sc.nextInt();
		}
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==0) {
				evencount++;				
			}
			else {
				addcount++;
			}
		}
		System.out.println(evencount);
		System.out.println(addcount);
		return 0;
	}

}
