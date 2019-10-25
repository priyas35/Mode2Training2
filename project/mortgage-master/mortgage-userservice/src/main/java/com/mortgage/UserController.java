package com.mortgage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.apache.log4j.Logger;

@RestController
@RequestMapping("/user")
public class UserController {
	
	private static final Logger logger = Logger
			.getLogger(UserController.class);

	public UserController() {
		logger.info("UserController");
		System.out.println("UserController()");
	}
 
	@Autowired
	UserService userRepositoryImpl;
	
	@RequestMapping("/{name}/get")
	public User getUser(@PathVariable("name") String user) {
		logger.info("Calling  getuser method...");
		return userRepositoryImpl.userAuthentication(user);
	}
	
	@RequestMapping("/adduserdetails")
	public int adduserdetails(@RequestBody User user) {
		logger.info("Calling  adduserdetails method...");
		return userRepositoryImpl.adduserdetails(user);
	}
	
	@RequestMapping("/registeruserdetails")
	public String registeruserdetails(@RequestBody PersonalDetails personalDetails) {
		logger.info("Calling  registeruserdetails method...");
		return userRepositoryImpl.registeruserdetails(personalDetails);
	}

	
}
