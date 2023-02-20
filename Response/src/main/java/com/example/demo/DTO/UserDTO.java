package com.example.demo.DTO;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

// snake case 를 camel case 로 변환해서 넣어주는 방법
// 일반적으로 snake case 를 조금 더 많이 사용하게 됨

@JsonNaming(value = PropertyNamingStrategy.SnakeCaseStrategy.class)

// null 인 데이터값은 포함하지 않겠다
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDTO {

	private String name;
	private int age;			// 초기값을 동일하게 null 로 뽑고싶으면 wrapper type 으로 바꿔주야 함
	private String phoneNumber;
	private String address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "UserDTO [name=" + name + ", age=" + age + ", phoneNumber=" + phoneNumber + ", address=" + address + "]";
	}
}