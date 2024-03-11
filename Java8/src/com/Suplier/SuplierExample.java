package com.Suplier;

import java.util.Random;
import java.util.function.Supplier;

public class SuplierExample {
	public static void main(String[] args) {
		int passward =5;
		Supplier<String> spSupplier = () ->{
		String chartatString = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%&*";
		
		Random stRandom = new Random();
		StringBuilder stringBuilder = new StringBuilder();
		
		for (int i = 0; i < passward; i++) {
			int indexx =stRandom.nextInt(chartatString.length());
			int pass = stRandom.nextInt(1)+0;
			stringBuilder.append(chartatString.charAt(indexx));
			stringBuilder.append(pass);
			
			
			
		}
		return stringBuilder.toString();
		};
		System.out.println(spSupplier.get());
		
				// Suplier Method Using get Methods and returns .....
		
		
		
		
	}

}
