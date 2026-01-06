package exercicio4Inteface;

import java.security.SecureRandom;

public class Token {

	public Integer TokenGerar() {	
		SecureRandom random = new SecureRandom();
		Integer token = random.nextInt(900000) + 100000;
		Boleto b = new Boleto();
		b.setToken(token);
		return token;
	}
	
}
