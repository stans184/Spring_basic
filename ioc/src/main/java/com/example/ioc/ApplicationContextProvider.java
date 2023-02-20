package com.example.ioc;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

// spring 에서 관리해달라고 넘겨주는 annotation
// 이러면 spring 이 실행되면서 Component 가 붙은 class 를 찾아서, SingleTon 형태로 관리
@Component
public class ApplicationContextProvider implements ApplicationContextAware{
	
	private static ApplicationContext context;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		context = applicationContext;
	}
	
	public static ApplicationContext getContext() {
		return context;
	}
}