package com.SignInSignUp.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.SignInSignUp.DTO.UserRegister;
import com.SignInSignUp.DTO.userLogin;
import com.SignInSignUp.Service.loginService;

@Controller
public class ControllerPage {

	@Autowired
	loginService loginService;

	@RequestMapping("/login")
	public String signin() {
		return "Home";
	}

	@RequestMapping("/welcome")
	public String welcomePage(Model model) {
		model.addAttribute("name","Hello this is my name : BHanu Prakash");
		return "Welcome";
	}

	@RequestMapping("/forgot")
	public String forgotPassword() {
		return "forgot";
	}

	@RequestMapping("/passwordPage")
	public String setPasswordPage() {
		return "passwordPage";
	}

	@RequestMapping("/insertTable")
	public String insertTable(HttpServletRequest request, Model model) {
		String username = request.getParameter("userName");
		String emailString = request.getParameter("email");
		String dateOfBirthString = request.getParameter("dateField");
		String password = request.getParameter("conformPassword");
		UserRegister userRegister = new UserRegister(username, emailString, dateOfBirthString, password);
		loginService.signUpUser(userRegister);
		return "Home";
	}

	@RequestMapping("/signIn")
	public String signIn(HttpServletRequest request, Model model) {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		userLogin userLogin = new userLogin(email, password);
		UserRegister credentials = loginService.signInUser(userLogin);
		if (credentials.getEmail().equals(email) && credentials.getPassword().equals(password)) {
			return "Welcome";
		} else {
			model.addAttribute("incorrect", "Your Enter Incorrect Credentials..");
			return "login";
		}

	}

	@RequestMapping("/emailvalidation")
	public String forgotPassValidation(HttpServletRequest request, Model model) {
		String emailvalid = request.getParameter("emailField");
		UserRegister emailValidate = loginService.emailValidate(emailvalid);
		if (emailValidate.getEmail().equals(emailvalid)) {
			return "passwordPage";
		}
		return "forgot";
	}

//	@RequestMapping("/otpValidation")
//	public String otpValidation(HttpServletRequest request, Model model) {
//		String otp = request.getParameter("otpField");
//		String sendOtpMail = loginService.sendOtpMail("");
//		if (sendOtpMail.equals(otp)) {
//			return "passwordPage";
//		} else {
//			return "forgot";
//		}
//
//	}

	@RequestMapping("/setPassword")
	public String setPassword(HttpServletRequest request, Model model) {
		String email = request.getParameter("email");
		String conformPassword = request.getParameter("conformPassword");
		userLogin login = new userLogin(email, conformPassword);
		int setPassword = loginService.setPassword(login);
		if (setPassword >= 0) {
			return "Home";
		} else {
			model.addAttribute("details", "Your Enter Incorrect Details...");
			return "passwordPage";
		}

	}

}
