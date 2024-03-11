package com.EmailSender;

import java.util.Scanner;

import com.EmailSenderEmail.Sender;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Sender sender = new Sender();
		String to = "nnsaibhanuprakash456@gmail.com";
		
		
		String otp = sender.sendEmail(to);
		
		System.out.println("Enter Your Otp :");
		String otpValue = sc.next();		
		
		if (otpValue.equals(otp)) {
			System.out.println("Your Otp Is Correct..");
		}else {
			System.out.println("Your Otp Is Wrong..");
		}
		
		sc.close();
	}

}
