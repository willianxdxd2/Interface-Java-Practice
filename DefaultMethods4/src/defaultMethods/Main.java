package defaultMethods;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter a data");
		String data = sc.nextLine();
		
		
		ValidateLenght v1 = new ValidateLenght();
		ValidateNumeric v2 = new ValidateNumeric();
		ValidateChecksum v3 = new ValidateChecksum();
		
		boolean valido = v1.next(data) && v2.next(data) && v3.next(data);
		
		if(valido) {
			System.out.println("Dado válido");
		}else {
			System.out.println("Dado inválido");
		}
	}

	

}
