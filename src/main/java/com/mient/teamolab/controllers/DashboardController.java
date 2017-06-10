package com.mient.teamolab.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mient.teamolab.entities.User;
import com.mient.teamolab.services.UserService;

@RestController
public class DashboardController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping(value = "api/dashboard")
	public List<User> getPublicDashboard(HttpServletRequest request){

		List<User> users = userService.findAll();
		
		return users;
	}
}
