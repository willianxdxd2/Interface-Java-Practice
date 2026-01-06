package defaultMethods;

public interface Process {

	public boolean processing(String data);
	
	default boolean next(String data) {
		
		return processing(data);
		
	}
	
	
	
}
