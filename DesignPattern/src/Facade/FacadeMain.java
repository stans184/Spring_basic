package Facade;

public class FacadeMain {

	public static void main(String[] args) {
		
		FTP ftpClient = new FTP("www.foo.co.kr", 19, "/home/etc");
		ftpClient.connect();
		ftpClient.moveDirectory();
		
		
		Writer writer = new Writer("tmp.txt");
		writer.fileConnect();
		writer.write();
		
		Reader reader = new Reader("tmp.txt");
		reader.fileConnect();
		reader.fileRead();
		
		reader.fileDisconnect();
		writer.fileDisconnect();
		ftpClient.disconnect();
		
		System.out.println("\n===================\n");
		
		// main method 안에서 여러개의 객체를 직접 생성하는 것보다, facade pattern 을 이용해서 해당 객체 안에서 여러 객체를 재생성하도록
		// 여러 객체에 대한 의존성을 안쪽으로 숨긴다??
		SFtpClient sfc = new SFtpClient("www.foo.co.kr", 22, "/home/etc", "tmp2.txt");
		sfc.connect();
		sfc.writer();
		sfc.read();
		sfc.disconnect();
	}
}
