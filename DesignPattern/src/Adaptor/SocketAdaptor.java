package Adaptor;
// 110V -> 220V 로 가야하니, 어댑터는 110V 로 들어와야 한다
public class SocketAdaptor implements Electro110V{
	// 결론적으로 출력될 220V 도 정의해줘야 한다
	private Electro220V electro220v;
	// 220V 로 들어온 놈을 받고
	public SocketAdaptor(Electro220V electro220v) {
		this.electro220v = electro220v;
	}
	
	// 110V 에서 실행을 의미하는 powerOn method 에서 220V 실행을 시켜주는 connect method 를 실행시켜서 동
	@Override
	public void powerOn() {
		electro220v.connect();
	}

}
