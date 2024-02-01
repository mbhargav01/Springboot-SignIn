package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.test.dao.UserRepository;

@SpringBootApplication
public class Testing1Application {

	public static UserRepository userRepository;
	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(Testing1Application.class, args);
		userRepository=context.getBean(UserRepository.class);
	}

}
