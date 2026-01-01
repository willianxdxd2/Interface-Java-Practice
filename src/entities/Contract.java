package entities;

import java.time.LocalDate;

public class Contract {
	private Integer Number;
	private LocalDate date;
	private Double totalValue;
	public Contract() {
	}
	public Integer getNumber() {
		return Number;
	}
	public void setNumber(Integer number) {
		Number = number;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public Double getTotalValue() {
		return totalValue;
	}
	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}
	public Contract(Integer number, LocalDate date, Double totalValue) {
		super();
		Number = number;
		this.date = date;
		this.totalValue = totalValue;
	}
	Color color;
}
