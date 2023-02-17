package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController		//	해당 class 는 REST API 를 처리하는 controller
@RequestMapping("/api")		// RequestMapping 은 URI 을 지정해주는 Annotation
public class ApiController {
	
	@GetMapping("/hello")		// http://localhost:9090/api/hello
	public String hello() {
		return "hello spring boot!";
	}
}