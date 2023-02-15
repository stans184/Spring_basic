package Observer;

public class ObserverMAin {

	public static void main(String[] args) {
		
		Button button = new Button("bt");
		
		button.addListener(new IButtonListener() {
			
			@Override
			public void clickEvent(String event) {
				System.out.println(event);
			}
		});
		
		button.click("message send click 1");
		button.click("message send click 2");
		button.click("message send click 3");
		button.click("message send click 4");
	}
}
