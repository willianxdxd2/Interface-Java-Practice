package entities;

public class  Juridica extends Pessoa {
	
	protected Integer empNumber;

	public Integer getEmpNumber() {
		return empNumber;
	}

	public void setEmpNumber(Integer empNumber) {
		this.empNumber = empNumber;
	}

	public Juridica(String name, Double rent, Integer empNumber) {
		super(name, rent);
		this.empNumber = empNumber;
	}
	public Juridica() {
	}
	
	public Double calculo() {
		if (empNumber > 10) {
			return rent += rent * 0.16;
		}else {
			return rent +=rent * 0.14;
	}}

	
	
	
}

