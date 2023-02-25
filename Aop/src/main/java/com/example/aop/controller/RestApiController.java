package com.example.aop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.aop.DTO.User;

@RestController
@RequestMapping("/api")
public class RestApiController {

	@GetMapping("/get/{id}")
	public String get(@PathVariable long id, @RequestParam String name) {
		System.out.println("get method");
		System.out.println("get method : " + id);
		System.out.println("get method : " + name);
		return id + " " + name;
	}
	
	@PostMapping("/post")
	public User post(@RequestBody User user) {
		System.out.println("post method : " + user);
		return user;
	}
}