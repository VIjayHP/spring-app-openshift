package com.ibm.mongodb.springbootmongodbproj.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ibm.mongodb.springbootmongodbproj.document.User;

public interface UserRepository extends MongoRepository<User, Integer> {

	

	
}
