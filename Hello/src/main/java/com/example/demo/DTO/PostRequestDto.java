package com.example.demo.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostRequestDto {
	
	private String account;
	private String email;
	private String address;
	private String password;
	
	// DTO 에서는 카멜 케이스로 변수 선언을 하고, 서버에서는 snake 케이스로 생긴 변수를 넣어주면 key 값이 일치하지 않으므로, 제대로 들어가지 않음
	// PostRequestDto{account='user01', email='steve@gmail.com', address='yongin', password='1234', phonNumber='null'}
	// key 값을 매칭시켜주는 방법은 여러 가지가 있음 그중의 한가지는 아래와 같음
	// JsonProperty 를 통한 방법은 모든 변수의 이름을 매칭시켜줘야 하는 단점이 있음
	// PostRequestDto{account='user01', email='steve@gmail.com', address='yongin', password='1234', phonNumber='010-1111-2222'}
	@JsonProperty("phone_number")
	private String phoneNumber;		// phone_number
	
	// 하기와 같이 카멜도 아니고, 스네이크도 아닌 변수명, 특히 약어도 제대로 mapping 이 되지 않음
	// PostRequestDto{account='user01', email='steve@gmail.com', address='yongin', password='1234', phonNumber='010-1111-2222', OTP='null'}
	// JsonProperty 는 이런 곳에서 많이 사용하게 된다
	// PostRequestDto{account='user01', email='steve@gmail.com', address='yongin', password='1234', phonNumber='010-1111-2222', OTP='12345'}
	@JsonProperty("OTP")
	private String OTP;
	
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getOTP() {
		return OTP;
	}
	public void setOTP(String oTP) {
		OTP = oTP;
	}
	@Override
	public String toString() {
		return "PostRequestDto{" + 
				"account='" + account + "\'" + 
				", email='" + email + "\'" + 
				", address='" + address + "\'" +
				", password='" + password + "\'" + 
				", phonNumber='" + phoneNumber + "\'" +
				", OTP='" + OTP + "\'"
				+ "}";
	}
}