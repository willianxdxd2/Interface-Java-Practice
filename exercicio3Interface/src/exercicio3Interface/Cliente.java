package exercicio3Interface;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class Cliente implements Autentificacao{

	
	protected String usuario;
	protected String senha;
	protected String senha2;
	boolean registro_existente;
	Integer token;
	List<Usuario> usuarios = new ArrayList<>();
	public boolean registro(String usuario,String senha,String senha2,boolean registro_existente) {
		
		for (Usuario u: usuarios) {
			if(u.getNome().equals(usuario)) {
				return false;
			}	
		}
		
		if(!senha.equals(senha2)) {
			return false;
		}
		
		usuarios.add(new Usuario(usuario,senha));
		return true;	
}
	
	
	public boolean login (String usuario,String senha,Integer token) {
		
		
		for(Usuario u:usuarios) {
			if(u.getNome().equals(usuario) && u.getSenha().equals(senha) && u.getToken().equals(token) ) {
				return true;
		}
		}		
	return false;
		
	}
	
	public String getUsuario() {
		return usuario;
	}


	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	public String getSenha2() {
		return senha2;
	}


	public void setSenha2(String senha2) {
		this.senha2 = senha2;
	}


	public boolean isRegistro_existente() {
		return registro_existente;
	}


	public void setRegistro_existente(boolean registro_existente) {
		this.registro_existente = registro_existente;
	}


	public Integer getToken() {
		return token;
	}


	public void setToken(Integer token) {
		this.token = token;
	}


	public boolean logout (String usuario,String senha) {
		
		
		for(Usuario u:usuarios) {
		if(u.getNome().equals(usuario) && u.getSenha().equals(senha)) {
			u.setToken(000000);;
			return true;
		}}
		return false;
		}
	
		
		
		public Integer tokengerar(Usuario u) {
			
	        SecureRandom random = new SecureRandom();

	        int novoToken = 100000 + random.nextInt(900000);
	        u.setToken(novoToken); 
	        
	        return novoToken;
			
		}


		public List<Usuario> getUsuarios() {
			return usuarios;
		}


		public void setUsuarios(List<Usuario> usuarios) {
			this.usuarios = usuarios;
		}
		
		
		
	
}
