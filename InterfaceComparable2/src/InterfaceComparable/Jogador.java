package InterfaceComparable;

public class Jogador implements Comparable<Jogador>{

	String nickname;
	Double pontuacao;
	Integer nivel;
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public Double getPontuacao() {
		return pontuacao;
	}
	public void setPontuacao(Double pontuacao) {
		this.pontuacao = pontuacao;
	}
	public Integer getNivel() {
		return nivel;
	}
	public void setNivel(Integer nivel) {
		this.nivel = nivel;
	}
	public Jogador(String nickname, Double pontuacao, Integer nivel) {
		super();
		this.nickname = nickname;
		this.pontuacao = pontuacao;
		this.nivel = nivel;
	}
	
	public Jogador() {
	}
	@Override
	public int compareTo(Jogador o) {
		
		if(this.pontuacao == o.getPontuacao()) {
			return -nivel.compareTo(o.getNivel());
					
					
		}else {
			return -pontuacao.compareTo(o.getPontuacao());
		}
	}
	
	@Override
	public String toString() {
		
		return "NickName: " + nickname  + "\n Pontuação: " + pontuacao + "\n Nível: " + nivel;
	}
	
}
