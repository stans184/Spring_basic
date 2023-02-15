package Adaptor;

public class AirConditioner implements Electro220V{

	@Override
	public void connect() {
		System.out.println("Air-Conditioner 220V on");
	}

}
