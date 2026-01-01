package entities;

import exercicio2Inteface.Controlador;

public class Radio implements Controlador{
	
	protected boolean botao;
	@Override
	public boolean ligar(){
		botao = true;
		return botao;
	};
	@Override
	public boolean desligar(){
		botao = false;
		return botao;
	};
	
	public String musica() {
		if(botao) {
			return "O rádio toda slayer-angel of death";
		}else{
			return "Um silencio inquietante paira o ar";
		}
	}

	public Radio() {

	}
	public Radio(boolean botao) {

		this.botao = botao;
	}
	public boolean isBotao() {
		return botao;
	}
	public void setBotao(boolean botao) {
		this.botao = botao;
	}
		
	}


