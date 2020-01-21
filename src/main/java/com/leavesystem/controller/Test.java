package com.leavesystem.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
	@RequestMapping("/")
	public String m1(){
		return "Spring Boot Application with cassandra";
	}

	
	

	
}