package com.example.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/delete")
public class DeleteApiController {
	
	@DeleteMapping("/user-delete/{userId}")
	public void delete(@PathVariable String userId, @RequestParam String account) {
		System.out.println(userId);
		System.out.println(account);
	}
	
	// delete -> 리소스 삭제, 200 OK
	// 리소스가 이미 없어도 에러를 띄우지 않음
}