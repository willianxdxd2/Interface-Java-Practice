package exercicio5Interface;

public class Esfera implements ConstantesMatematicas{
	
	Double raio;
	Double pi;
	
	public Double ConstatesMatemtacias(Double pi,Double raio) {
	
		Double volume = ((4 * (pi * (Math.pow(raio, 3))))/3); 
		return volume;
		
		
	}

	public Esfera(Double raio, Double pi) {
		super();
		this.raio = raio;
		this.pi = pi;
	}
	
}
