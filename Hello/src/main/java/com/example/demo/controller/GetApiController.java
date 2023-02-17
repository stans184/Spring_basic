package com.example.demo.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.UserRequest;

@RestController
@RequestMapping("/api/get")
public class GetApiController {
	
	@GetMapping(path = "/hello")		// http://localhost:9090/api/get/hello
	public String Hello() {
		return "get hello";
	}
	
	@RequestMapping(path = "/hi", method = RequestMethod.GET)		// 여기서 request mapping 을 사용하면 get / post / put / delete 모두 동작하게 
	public String Hi() {											// 따라서 method 를 지정해줘서 동작을 제한시킬 수 있음
		return "get Hi";											// http://localhost:9090/api/get/hi
	}
	
	// http://localhost:9090/api/get/path-variable/{name}			// {} 변화하는 값
	@GetMapping("/path-variable/{name}")							// 어떤 값을 넣어도 실행해줌
	public String pathVariable(@PathVariable String name) {			// 변수 이름과, getmapping 에 들어있는 변수값의 이름을 동일하게 맞춰야 함
		System.out.println("PathVariable : " + name);
		return name;
	}
	
	// 원래는 변수 이름과 pathVariable 을 같게 맞춰줘야 하나, 부득이하게 다르게 설정해줘야 할 때는 하기와 같이 설정
	@GetMapping("/path-variable-2/{name}")
	public String pathVariable2(@PathVariable(name = "name") String pathName) {
		System.out.println("pathVariable2 : " + pathName);
		return pathName;
	}
	
	// Query Parameter
	// 하기 주소에서 ? 이후의 주소
	// https://www.google.com/search?q=intellij&rlz=1C5CHFA_enKR1011KR1011&oq=&aqs=chrome.0.35i39i362l8.1440693j0j7&sourceid=chrome&ie=UTF-8
	// & 연산자 기준으로 분해해보면
	// https://www.google.com/search?q=intellij
	// &rlz = 1C5CHFA_enKR1011KR1011
	// &oq=
	// &aqs = chrome.0.35i39i362l8.1440693j0j7
	// &sourceid = chrome
	// &ie = UTF-8
	
	// ?key=value&key2=value2
	
	// http://localhost:9090/api/get/query-param?user=steve&email=steve@gmail.com&age=34
	// @RequestParam Annotation 붙여줘야함
	// Map 으로 변수를 받는 경우에는 key 값이 계속 달라질 수 있음, 뭐가 들어올지 모름
	@GetMapping(path = "/query-param")
	public String QueryParam(@RequestParam Map<String, String> queryParam) {
		
		StringBuilder sb = new StringBuilder();
		
		queryParam.entrySet().forEach(entry -> {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			System.out.println("\n");
			
			sb.append(entry.getKey() + " = " + entry.getValue() + "\n");
		});
		
		return sb.toString();
	}
	
	// 받을 수 있는 key 값을 명시적으로 표기하는 방법
	// 만약 int 로 받도록 선언된 변수의 자리에다가 char, String 등 다른 값을 넣게 되면 400 에러 발생
	// 그런데 이 방식은 변수가 지정되어 있으므로, 변수가 늘어나는 상황에 대해 대처하지 못한다
	@GetMapping("/query-param2")
	public String QueryParam2(@RequestParam String name, @RequestParam String email, @RequestParam int age) {
		
		System.out.println(name);
		System.out.println(email);
		System.out.println(age);
		
		return name + " " + email + " " + age;
	}
	
	
	// DTO 방식, 현업에서 가장 많이 사용
	// RequestParam Annotation 붙이지 않음
	// 변수로 객체가 들어오면, QueryParam 의 key 부분이 무엇인지 자동으로 매칭해
	@GetMapping("/query-param3")
	public String QueryParam3(UserRequest userRequest) {
		System.out.println(userRequest.getName());
		System.out.println(userRequest.getEmail());
		System.out.println(userRequest.getAge());
		
		return userRequest.toString();
	}
}