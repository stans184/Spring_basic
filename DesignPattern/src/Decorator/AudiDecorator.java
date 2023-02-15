package Decorator;

public class AudiDecorator implements ICar{
	
	protected ICar audi;
	protected String modelName;
	protected int modelPrice;
	
	public AudiDecorator(ICar audi, String name, int price) {
		this.audi = audi;
		this.modelName = name;
		this.modelPrice = price;
	}

	@Override
	public int getPrice() {
		return audi.getPrice() + modelPrice;
	}

	@Override
	public void showPrice() {
		System.out.println(modelName + "의 가격은 " + getPrice());
	}
	
}
