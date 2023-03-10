package Proxy;

public class BrowserProxy implements IBrowser{

	private String url;
	private Html html;
	
	public BrowserProxy(String url) {
		this.url = url;
		
	}
	
	@Override
	public Html show() {
		
		if (html == null) {
			this.html = new Html(url);
			System.out.println("BrowswerProxy loading html from : " + url);
		}
		System.out.println("BrowswerProxy use cache html : " + url);
		return html;
	}
}