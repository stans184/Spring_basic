package Facade;

public class Reader {

	private String fileName;
	
	public Reader(String name) {
		this.fileName = name;
	}
	
	public void fileConnect() {
		System.out.printf("Reader %s connecting", fileName);
		System.out.println();
	}
	
	public void fileRead() {
		String msg = String.format("Reader %s reading", fileName);
		System.out.println(msg);
	}
	
	public void fileDisconnect() {
		String msg = String.format("Reader %s disconnecting", fileName);
		System.out.println(msg);
	}
}
