package com.pro.Register;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pro.Register.model.User;
import com.pro.Register.model.UserRepo;



@RestController
public class Registrationcontroller {
	
	
	@Autowired
	private UserRepo userRepo;
	
	@RequestMapping("/check")
	public String checkRegister() {
		return "check registration";
	}
	
	@RequestMapping("/register-user/{userName}/{password}")
	public String registerUser(@PathVariable("userName") String userName,
			@PathVariable("password") String password) {
		User u=new User();
		u.setId(5);
		u.setUsername(userName);
		u.setPassword(password);
		
		userRepo.save(u);
		return "User Registration Successfull";
	}

}
