package DefaultMethods;

public class ValidatorEmail implements Validator{

	@Override
	public boolean validate(String valor) {
		if(valor.contains("@")) {
			return true;
		}else { 
			return false;
		}
		
	}

	public ValidatorEmail() {

	}

}
