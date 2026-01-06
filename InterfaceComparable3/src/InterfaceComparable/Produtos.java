package InterfaceComparable;

public class Produtos implements Comparable<Produtos>{


	private String nome;
	private Double preço;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPreço() {
		return preço;
	}
	public void setPreço(Double preço) {
		this.preço = preço;
	}

	public Produtos() {
		
	}
	
	public Produtos(String nome, Double preço) {

		this.nome = nome;
		this.preço = preço;
	}
	@Override
	public int compareTo(Produtos o) {
		
		if(this.preço == o.preço) {
			return this.nome.compareTo(o.getNome());
		}else {
			return this.preço.compareTo(o.preço);
		}
		
	}
	@Override
	public String toString() {
		return String.format("Nome: %s | Preço: %.3f" , nome ,preço);
	}
	
	
}
