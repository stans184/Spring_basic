package com.example.ioc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class IocApplication {

	public static void main(String[] args) {
		SpringApplication.run(IocApplication.class, args);
		
		ApplicationContext context = ApplicationContextProvider.getContext();

//		Base64Encoder base64Encoder = context.getBean(Base64Encoder.class);
//		UrlEncoder urlEncoder = context.getBean(UrlEncoder.class);
		
		// bean -> spring container 에서 관리되는 객체
		// 객체를 내가 관리하지 않고, spring container 에서 관리하므로 IoC - Inversion of Control
		// spring 으로부터 주입을 받아서 사용한다? 결국 내가 코드를 건드려줬는데?
		Encoder encoder = context.getBean("Url", Encoder.class);
		
		String url = "www.naver.com/books/it?page=10&size=20&name=spring-boot";
		
		String result = encoder.encode(url);
		System.out.println(result);
		
		// url encoder 로 변환
//		encoder.setIEncoder(urlEncoder);
//		result = encoder.encode(url);
//		System.out.println(result);
	}
}

// 여러 가지 bean 생성을 위한 configuration 정의
@Configuration
class AppConfig{
	
	// Encoder 라는 bean 이 2개가 생김 -> 이름을 붙여줘서 중복 해결
	@Bean("Base64")
	public Encoder encoder(Base64Encoder base64Encoder) {
		return new Encoder(base64Encoder);
	}
	
	@Bean("Url")
	public Encoder encoder(UrlEncoder urlEncoder) {
		return new Encoder(urlEncoder);
	}
}