package exercicioInterface;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entities.Contract;
import entities.ContractService;

public class Program {

	public static void main(String[] args) {
		System.out.println("Entre com os dados do contrato: ");
		
		Scanner sc =  new Scanner (System.in);
		
		
		
		System.out.println("Numero: ");
		int number = sc.nextInt();
		System.out.println("(dd/MM/yyyy) Data: ");
		String data = sc.next();
		sc.nextLine();
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		LocalDate date =LocalDate.parse(data,fmt);
		
		System.out.println("Valor do contrato ");
		Double TotalValue = sc.nextDouble();
		
		Contract contrato =  new Contract(number,date,TotalValue);
		
		System.out.println("Entre com o numero de parcelas: ");
		Integer Months = sc.nextInt();
		ContractService servico= new ContractService();
		servico.processContract(contrato, Months);
		
		
	}

}
