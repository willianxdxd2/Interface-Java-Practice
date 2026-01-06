package defaultMethods;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many products? ");
		int n = sc.nextInt();
		
		ArrayList<Product> pdList =  new ArrayList<>();
		for(int i = 0 ;i < n ; i++) {
			sc.nextLine();
			System.out.println("Enter product name:");
			String name = sc.nextLine();
			System.out.println("Enter prouct quantity: ");
			Integer quantity = sc.nextInt();
			System.out.println("Enter price per unity: ");
			Double price = sc.nextDouble();
			sc.nextLine();
			System.out.println("Enter product Type: s|p|i (Standard|Promotional|Imported)");
			char t = sc.next().charAt(0);
			
			if(t == 's') {
				Product p = new Product();
				Product pd = new Product(name,quantity,p.Increase(price),"Standard");
				
				pdList.add(pd);
			}
			else if(t == 'p') {
				Product pp = new Product_promotional(name,quantity,price,"Promotional");
				
				pdList.add(pp);
			}
			else if(t == 'i') {
				
				Product_Imported pii = new Product_Imported();
				Product pi = new Product_Imported(name,quantity,pii.Increase(price),"Imported");
				pdList.add(pi);
			}
		}
		
		
		for(Product p : pdList) {
			System.out.println(p.toString());
		}
		
		

	}

}
