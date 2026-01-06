package exercicio3Interface;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

	private String nome;
	private String senha;
	private Integer Token;
	public Integer getToken() {
		return Token;
	}


	public void setToken(Integer token) {
		Token = token;
	}


	public Usuario() {
		
	}
	private static List<Usuario> UserList = new ArrayList<>();




	
	public Usuario(String nome, String senha, Integer token) {
		super();
		this.nome = nome;
		this.senha = senha;
		Token = token;
	}
	public Usuario(String nome, String senha) {
		this.nome = nome;
		this.senha = senha;

	}



	public String getNome() {
		return nome;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
