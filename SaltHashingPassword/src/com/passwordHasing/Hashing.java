package com.passwordHasing;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

public class Hashing {

	public static void main(String[] args) throws NoSuchAlgorithmException, InvalidKeySpecException {
		
//		Get the Password as String
		String password = "Bhanu123";
		
//      I am using SecureRandom for Generating salt value
		
		SecureRandom random = new SecureRandom();
		byte[] salt = new byte[20];
		random.nextBytes(salt);
		
//		System.out.println(salt);
		
//		Use PBKDF2 with SHA-256 to derive a key from the password
		
		char[] passwordchars = password.toCharArray();
		PBEKeySpec spec = new PBEKeySpec(passwordchars, salt, 10000, 256);
		SecretKeyFactory skf = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
		byte[] encoded = skf.generateSecret(spec).getEncoded();
		
		String saltHash = toHexString(salt);
		String passwordHash = toHexString(encoded);
		
		System.out.println(saltHash);
		System.out.println(passwordHash);
		
				
				
				
	}



	private static String toHexString(byte[] salt) {
		StringBuilder builder = new StringBuilder();
		for (byte b : salt) {
			builder.append(String.format("%02x", b));
		}
		return builder.toString();
	}

}
