package Facade;

public class Writer {

	private String fileName;
	
	public Writer(String name) {
		this.fileName = name;
	}
	
	public void fileConnect() {
		System.out.printf("Writer %s connecting", fileName);
		System.out.println();
	}
	
	public void fileDisconnect() {
		String msg = String.format("Writer %s disconnecting", fileName);
		System.out.println(msg);
	}
	
	public void write() {
		String msg = String.format("Writer %s writing", fileName);
		System.out.println(msg);
	}
	
}
