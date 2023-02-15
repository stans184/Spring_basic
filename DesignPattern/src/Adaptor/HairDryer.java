package Adaptor;

public class HairDryer implements Electro110V{

	@Override
	public void powerOn() {
		System.out.println("Hair Dryer 110V on");
	}

}