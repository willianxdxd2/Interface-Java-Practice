package DefaultMethods;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ValidatorEmail em = new ValidatorEmail();
		
		System.out.println("Enter a email");
		String email = sc.nextLine();

		
		if(em.validatenotnull(email) == true) {
			if(em.validate(email) == true) {
				System.out.println("the email is valid");
			}else {
				System.out.println("The email its not valid");
			}
		}
	}

}
