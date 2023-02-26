package com.example.aop.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Aspect
@Component
public class TimerAop {
	
	@Pointcut("execution(* com.example.aop.controller..*.*(..))")
	private void cut() {
		
	}
	
	@Pointcut("@annotation(com.example.aop.annotation.Timer)")
	private void enableTimer() {
		
	}
	
	/*
	 * restapicontroller 에서 사용하는 모든 method 에 동일한 기능이 들어갈 때, 반복적으로 코딩을 하지 말고
	 * Aop 로 밖으로 빼서 구현해줄 수 있음
	 * 
	 *  > method 의 실행 시간을 잰다, 복잡한 기능이 있거나, 외부 DB 및 server 와 통신을 하거나 등
	 */
	@Around("cut() && enableTimer()")
	public void around(ProceedingJoinPoint joinPoint) throws Throwable {
		
		var stopWatch = new StopWatch();
		stopWatch.start();
		
		Object result = joinPoint.proceed();
		
		stopWatch.stop();
		
		System.out.println("total time : " + stopWatch.getTotalTimeSeconds());
	}
}