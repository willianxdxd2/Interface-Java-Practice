package defaultMethods;

public class Product_Imported extends Product implements Tax{
	public Product_Imported(String name, Integer quantity, Double price, String type) {
		super(name, quantity, price, type);
	}

	public Product_Imported() {
	
	}
	
	@Override
	public Double Increase(Double value) {
		
		return (value  * 0.25) + value; 
		
	}
	
	
}
