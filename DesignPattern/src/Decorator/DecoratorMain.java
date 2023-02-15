package Decorator;

public class DecoratorMain {

	public static void main(String[] args) {
		
		// 기본 base 를 두고, 등급이 올라갈 때마다 가격이 달라지는 decorate
		
		ICar audi = new Audi(1000);
		
		audi.showPrice();
		
		// a3
		ICar audi3 = new A3(audi, "A3");
		audi3.showPrice();
		
		// a5
		ICar audi5 = new A5(audi, "A5");
		audi5.showPrice();
		
		// a7
		ICar audi7 = new A7(audi, "A7");
		audi7.showPrice();
	}
}