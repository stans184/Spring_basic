package com.example.aop.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.aop.DTO.User;
import com.example.aop.annotation.Decode;
import com.example.aop.annotation.Timer;

@RestController
@RequestMapping("/api")
public class RestApiController {
	/*
	 * 모든 method 에 비즈니스 로직과는 전혀 상관없는 하기 기능이 들어가있을 때
	 * AOP 로 동일 기능을 빼서 진행 
	var stopWatch = new StopWatch();
	stopWatch.start();
	stopWatch.stop();
	System.out.println("total time : " + stopWatch.getTotalTimeSeconds());
	*/
	
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
	
	@Decode
	@PutMapping("/put")
	public User put(@RequestBody User user) {
		
		System.out.println("put method : " + user);
		
		return user;
	}
	
	@Timer
	@DeleteMapping("/delete")
	public void delete() throws InterruptedException {
		
		// db logic, delay 1~2s
		Thread.sleep(2000);
		
	}
}