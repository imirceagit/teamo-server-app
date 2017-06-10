package com.mient.teamolab.security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mient.teamolab.entities.User;
import com.mient.teamolab.repositories.UserRepository;

@Service
public class DatabaseUserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
    public DatabaseUserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
	
	public UserRepository getUserRepository() {
        return userRepository;
    }
	
	public Optional<User> getByUsername(String username) {
        return this.userRepository.findByUsername(username);
    }
}
