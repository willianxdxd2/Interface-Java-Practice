package exercicio3Interface;

public interface Autentificacao {
	
	boolean registro(String usuario,String senha,String senha2,boolean registro_existente);
	boolean login (String usuario,String senha,Integer token);
	boolean logout (String usuario,String senha);
	
}
