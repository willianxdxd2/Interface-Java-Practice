package program;

public class Retangulo implements Forma{

	private Double altura;
	private Double largura;
	public Retangulo(Double altura, Double largura) {
		this.altura = altura;
		this.largura = largura;
	}
	@Override
	public Double area(Double altura , Double Largura) {
		return altura * largura;
	}
	@Override
	public Double perimetro() {
		return 2*(altura + largura);
	}
	
}
