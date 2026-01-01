package entities;

public abstract class Pessoa {
	protected String name;
	protected Double rent;
	public Pessoa(String name, Double rent) {
		this.name = name;
		this.rent = rent;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getRent() {
		return rent;
	}

	public void setRent(Double rent) {
		this.rent = rent;
	}

	public Pessoa() {
	}
	
}
