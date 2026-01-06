package entities;

public class Fisica extends Pessoa{

	protected Double healtExpenses;
	
	public Fisica(String name, Double rent, Double healtExpenses) {
		super(name, rent);
		this.healtExpenses = healtExpenses;
	}
	public Fisica() {
	}
	public Double getHealtExpenses() {
		return healtExpenses;
	}
	public void setHealtExpenses(Double healtExpenses) {
		this.healtExpenses = healtExpenses;
	}
	
	public Double calculo() {
		if (rent < 2000.00) {
			
			return 0.50 * healtExpenses  -  rent * 0.15;
		}
		else  {
			return 0.50 * healtExpenses  -  rent * 0.25;
		}
		
}}
