package com.example.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.PutRequestDto;

@RestController
@RequestMapping("/api/put")
public class PutApiController {
	
	@PutMapping("/garage/{userId}")
	public PutRequestDto put(@RequestBody PutRequestDto requestDto, @PathVariable Long userId) {
		System.out.println(userId);
		System.out.println(requestDto);

		// return 값을 처리해주면 response 를 통해 화면에 나타나게 됨
		// 지금 같은 경우, input 으로 들어온 requestDto 를 모두 out 처리함
		// 굳이 JSON 을 문자열로 바꿔서 리턴하지 않아도 됨
		return requestDto;
	}
}