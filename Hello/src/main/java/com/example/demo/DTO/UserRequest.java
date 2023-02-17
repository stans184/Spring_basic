package com.example.demo.DTO;

public class UserRequest {
	
	private String name;
	private String email;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "User Request{" + "name='" + name + "\'" + ", email='" + email + "\'" + ", age=" + age + "}";
	}
}