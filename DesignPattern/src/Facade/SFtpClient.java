package Facade;

public class SFtpClient {

	private FTP ftp;
	private Reader reader;
	private Writer writer;
	// 객체를 한번 감싸면서 의존성을 SFtpClient 가 다 가져갔다.... 무슨말??
	public SFtpClient(FTP ftp, Reader reader, Writer writer) {
		this.ftp = ftp;
		this.reader = reader;
		this.writer = writer;
	}
	
	// method overloading
	// 다른 방식으로 객체를 생성할 수 있도록 생성자의 형태를 다른거로 만들어줌
	public SFtpClient(String host, int port, String path, String fileName) {
		this.ftp = new FTP(host, port, path);
		this.reader = new Reader(fileName);
		this.writer = new Writer(fileName);
	}
	
	public void connect() {
		ftp.connect();
		ftp.moveDirectory();
		writer.fileConnect();
		reader.fileConnect();
	}
	
	public void disconnect() {
		writer.fileDisconnect();
		reader.fileDisconnect();
		ftp.disconnect();
	}
	
	public void read() {
		reader.fileRead();
	}
	
	public void writer() {
		writer.write();
	}
}