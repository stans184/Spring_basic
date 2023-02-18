package com.example.demo.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CarDto {
	
	private String name;
	
	@JsonProperty("car_number")
	private int carNumber;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return carNumber;
	}
	public void setNumber(int number) {
		this.carNumber = number;
	}
	@Override
	public String toString() {
		return "CarDto [name=" + name + ", number=" + carNumber + "]";
	}
}