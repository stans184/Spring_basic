package com.example.demo.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.PostRequestDto;

@RestController
@RequestMapping("/api/post")
public class PostApiController {
	
//	// post 방식은 get 방식과 다르게 @RequestBody 를 앞에다가 붙여줘야함
//	public void post(@RequestBody Map<String, Object> requestData) {
//		
//		requestData.entrySet().forEach(stringObjectEntry -> {
//			System.out.println("key : " + stringObjectEntry.getKey());
//			System.out.println("value : " + stringObjectEntry.getValue());
//		});
//	}
	
//	보다 간단한 코드형식, 참고
//	public void post(Map<String, Object> requestData) {
//		requestData.forEach((key, value) -> {
//			System.out.println("key : " + key);
//			System.out.println("value : " + value);
//		});
//	}
	
	@PostMapping("/join")
	// PostRequestDto 에 생성하는 변수들은 POST 에서 넣어주는 key 와 매칭되도록 해야함
	public void post(@RequestBody PostRequestDto requestData) {
		System.out.println(requestData);
	}
	
}