package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.UserDTO;

@RestController
@RequestMapping("/api")
public class ApiController {

	// TEXT
	@GetMapping("/text")
	public String text(@RequestParam String account) {
		return account;
	}
	
	// JSON
	// request -> object mapper -> object -> method -> object -> object mapper -> json -> response
	@PostMapping("/json")
	public UserDTO json(@RequestBody UserDTO userDTO) {
		return userDTO;			// 응답이 제대로 내려올 경우 항상 200 ok
	}
	
	// ResponseEntity
	@PutMapping("/put")
	public ResponseEntity<UserDTO> put(@RequestBody UserDTO userDTO) {
		
		// httpStatus.CREATED = 201 응답
		return ResponseEntity.status(HttpStatus.CREATED).body(userDTO);
	}
}