package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Fisica;
import entities.Juridica;
import entities.Pessoa;

public class Application {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter tax of payers ");
		int n = sc.nextInt();
		
		List <Pessoa> list = new ArrayList<>();
		for (int i = 0; i < n ; i++) {
			System.out.println("Tax payer #" + i + "Data" );
			System.out.println("Individual or company (i/c)");
			char ch = sc.next().charAt(0);
			System.out.println("Name: ");
			String name = sc.next();
			System.out.println("Rent: ");
			Double rent = sc.nextDouble();
			if (ch == 'i') {
				System.out.println("HealtExpenses: ");
				Double healtExpenses = sc.nextDouble();
				Pessoa fi = new Fisica(name, rent, healtExpenses);	
				list.add(fi);
			}else {
				System.out.println("Number of employees: ");
				int empNumber = sc.nextInt();
				Pessoa juri = new Juridica(name,rent,empNumber);
				list.add(juri);
			}
				
		}
		System.out.println("Taxes Paid: ");
		
		for (Pessoa p : list) {
			if (p instanceof Fisica pf) {
				System.out.println("Name: " + pf.getName() + "$" +  pf.calculo());
			}else if(p instanceof Juridica pj) {
				System.out.println("Name: " + pj.getName() + "$" + pj.calculo());
			}
		}

	}

}
