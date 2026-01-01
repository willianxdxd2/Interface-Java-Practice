package exercicio4Inteface;

public class Parcela {
	private Integer parcelas;
	public Double impostoBoleto(Double valor) {
		
		return valor = valor *  1.30;
	}
	public Double impostocartao(Double valor) {
		
		return valor = valor *  1.10;
	}
	
	public Double Parcelas(Boleto b,Integer parcelas) {
		
		Double parcela =  b.getValorBoleto()/ parcelas;
		Double novoTotal = 0.0;
		
		for(int i = 1; i <= parcelas ; i++) {
			
			novoTotal = novoTotal + impostoBoleto(parcela);
		}
		return novoTotal;
		
	
	}
	public Integer getParcelas() {
		return parcelas;
	}
	public void setParcelas(Integer parcelas) {
		this.parcelas = parcelas;
	}
	public Double Parcelas(CartaoCredito c,Integer parcelas) {
		
		Double parcela =  c.getValorCartao() / parcelas;
		Double novoTotal = 0.0;
		
		for(int i = 1; i <= parcelas ; i++) {
			
			novoTotal = novoTotal + impostocartao(parcela);
			c.setValorCartao(novoTotal);
			 
			
		}
		return novoTotal;
	}
}
