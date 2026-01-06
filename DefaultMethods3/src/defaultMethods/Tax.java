package defaultMethods;

public interface Tax {
	
	public default Double Increase(Double value) {
		
		return (value  * 0.10) + value; 
		
	}
	
	
}
