package AOP;

import java.util.concurrent.atomic.AtomicLong;

import Proxy.IBrowser;

public class AOPMain {

	public static void main(String[] args) {
		
		AtomicLong start = new AtomicLong();
		AtomicLong end = new AtomicLong();
		
		IBrowser aopBrowser = new AopBrowswer("www.naver.com", 
				// runnable 의 람다식 표현
				()->{
					System.out.println("before");
					start.set(System.currentTimeMillis());
				},
				()->{
					long now = System.currentTimeMillis();
					end.set(now - start.get());
				}
		);
		aopBrowser.show();
		System.out.println("loading time : " + end.get());
		
		// 두번째부터는 cache 를 사용해서 로딩하기 떄문에 걸리는 시간이 0초
		aopBrowser.show();
		System.out.println("loading time : " + end.get());
	}
}