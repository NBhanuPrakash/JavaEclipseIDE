package com.EmailSenderEmail;

import java.util.Properties;
import java.util.Random;

import jakarta.mail.Authenticator;
import jakarta.mail.Message;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

public class Sender {
	public String sendEmail(String to) {

		
		String number = "0123456789";
		char [] otp = new char[6];
		for(int i=0; i<6; i++) {
			otp[i]=number.charAt((int) new Random().nextLong(number.length()));
			}
		String value = new String(otp);
		String otpvalue =value;
		//		Session Properties

		Properties properties = new Properties();
		properties.put("mail.smtp.auth", true);
		properties.put("mail.smtp.starttls.enable", true);
		properties.put("mail.smtp.port", "587");
		properties.put("mail.smtp.host", "smtp.gmail.com");

//		Session

		Session session = Session.getInstance(properties, new Authenticator() {

			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				// TODO Auto-generated method stub
				return new PasswordAuthentication("nnsaibhanuprakash123@gmail.com", "mwkeletuxptyrlob");
			}

		});

		try {
			Message mimeMessage = new MimeMessage(session);
			mimeMessage.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
			mimeMessage.setFrom(new InternetAddress("nnsaibhanuprakash123@gmail.com"));
			mimeMessage.setSubject("This Is Your OTP : From NN Devlopers");
			mimeMessage.setText("This You one time password.."+otpvalue);
			Transport.send(mimeMessage);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return otpvalue;
	}
}
