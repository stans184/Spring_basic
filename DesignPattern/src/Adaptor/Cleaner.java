package Adaptor;

public class Cleaner implements Electro220V{

	@Override
	public void connect() {
		System.out.println("Cleaner 220V on");
	}

}
