package entities;

import java.time.LocalDate;

public class Installment {
	private LocalDate data;
	private Double amount;
	public Installment(LocalDate data, Double amount) {
		super();
		this.data = data;
		this.amount = amount;
	}
	public Installment() {
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
}
