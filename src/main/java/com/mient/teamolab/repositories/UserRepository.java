package com.mient.teamolab.repositories;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mient.teamolab.entities.User;

public interface UserRepository extends MongoRepository<User, String>{

	Optional<User> findByUsername(String username);

}
