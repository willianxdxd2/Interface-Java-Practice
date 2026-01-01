package entities;

public class Televisão {

	protected boolean ligar;
	
	public boolean ligar() {
		ligar = true;
		return ligar;
	}
	public boolean desligar() {
		ligar = false;
		return ligar;
	}
	public boolean isLigar() {
		return ligar;
	}
	public void setLigar(boolean ligar) {
		this.ligar = ligar;
	}
	public Televisão(boolean ligar) {
		super();
		this.ligar = ligar;
	}
	public Televisão() {
	}
	
	public String programaTV() {
		if(ligar) {
			return "Esta passando um desenho animado sobre um cachorro que tem muito medo de assombrações";
		}
		return "Você enxerga seu reflexo na TV, está precisando cortar o cabelo";

	}
	
}
