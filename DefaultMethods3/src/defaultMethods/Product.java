package defaultMethods;

public class Product implements Tax {

	private String name;
	private Integer quantity;
	private Double price;
	private String type;
	public Product(String name, Integer quantity, Double price, String type) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.type = type;
	}
	public Product() {

	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Product Name: " + this.name
				+ "\n Product Quantity: " + this.quantity
				+ "\n Product Price(Incresead+): " + this.price 
				+ "\n Product Type: " + this.type;
	}
	
	
	

}
