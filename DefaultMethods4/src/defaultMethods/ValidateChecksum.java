package defaultMethods;

public class ValidateChecksum implements Process{

	@Override
	public boolean processing(String data) {

	    if (data == null || data.isEmpty()) {
	        return false;
	    }
		

	    int soma = 0;
	    
	    for(char c: data.toCharArray()) {
	    	
	    	if(!Character.isDigit(c)) {
	    		return false;
	    	}
	    	
	    	
	    	soma += Character.getNumericValue(c);
	    }
	    return soma % 2 == 0;
	}

}
