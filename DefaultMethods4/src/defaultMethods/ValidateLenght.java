package defaultMethods;

public class ValidateLenght implements Process{

	@Override
	public boolean processing(String data) {
		return data.length() > 5;
	}
	

}
