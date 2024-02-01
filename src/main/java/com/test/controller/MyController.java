package com.test.controller;

import java.util.Iterator;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.Testing1Application;
import com.test.entity.User;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MyController {

	@RequestMapping("/")
	public String home() {
		return "signin";
	}
	
	@RequestMapping("/process")
	public String process(HttpServletRequest request){
		String result="";
		String name=request.getParameter("name");
		String pass=request.getParameter("password");
		System.out.println(name+" == "+pass);
		Iterable<User> itr=Testing1Application.userRepository.findAll();
		Iterator<User> iterator=itr.iterator();
				
			while (iterator.hasNext()) {
				User user=iterator.next();
			if (user.getUserName().equals(name) && user.getPassword().equals(pass)) {
				result="success";
				break;
			}
			else {
				result="wrong";
			}
		}		
		return result;
	}
	
	@RequestMapping("/signUpHere")
	public String signUpHere() {
		return "signup";
	}
	
	@RequestMapping("/detailsProcess")
	public String detailsProcess(HttpServletRequest request) {
		
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		long contact=Long.parseLong(request.getParameter("contact"));
		String password=request.getParameter("password");
		
		User user=new User();
		user.setUserName(name);
		user.setEmail(email);
		user.setContact(contact);
		user.setPassword(password);
		User user1=Testing1Application.userRepository.save(user);
		
		System.out.println(user1);
		return "success";
	}
}
