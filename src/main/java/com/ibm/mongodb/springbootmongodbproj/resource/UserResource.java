package com.ibm.mongodb.springbootmongodbproj.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.mongodb.springbootmongodbproj.document.User;
import com.ibm.mongodb.springbootmongodbproj.repository.UserRepository;

@RestController
@RequestMapping("/rest/user")
public class UserResource {
	 
	private UserRepository userRepository;
	public UserResource(UserRepository userRepository) {
		this.userRepository=userRepository;
		// TODO Auto-generated constructor stub
	}
	@GetMapping("/all")
	public List<User> getUserInfo(){
		return userRepository.findAll();
	}

}
