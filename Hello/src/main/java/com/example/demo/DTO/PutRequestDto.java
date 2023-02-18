package com.example.demo.DTO;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

// 하기 class에 소속된 변수에 대해서 설정해줄 수 있음
// 변수명을 snake case 로 변경해주는 것
// 아예 다른 변수명이면 안되고, 두 변수가 snake <-> camel case 를 왔다갔다 하는 정도이어야 함
@JsonNaming(value = PropertyNamingStrategy.SnakeCaseStrategy.class)
public class PutRequestDto {

	private String name;
	private int age;
	
	// JsonProperty 는 한가지 변수만 설정해줄 수 있음
//	@JsonProperty("car_list")
	private List<CarDto> carList;
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
	public List<CarDto> getCarList() {
		return carList;
	}
	public void setCarList(List<CarDto> carList) {
		this.carList = carList;
	}
	@Override
	public String toString() {
		return "PutRequestDto [name=" + name + ", age=" + age + ", carList=" + carList + "]";
	}
	
}