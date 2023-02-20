package di;

public class DiMain {

	public static void main(String[] args) {
		
		String url = "www.naver.com/books/it?page=10&size=20&name=spring-boot";
		
//		// Base 64 encoding
//		Base64Encoder encoder = new Base64Encoder();
//		String baseResult = encoder.encode(url);
//		System.out.println(baseResult);
//		
//		// url encoding
//		UrlEncoder urlEncoder = new UrlEncoder();
//		String urlResult = urlEncoder.encode(url);
//		System.out.println(urlResult);
		
		// encdoer 객체를 조작하지 않아도 설정을 바꿔줄 수 있음
		// 외부에서 사용할 객체를 전달 받는곳이 DI - dependency injection
		// 밑 코드에서는 encoder 의 성질을 조작하는 부분
		// 코드의 관리 및 재사용 용이
		// 아직까지 하기 코드에서는 개발자가 관리하고 있음
		Encoder encoder = new Encoder(new UrlEncoder());
		String result = encoder.encode(url);
		System.out.println(result);
	}
}