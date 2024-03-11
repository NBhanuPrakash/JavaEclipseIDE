package com.Oops;

public class Sum_Of_Arrays {
	
	int[] array = {1,5,6};
	int sum=0;
	
	 void sum(){
		 System.out.println("Sum of Numbers:");
		for(int i=0; i<array.length; i++) {
			sum+=array[i];
		}
		System.out.println(sum);
		
	}

	public static void main(String[] args) {
		Sum_Of_Arrays sn = new Sum_Of_Arrays();
		sn.sum();
		

	}

}
