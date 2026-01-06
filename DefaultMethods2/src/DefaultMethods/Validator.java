package DefaultMethods;

public interface Validator {

	public boolean validate (String valor);
	public default boolean validatenotnull(String valor) {
		if(valor != null) {
			return true;
		}else {
			return false;
		}
	}
	
	

}
