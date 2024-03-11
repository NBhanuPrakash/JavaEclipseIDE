package com.PasswordHashing;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class PasswordHasingWithSalt {
	public static void main(String[] args) throws NoSuchAlgorithmException {
		String password = "Bhanu@8";
		byte[] salt = createSalt();
		System.out.println(salt);
		byte[] inputSalt = new byte[salt.length + password.length()];
		System.out.println(doHash(inputSalt));
	}

	private static byte[] createSalt() {
		byte[] bytes = new byte[16];
		SecureRandom random = new SecureRandom();
		random.nextBytes(bytes);
		return bytes;
	}

	public static String doHash(byte[] password) throws NoSuchAlgorithmException {
		MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
		byte[] digest = messageDigest.digest(password);
		StringBuilder sBuilder = new StringBuilder();
		for (byte b : digest) {
			sBuilder.append(String.format("%02x", b));
		}
		return sBuilder.toString();
	}
}
