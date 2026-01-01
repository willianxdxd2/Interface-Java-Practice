package exercicio5Interface;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Calculo de uma esfera insira o raio");
		Double raio = sc.nextDouble();
		System.out.println("Insira o pi ");
		Double pi = sc.nextDouble();
		
		Esfera esfera = new Esfera(raio,pi);
		
		
		System.out.println(esfera.ConstatesMatemtacias(pi, raio));
	}

}
