package Adaptor;

public class AdaptorMain {
	// main 안에서 바로 실행할 method 이기 떄문에 static 이 들어가야 한다?
	public static void conneect(Electro110V electro110v) {
		electro110v.powerOn();
	}

	public static void main(String[] args) {
		
		HairDryer hairDryer = new HairDryer();
		conneect(hairDryer);
		
		Cleaner cleaner = new Cleaner();
//		conneect(cleaner);
		// cleaner 는 220V interface 를 상속받았으므로, 110V 를 인으로 넣는 connect method 에서 실행될 수가 없음
		// Adaptor pattern
		// 자기 자신의 형태는 변환시키지 않고, 중간에 interface 형태를 맞추는 것
		Electro110V cleanerAdaptor = new SocketAdaptor(cleaner);
		conneect(cleanerAdaptor);
		
		AirConditioner airConditioner = new AirConditioner();
		Electro110V airConAdaptor = new SocketAdaptor(airConditioner);
		conneect(airConAdaptor);
	}
}
