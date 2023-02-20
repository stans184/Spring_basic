package com.example.ObjectMapper;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {

	private String name;
	private int age;
	@JsonProperty("phone_number")
	private String phoneNumber;
	
	public User() {}
	
	public User(String name, int age, String number){
		this.name = name;
		this.age = age;
		this.phoneNumber = number;
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", phoneNumber=" + phoneNumber + "]";
	}
	
}
