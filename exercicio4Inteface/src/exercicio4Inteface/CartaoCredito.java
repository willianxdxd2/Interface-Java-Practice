package exercicio4Inteface;

import java.time.LocalDateTime;

public class CartaoCredito implements Pagamento{
	private Double valorCartao;
	private Double valorPagamento;
	private LocalDateTime data_pagamento;
	
	public CartaoCredito(Double valorCartao, Double valorPagamento, LocalDateTime data_pagamento) {
		this.valorCartao = valorCartao;
		this.valorPagamento = valorPagamento;
		this.data_pagamento = data_pagamento;
	}
	
	public CartaoCredito() {
	
	}
	
		
	public Double getValorCartao() {
		return valorCartao;
	}

	public void setValorCartao(Double valorCartao) {
		this.valorCartao = valorCartao;
	}

	@Override
	public Double processarPagamento(Parcela p) {
			Double vari = p.impostocartao(valorPagamento);
			this.setValorCartao(vari);
			return vari;
	}
	public String toString(){
		return "Valor pago foi de:" + this.valorCartao + "Data de pagamento: " + this.data_pagamento + "O produto será liberado em 3 dias, na data: " + this.data_pagamento.plusDays(3);
	}



	
	
}
