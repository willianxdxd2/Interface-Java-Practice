package interfacecomparable;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the number of employees: ");
		int n = sc.nextInt();
		sc.nextLine();

		ArrayList<Employees> emplist = new ArrayList<>(); 
		for(int i = 0 ; i < n ; i++) {
			System.out.println("Enter the name of employee");
			String name = sc.nextLine();
			System.out.println("Enter data on type dd/MM/yyyy");
			String date = sc.nextLine();
			DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate data = LocalDate.parse(date,fmt);
			Employees emp = new Employees(name,data);
			emplist.add(emp);
		}
		Collections.sort(emplist);
		
		for(Employees emp : emplist) {
			
			System.out.println(emp.toString());
			
		}
		
		
		

	}

}
