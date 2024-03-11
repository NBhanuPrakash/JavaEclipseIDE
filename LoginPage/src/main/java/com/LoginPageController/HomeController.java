package com.LoginPageController;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.LoginPageDTO.UserLogin;
import com.LoginPageService.UserService;

@Controller
public class HomeController {

	@Autowired
	UserService userServiceImpl;

	public String otpSender;

	public String emailId;

	public int empId;

	@RequestMapping("/home")
	public String home() {
		return "home";
	}

	@RequestMapping("/login")
	public String login() {
		return "login";
	}

	@RequestMapping("/register")
	public String register() {
		return "register";
	}

	@RequestMapping("/welcome")
	public String welComePage() {
		return "welcome";
	}

	@RequestMapping("/emailValidate")
	public String emailValidate() {
		return "emailValidate";
	}

	@RequestMapping("/otpvaldate")
	public String otpvalid() {
		return "otpValidation";
	}

	@RequestMapping("/password")
	public String passwordChange() {
		return "passwordChange";
	}

	@RequestMapping(path = "/register", method = RequestMethod.POST)
	public String createUser(@ModelAttribute UserLogin userLogin, HttpSession session) {
		System.out.println(userLogin.toString());
		int createUser = userServiceImpl.createUser(userLogin);
		if (createUser < 0) {
			return "redirect:/register";
		}
		session.setAttribute("msg", "SucessfullY Registerd");
		return "redirect:/register";

	}

	@RequestMapping(path = "/userlogin", method = RequestMethod.POST)
	public String loginuser(@RequestParam("email") String email, @RequestParam("password") String password,
			HttpSession session) {

		UserLogin userLogin = userServiceImpl.userLogin(email, password);

		if (userLogin != null) {
			session.setAttribute("userLogin", userLogin);
			return "redirect:/welcome";
		}
		session.setAttribute("msg", "Email or Password Wrong..");
		return "redirect:/login";
	}

	@RequestMapping(path = "/emailValidation", method = RequestMethod.POST)
	public String emailValid(@RequestParam("emailField") String email, HttpSession session) {
		UserLogin user = userServiceImpl.getUser(email);
		empId = user.getId();
		emailId = user.getEmail();
		if (user != null) {
			otpSender = userServiceImpl.otpSender(user.getEmail());
			return "otpValidation";
		}
		session.setAttribute("msg", "Your Email not Register..");
		return "emailValidate";

	}

	@RequestMapping(path = "/otpvalidation")
	public String optValid(@RequestParam("otp") String otp, HttpSession session) {
		if (otpSender.equals(otp)) {
			return "passwordChange";
		}
		session.setAttribute("msg", "Your Otp Is Invalid..");
		return "otpValidation";
	}

	@RequestMapping(path = "/setPassword", method = RequestMethod.POST)
	public String setPassword(@RequestParam("conformPassword") String password, HttpSession session) {

		UserLogin updateUser = userServiceImpl.updateUser(empId, password);
		if (updateUser == null) {
			return "passwordChange";
		}
		userServiceImpl.emailSent(emailId);
		session.setAttribute("message", "Your Password is Updated Sucessfully...");
		return "login";

	}
}
