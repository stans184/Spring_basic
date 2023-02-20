package com.example.ioc;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.springframework.stereotype.Component;

//spring 에서 관리해달라고 넘겨주는 annotation
//이러면 spring 이 실행되면서 Component 가 붙은 class 를 찾아서, SingleTon 형태로 관리
@Component
public class UrlEncoder implements IEncoder{
	
	@Override
	public String encode(String message) {
		
		try {
			return URLEncoder.encode(message, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			return null;
		}
	}

}