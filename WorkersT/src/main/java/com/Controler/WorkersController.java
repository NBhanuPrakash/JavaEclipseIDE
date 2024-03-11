package com.Controler;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.WorkerTDAO.DBCalling;
import com.WorkerTDto.User;
import com.WorkerTDto.Worker;

@Controller
public class WorkersController {
	
	@RequestMapping("/login")
	public String login() {
		return"login";
	}
	
	@RequestMapping("/welcome")
	public String welcome(Model model) {
		Worker workersWorker = new Worker(1001,"Bhanu","Prakash",50000,"24-06-2022","Hr");
		ModelAndView view = new ModelAndView();
		view.addObject("worker", workersWorker);
		view.setViewName("Welcome");
		return"Welcome";
	}
	
	@RequestMapping("/error")
	public String error() {
		return "Error";
	}
	
	@RequestMapping("/hello")
	public String sayHello(Model model,HttpServletRequest request) throws ClassNotFoundException, SQLException {
		model.addAttribute("Suceess", "Sucessfully Login");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		User user = new User(email,password);		
		boolean loginList = DBCalling.loginList(user);
		System.out.println(loginList);
		if (loginList==true)  {
			return "Welcome";
		}
		else {
			return "Error";
		}
		
	}

}