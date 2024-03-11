package com.abstractt;

import java.util.Arrays;

public class arrays extends abs {

	@Override
	void arr() {
		int []arr = {1,2,3,8,9,4,5,58};
		Arrays.sort(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	public static void main(String[] args) {
		abs gh = new arrays();
		gh.arr();
		arg();
	}
	
	

}
