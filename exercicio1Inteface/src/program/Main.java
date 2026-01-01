package program;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Circulo ou Retangulo?");
		String r = sc.next();
		sc.nextLine();
		if (r.equals("Circulo")){
			
			System.out.println("Qual o raio?");
			Double R = sc.nextDouble();
			Circulo circulo = new Circulo(R);
			System.out.println("Perimetro: " + circulo.perimetro() + "Area: " + circulo.area(R, R));
		}else {
			System.out.println("Qual a altura? ");
			Double altura = sc.nextDouble();
			System.out.println("Qual a Largura? ");
			Double Largura = sc.nextDouble();
			Retangulo retangulo = new Retangulo(altura,Largura);
			System.out.println("Área: " + retangulo.area(altura, Largura) + "Perimetro: " + retangulo.perimetro());
		}
	}

}
