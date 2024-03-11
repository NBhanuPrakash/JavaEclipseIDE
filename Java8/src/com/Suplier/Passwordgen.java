package com.Suplier;

import java.util.Random;
import java.util.function.Supplier;

public class Passwordgen {

	public static void main(String[] args) {
		password();
	}
	
	public static void password() {
		Supplier<String> firstSupplier=() ->{
			String charstString ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			String charstString2 ="abcdefghijklmnopqrstuvwxyz";
			String chaString3 = "!@#%$&*^";
			Random random = new Random();
			StringBuilder stringBuilder = new StringBuilder();
			for(int i=0; i<1; i++) {
				int index=random.nextInt(charstString.length());
				stringBuilder.append(charstString.charAt(index));
			}
			
			for(int i=0; i<5; i++) {
				int index2=random.nextInt(charstString2.length());
				stringBuilder.append(charstString2.charAt(index2));
			}
			for(int i=0; i<1; i++) {
				int index3=random.nextInt(chaString3.length());
				stringBuilder.append(chaString3.charAt(index3));
			}
			for(int i=0; i<1; i++) {
				int index3=random.nextInt(100)+100;
				stringBuilder.append(index3);
			}
			return stringBuilder.toString();
			

		};
		
		String generatedPassword = firstSupplier.get();
        while (!isPasswordValid(generatedPassword)) {
            generatedPassword = firstSupplier.get();
        }
        System.out.println(generatedPassword);
		
	}
	
	 private static boolean isPasswordValid(String password) {
	        // Check if the password contains at least one capital letter
	        if (!password.matches(".*[A-Z].*")) {
	            return false;
	        }

	        // Check if the password contains at least one lowercase letter
	        if (!password.matches(".*[a-z].*")) {
	            
	        	System.out.println("password must be small letters");
	        }

	        // Check if the password contains at least one special character
	        if (!password.matches(".*[!@#%$&*^].*")) {
	            return false;
	        }

	        // Check if the password contains at least one digit
	        if (!password.matches(".*\\d.*")) {
	            return false;
	        }

	        // Check if the password has a minimum length of 8 characters
	        if (password.length() < 8) {
	            return false;
	        }
	        else {
				System.out.println("Password is Strong");
			}

	        return true;
	    }





}
