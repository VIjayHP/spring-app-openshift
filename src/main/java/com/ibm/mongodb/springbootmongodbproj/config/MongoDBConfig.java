package com.ibm.mongodb.springbootmongodbproj.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.ibm.mongodb.springbootmongodbproj.document.User;
import com.ibm.mongodb.springbootmongodbproj.repository.UserRepository;

@EnableMongoRepositories(basePackageClasses=UserRepository.class)
@Configuration
public class MongoDBConfig {
	 @Bean
	 CommandLineRunner  commandLineRunner(UserRepository userRepository)
	 {
		 return strings->{
			    userRepository.save(new User(1,"Vijay",221310L));
				userRepository.save(new User(2,"sunita",121310L));
				userRepository.save(new User(3,"shreyas",1021310L));
		
			
		};
	 }

}
