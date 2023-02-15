package Proxy;

public class Browser implements IBrowser{
	
	private String url;
	
	public Browser(String url) {
		this.url = url;
	}

	@Override
	public Html show() {
		System.out.println("Browser loading from : " + url);
		return new Html(url);
	}
}