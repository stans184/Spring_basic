package Strategy;

public class StrategyMain {

	public static void main(String[] args) {
		
		Encoder encoder = new Encoder();
		
		// Base64
		EncodingStrategy base64 = new Base64Strategy();
		
		// normal
		EncodingStrategy normal = new NormalStrategy();
		
		String message = "hello java";
		
		// base64, normal, append 등 전략만 수정해서, 실제 우리가 사용하는 encoder 객체는 그대로 두고
		// 다른 결과값을 도출해 나간다
		// 전략 method 를 가지는 전략 객체
		// 전략 객체를 사용하는 컨텍스트
		// 전략 객체를 생성해서 컨텍스트에 주입하는 클라이언트
		encoder.setEncodingStrategy(base64);
		String base64Result = encoder.getMessage(message);
		System.out.println(base64Result);
		
		encoder.setEncodingStrategy(normal);
		String normalResult = encoder.getMessage(message);
		System.out.println(normalResult);
		
		encoder.setEncodingStrategy(new AppendStrategy());
		String appendResult = encoder.getMessage(message);
		System.out.println(appendResult);
	}
}