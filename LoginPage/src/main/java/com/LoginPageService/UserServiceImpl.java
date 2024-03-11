package com.LoginPageService;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LoginPageDAO.UserRepo;
import com.LoginPageDTO.UserLogin;

import jakarta.mail.Message;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepo userRepoImpl;

	@Autowired
	Session session;

	@Override
	public int createUser(UserLogin userLogin) {
		if (userLogin != null) {
			String conformPassword = userLogin.getConformPassword();
			byte[] inputSalt = new byte[conformPassword.length()];
			String dohash = null;
			try {
				dohash = dohash(inputSalt);
			} catch (NoSuchAlgorithmException e) {
				e.printStackTrace();
			}
			userLogin.setConformPassword(dohash);
		}
		int saveUser = userRepoImpl.saveUser(userLogin);
		return saveUser;
	}

	private String dohash(byte[] saltinput) throws NoSuchAlgorithmException {

		MessageDigest msgDigest = MessageDigest.getInstance("SHA-256");
		byte[] digest = msgDigest.digest(saltinput);
		StringBuilder sBuilder = new StringBuilder();
		for (byte b : digest) {
			sBuilder.append(String.format("%02x", b));
		}
		return sBuilder.toString();
	}

	@Override
	public UserLogin userLogin(String emai, String password) {
		String dohash = null;
		if (password != null) {
			byte[] passwords = new byte[password.length()];
			try {
				dohash = dohash(passwords);
			} catch (NoSuchAlgorithmException e) {
				e.printStackTrace();
			}
		}
		UserLogin login = userRepoImpl.login(emai, dohash);
		return login;
	}

	@Override
	public UserLogin getUser(String email) {
		UserLogin user = userRepoImpl.getUser(email);
		return user;
	}

	@Override
	public String otpSender(String email) {
		String number = "0123456789";
		char[] otp = new char[6];
		for (int i = 0; i < 6; i++) {
			otp[i] = number.charAt((new Random().nextInt(number.length())));
		}
		String value = new String(otp);
		String otpvalue = value;

		try {
			Message mimeMessage = new MimeMessage(session);
			mimeMessage.setRecipient(Message.RecipientType.TO, new InternetAddress(email));
			mimeMessage.setFrom(new InternetAddress("nnsaibhanuprakash123@gmail.com"));
			mimeMessage.setSubject("This Is Your OTP : From NN Devlopers");
			mimeMessage.setText("This You one time password.." + otpvalue);
			Transport.send(mimeMessage);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return otpvalue;

	}

	@Override
	public UserLogin updateUser(int id, String password) {
		String dohash = null;
		if (password != null) {
			byte[] passwords = new byte[password.length()];
			try {
				dohash = dohash(passwords);
			} catch (NoSuchAlgorithmException e) {
				e.printStackTrace();
			}
		}
		UserLogin updateUser = userRepoImpl.updateUser(id, dohash);
		return updateUser;
	}

	@Override
	public String emailSent(String email) {

		try {
			Message mimeMessage = new MimeMessage(session);
			mimeMessage.setRecipient(Message.RecipientType.TO, new InternetAddress(email));
			mimeMessage.setFrom(new InternetAddress("nnsaibhanuprakash123@gmail.com"));
			mimeMessage.setSubject("Your Requested a password Rest");
			mimeMessage.setText("Your Password Should Be SuceessFully Updated..");
			Transport.send(mimeMessage);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return email;
	}
}
