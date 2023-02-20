package com.example.ioc;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Encoder {

	private IEncoder iEncoder;
	
	// 특정 component 를 불러오고 싶을 때, qualifier 로 해당 component 이름을 지정
	public Encoder(@Qualifier("BaseEncoder") IEncoder iEncoder) {
		this.iEncoder = iEncoder;
	}
	
	public void setIEncoder(IEncoder iEncoder) {
		this.iEncoder = iEncoder;
	}
	
	public String encode(String message) {
		return iEncoder.encode(message);
	}
}