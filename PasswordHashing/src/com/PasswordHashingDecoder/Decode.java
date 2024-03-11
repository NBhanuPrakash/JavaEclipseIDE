package com.PasswordHashingDecoder;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

public class Decode {
	public static void main(String[] args) throws NoSuchAlgorithmException, InvalidKeySpecException {
		
//		Stored Salt from Database
		
		String saltHashString = "5bdd53253b7f7b122042f227ab079823f72202c5";
		
//		Stored Password from DataBase
		
		String passwordHash = "d25f352ae9bc0fa80eeb3c1d0e823ee64b442666db77b0e19fbda6d62664396f";
		

		
		String password = "Bhanu123";
		
		byte[] salt = fromHexa(saltHashString);	
//		System.out.println(salt);
		
		char[] charArray = password.toCharArray();
		PBEKeySpec spec = new PBEKeySpec(charArray, salt, 10000, 256);
		SecretKeyFactory skf = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
		byte[] encoded = skf.generateSecret(spec).getEncoded();	
		
		String encodePassword = toHexString(encoded);
//		System.out.println(encodePassword);
		
		if (encodePassword.equals(passwordHash)){
			System.out.println("User Is Valid Welcome");	
		}
		else {
			System.out.println("User Is Invalid...");
		}
	}

	public static byte[] fromHexa(String hex) {
		int len = hex.length();
		if (len % 2 != 0) {
			throw new IllegalArgumentException("Hex string length must be even.");
		}
		byte[] result = new byte[len / 2];
		for (int i = 0; i < len; i += 2) {
			result[i / 2] = (byte) ((Character.digit(hex.charAt(i), 16) << 4) + Character.digit(hex.charAt(i + 1), 16));
		}
		return result;
	}
	
	private static String toHexString(byte[] salt) {
		StringBuilder builder = new StringBuilder();
		for (byte b : salt) {
			builder.append(String.format("%02x", b));
		}
		return builder.toString();
	}
}
