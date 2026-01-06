package InterfaceComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos produtos serão digitados?");
		int n = sc.nextInt();
		ArrayList<Produtos>pList = new ArrayList<>();
		for(int i = 0;i < n ;i++) {
			
			System.out.println("Insira o nome do produto: ");
			String nome = sc.nextLine();
			sc.nextLine();
			System.out.println("Insira o preço do produto: ");
			Double preco = sc.nextDouble();
			
			Produtos p = new Produtos(nome,preco);
			pList.add(p);
		}
		
		Collections.sort(pList);
		
		for(Produtos p : pList) {
			System.out.println(p.toString());
			
		}
		
		
		
		
		

	}

}
