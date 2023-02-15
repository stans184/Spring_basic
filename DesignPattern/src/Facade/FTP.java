package Facade;

public class FTP {

	private String host;
	private int port;
	private String path;
	
	public FTP(String host, int port, String path) {
		this.host = host;
		this.port = port;
		this.path = path;
	}
	
	public void connect() {
		System.out.println("FTP host : " + host + "port : " + port + " connecting");
	}
	
	public void moveDirectory() {
		System.out.println("path : " + path + " moving");
	}
	
	public void disconnect() {
		System.out.println("FTP disconnecting");
	}
}
