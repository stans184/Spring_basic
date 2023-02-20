package com.example.ObjectMapper;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest
class ObjectMapperApplicationTests {

	@Test
	void contextLoads() throws JsonProcessingException {
		System.out.println("------------");
		
		// Object Mapper
		// Text JSON -> Object
		// Object -> Text JSON
		
		// controller req json(text) -> object
		// response object -> json(text)
		
		var objectMapper = new ObjectMapper();
		
		// object -> text
		// object mapper 는 get method 를 활용한다, 없으면 안댐
		// 코드를 작성하다 보면 class 내부에 get 이 들어가는 method 를 작성할 수도 있는데
		// 이걸 작성하게 되면 object mapper 가 정상적으로 동작하지 않는다
		// 따라서 object mapper 를 사용하고 싶다면, getter/setter 이외에 get이 들어가는 method 는 작성하지 않도록 한다
		var user = new User("steve", 31, "010-2222-5555");
		
		var text = objectMapper.writeValueAsString(user);
		System.out.println(text);
		
		// text -> object
		// object mapper 는 default 생성자가 필요하다
		var objectUser = objectMapper.readValue(text, User.class);
		System.out.println(objectUser);
		
	}
}