package com.mient.teamolab.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mient.teamolab.entities.User;

public interface UserRepository extends MongoRepository<User, String>{

}
