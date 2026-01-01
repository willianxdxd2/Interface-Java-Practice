package entities;

import exercicio2Inteface.Controlador;

public class Ventilador implements Controlador{
	protected boolean botao;
	
	public boolean ligar() {
		botao = true;
		return botao;
	}
	public boolean desligar() {
		botao = false;
		return botao;
	}
	public Ventilador(boolean botao) {
		this.botao = botao;
	}
	public boolean isBotao() {
		return botao;
	}
	public void setBotao(boolean botao) {
		this.botao = botao;
	}
	public Ventilador() {
	}
	
	public String ventilar() {
		if(botao = true) {
			return "Você sente um ar fresco nos seus cabelos";
		}else {
			return "O ar parado é inquietante";
		}

	}
	
}
