package com.SignInSignUp.Service;
//
//import java.util.Properties;
//import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SignInSignUp.DAO.Repositorypage;
import com.SignInSignUp.DTO.UserRegister;
import com.SignInSignUp.DTO.userLogin;
//
//import jakarta.mail.Authenticator;
//import jakarta.mail.Message;
//import jakarta.mail.PasswordAuthentication;
//import jakarta.mail.Session;
//import jakarta.mail.Transport;
//import jakarta.mail.internet.InternetAddress;
//import jakarta.mail.internet.MimeMessage;

@Service
public class LoginServiceImpl implements loginService {

	@Autowired
	Repositorypage servicePage;

	@Override
	public void signUpUser(UserRegister userRegister) {
		servicePage.insertTable(userRegister);

	}

	@Override
	public UserRegister signInUser(userLogin userLogin) {
		UserRegister credentials = servicePage.credentials(userLogin);
		return credentials;
	}

	@Override
	public int setPassword(userLogin userRegister) {
		int setPassword = servicePage.setPassword(userRegister);
		return setPassword;
	}

//	@Override
//	public String sendOtpMail(String toEmail) {
//
//		String number = "0123456789";
//		char[] otp = new char[6];
//		for (int i = 0; i < 6; i++) {
//			otp[i] = number.charAt(new Random().nextInt(number.length()));
//		}
//		String value = new String(otp);
//		String otpvalue = value;
//		// Session Properties
//
//		Properties properties = new Properties();
//		properties.put("mail.smtp.auth", true);
//		properties.put("mail.smtp.starttls.enable", true);
//		properties.put("mail.smtp.port", "587");
//		properties.put("mail.smtp.host", "smtp.gmail.com");
//
////		Session
//
//		Session session = Session.getInstance(properties, new Authenticator() {
//
//			@Override
//			protected PasswordAuthentication getPasswordAuthentication() {
//				// TODO Auto-generated method stub
//				return new PasswordAuthentication("nnsaibhanuprakash123@gmail.com", "mwkeletuxptyrlob");
//			}
//
//		});
//
//		UserRegister emailValidation = servicePage.emailValidation(toEmail);
//		String email = emailValidation.getEmail();
//		
//		if (email.equals(toEmail)){
//			try {
//				Message mimeMessage = new MimeMessage(session);
//				mimeMessage.setRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
//				mimeMessage.setFrom(new InternetAddress("nnsaibhanuprakash123@gmail.com"));
//				mimeMessage.setSubject("This Is Your OTP : From NN Devlopers");
//				mimeMessage.setText("This You one time password.." + otpvalue);
//				Transport.send(mimeMessage);
//
//			} catch (Exception e) {
//				e.printStackTrace();
//			}	
//		}else {
//			System.out.println("Your Email is not Valid");
//		}
//	
//		return otpvalue;
//	}

	@Override
	public UserRegister emailValidate(String email) {
		UserRegister emailValidation = servicePage.emailValidation(email);
		return emailValidation;
	}

}
