package SingleTon;

public class SingleTonMain {

	public static void main(String[] args) {
		
		AClazz aClazz = new AClazz();
		BClazz bClazz = new BClazz();
		
		SocketClient asocket = aClazz.getSocketClient();
		SocketClient bsocket = bClazz.getSocketClient();
		
		System.out.println("두 객체가 동일한가?");
		System.out.println(asocket.equals(bsocket));
		
		// SingleTon 으로 생성하지 않고, 각자 생성해준다면 두 instance 의 socketClient 는 다르
	}
}
