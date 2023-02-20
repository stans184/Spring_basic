package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.DTO.UserDTO;

// HTML page resource 를 찾음
@Controller
public class PageController {
	
	@RequestMapping("/main")
	public String main() {
		// return data 가 string 이면 자동으로 resource 폴더에 있는 동일한 파일로 찾아가게 됨
		return "main.html";
	}
	
	// ResponseEntity
	
	@ResponseBody			// -> Controller 에서는 ResponseBody 로 return 하게되면 객체를 찾지 않고, 
	@GetMapping("/user")	// -> 바로 response body 룰 만들어서 return
	public UserDTO user() {
		
//		UserDTO user = new UserDTO();
		var  user = new UserDTO();
		user.setName("jack");
		user.setAddress("KangNam");
		return user;
	}
	/*
	 * {
    		"name": "jack",
    		"age": 0,				// 변수의 선언이 int 로 되어있는데, 이 초기값이 0 이기 떄문, 이걸 바꾸고 싶으면 int 말고 Integer 로 선언해야함
    		"phone_number": null,	// String 의 초기값은 null
    		"address": "KangNam"
		}
	 */
}
