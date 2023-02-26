package com.example.aop.aop;

import java.util.Base64;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.example.aop.DTO.User;

@Aspect
@Component
public class DecodeAop {
	
	@Pointcut("execution(* com.example.aop.controller..*.*(..))")
	private void cut() {
		
	}
	
	@Pointcut("@annotation(com.example.aop.annotation.Decode)")
	private void enableDecode() {
		
	}
	
	@Before("cut() && enableDecode()")
	public void before(JoinPoint joinPoint) {
		Object[] args = joinPoint.getArgs();
		
		for (Object obj : args) {
			if (obj instanceof User) {
				User user = User.class.cast(obj);
				String base64Email = user.getEmail();
				var email = new String(Base64.getDecoder().decode(base64Email));
				user.setEmail(email);
			}
		}
	}
	
	@AfterReturning(value = "cut() && enableDecode()", returning = "returnObj")
	public void afterReturn(JoinPoint joinPoint, Object returnObj) {
		if (returnObj instanceof User) {
			User user = User.class.cast(returnObj);
			String email = user.getEmail();
			String base64Email = Base64.getEncoder().encodeToString(email.getBytes());
			user.setEmail(base64Email);
		}
	}
}