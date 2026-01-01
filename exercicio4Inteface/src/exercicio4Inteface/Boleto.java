package exercicio4Inteface;

import java.security.SecureRandom;
import java.time.LocalDateTime;

public class Boleto implements Pagamento{

	
	private Double valorBoleto;
	private Double valorPagamento;
	private LocalDateTime data_pagamento;
	private Integer Token;
	
	
	public Double getValorBoleto() {
		return valorBoleto;
	}

	public void setValorBoleto(Double valorBoleto) {
		this.valorBoleto = valorBoleto;
	}
	
	public Boleto(Double valorBoleto, Double valorPagamento, LocalDateTime data_pagamento, Integer token) {
		this.valorBoleto = valorBoleto;
		this.valorPagamento = valorPagamento;
		this.data_pagamento = data_pagamento;		
		Token = token;
	}
	@Override
	public Double processarPagamento(Parcela p) {
			Double vari = p.impostoBoleto(valorPagamento);
			this.setValorBoleto(vari);
			return vari;}
	public Boleto() {
		
	}

	public Integer getToken() {
		return Token;
	}

	public void setToken(Integer token) {
		Token = token;
	}

	public Double getValorPagamento() {
		return valorPagamento;
	}

	public void setValorPagamento(Double valorPagamento) {
		this.valorPagamento = valorPagamento;
	}

	public LocalDateTime getData_pagamento() {
		return data_pagamento;
	}

	public void setData_pagamento(LocalDateTime data_pagamento) {
		this.data_pagamento = data_pagamento;
	}
	@Override
	public String toString(){
		return "Valor pago foi de:" + this.valorBoleto + "Data de pagamento: " + this.data_pagamento + "O produto será liberado em 3 dias, na data: " + this.data_pagamento.plusDays(3);
	}
{}

		
	}

