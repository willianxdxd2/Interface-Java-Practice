package InterfaceComparable;

public class Aluno implements Comparable<Aluno>{

	private String nome;
	private Double mediaFinal;
	public Aluno(String nome, Double mediaFinal) {

		this.nome = nome;
		this.mediaFinal = mediaFinal;
	}
	public Aluno() {

	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getMediaFinal() {
		return mediaFinal;
	}
	public void setMediaFinal(Double mediaFinal) {
		this.mediaFinal = mediaFinal;
	}
	@Override
	public String toString() {
		return "Nome: " + this.nome + "\n Média: " + this.mediaFinal;
	}
	
	
	
	@Override
	public int compareTo(Aluno o) {

		return this.mediaFinal.compareTo(o.getMediaFinal());
	}
	
	
	
	
}
