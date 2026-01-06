package InterfaceComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite quantos alunos serão colocados: ");
		int n = sc.nextInt();
		
		ArrayList<Aluno> AlunoList = new ArrayList<>();
		for(int i = 0 ; i < n; i++) {
			sc.nextLine();
			System.out.println("Insira o nome do aluno: ");
			String nome = sc.nextLine();
			System.out.println("Insira a média do aluno: ");
			Double media = sc.nextDouble();
			Aluno al = new Aluno(nome,media);
		
			AlunoList.add(al);
			
		}
		Collections.sort(AlunoList);
		for(Aluno o : AlunoList) {
			
			System.out.println(o.toString());
		}
		
	}

}
