package Strategy;

public class AppendStrategy implements EncodingStrategy{

	@Override
	public String encode(String text) {
		// TODO Auto-generated method stub
		return "ABCD"+text;
	}

}
