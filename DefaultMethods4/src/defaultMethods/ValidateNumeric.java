package defaultMethods;

public class ValidateNumeric implements Process{

	@Override
	public boolean processing(String data) {
	
		if(data == null || data.isEmpty()) {
			return false;
		}
		
		for(char c : data.toCharArray()) {
			if(!Character.isDigit(c)) {
				return false;
			}
		}
		
		return true;
	}


	
	
	

}
