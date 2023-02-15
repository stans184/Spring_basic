package AOP;

import Proxy.Html;
import Proxy.IBrowser;
// AOP 는 관점지향
public class AopBrowswer implements IBrowser{
	
	private String url;
	private Html html;
	private Runnable before;
	private Runnable after;

	public AopBrowswer(String url, Runnable before, Runnable after) {
		this.url = url;
		this.before = before;
		this.after = after;
	}
	
	@Override
	public Html show() {
		// html 이 비어있을 떄, 새로 로딩되는 시간을 보기 위해서
		before.run();
		
		if (html == null) {
			System.out.println("AopBrowswer html loading from : " + url);
			this.html = new Html(url);
			
			// method 실행이 너무 빠를수 있다, 임의로 1.5 초의 delay time 부여
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		after.run();
		System.out.println("AopBrowswer html cache : " + url);
		return html;
	}

}
