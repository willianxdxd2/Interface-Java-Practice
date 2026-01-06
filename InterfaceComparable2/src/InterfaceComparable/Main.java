package InterfaceComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos jogadores serão digitados:" );
		int n = sc.nextInt();
		ArrayList<Jogador>JogList =  new ArrayList<>();
		for(int i = 0; i < n ; i++) {
			sc.nextLine();
			System.out.println("Insira o nome do jogador: ");
			String nome = sc.nextLine();
			System.out.println("Insira a pontuacao do jogador: ");
			Double pontuacao = sc.nextDouble();
			System.out.println("Insira o nível do jogador: ");
			Integer nivel = sc.nextInt();
			
			
			
			Jogador jog = new Jogador(nome,pontuacao,nivel);
			JogList.add(jog);
		}
		
		Collections.sort(JogList);
		
		for(Jogador j : JogList) {
			System.out.println(j.toString());
			
			
		}
		
		

	}

}
