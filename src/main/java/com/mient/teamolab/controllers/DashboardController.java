package com.mient.teamolab.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mient.teamolab.entities.User;
import com.mient.teamolab.services.UserService;

@RestController
public class DashboardController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "rest/public/dashboard")
	public List<User> getUser(){
		
		List<User> users = userService.findAll();
		
		return users;
	}
}
