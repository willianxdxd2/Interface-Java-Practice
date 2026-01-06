package InterfaceComparable;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args ) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many commitments? ");
		int n = sc.nextInt();
		sc.nextLine();
		ArrayList<commitment> commitlist= new ArrayList<>();
		for(int i = 0 ; i < n; i++) {
	
		System.out.println("Enter description of commitment: ");
		String description = sc.nextLine();
		System.out.println("generating Date");
		LocalDateTime now = LocalDateTime.now();
		
		commitment cm = new commitment(description,now);
			
		commitlist.add(cm);
			
		}
		
		
		Collections.sort(commitlist);
		
		for(commitment cm : commitlist) {
			
			System.out.println(cm.toString());
		}
	}
}
