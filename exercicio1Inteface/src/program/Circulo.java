package program;

public class Circulo implements Forma{
	
	private Double raio;
	public Circulo(Double raio) {
		this.raio = raio;
	}
	@Override
	public Double area(Double altura , Double Largura) {
	
		return Math.PI * raio * raio;
	}

	public Double perimetro() {
		return 2 * Math.PI * raio;
	}
	public Circulo() {
	}
}
