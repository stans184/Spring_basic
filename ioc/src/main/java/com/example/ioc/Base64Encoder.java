package com.example.ioc;

import java.util.Base64;

import org.springframework.stereotype.Component;

// spring 에서 관리해달라고 넘겨주는 annotation
// 이러면 spring 이 실행되면서 Component 가 붙은 class 를 찾아서, SingleTon 형태로 관리
// component 가 어떤 이름으로 불려올지를 지정해줄 수 있음
@Component("BaseEncoder")
public class Base64Encoder implements IEncoder{
	
	@Override
	public String encode(String message) {
		return Base64.getEncoder().encodeToString(message.getBytes());
	}
}