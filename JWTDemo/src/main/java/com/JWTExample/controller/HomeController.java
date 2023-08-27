package com.JWTExample.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.JWTExample.entities.User;
import com.JWTExample.services.UserService;

@RestController
@RequestMapping("/home")
public class HomeController {

	@Autowired
	private UserService userService;

	@GetMapping("/user")
	public List<User> home() {
		return userService.getUser();
	}

	@GetMapping("/current-user")
	public String getLoggedInUser(Principal princi) {
		return princi.getName();
	}
}
