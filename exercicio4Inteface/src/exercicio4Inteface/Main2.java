package exercicio4Inteface;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Bem vindo ao banco ");
		System.out.println("Deseja pagar no boleto ou no cartao C/B");
		char r = sc.next().charAt(0);
		
		if(r == 'B') {
			
			
			Token token = new Token();
			System.out.println("Insira o valor do boleto: ");
			Double valorBoleto = sc.nextDouble();
			System.out.println("Insira o Pagamento");
			Double valorPagamento = sc.nextDouble();
			sc.nextLine();
			System.out.println("Insira a data do pagamento: \"dd/MM/yyyy HH:mm:ss\"");
			String datatxt = sc.nextLine().trim();
			DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
			LocalDateTime data = LocalDateTime.parse(datatxt, fmt);
			System.out.println("Para concluir com a transação, é necessário Inserir o Token abaixo: ");
			System.out.println(token.TokenGerar());
			System.out.println("Insira o token: ");
			Integer Token = sc.nextInt();
			System.out.println("Pagar em quantas parcelas? ");
			Integer parcelas = sc.nextInt();
			Parcela p = new Parcela();
			p.setParcelas(parcelas);
			Boleto b = new Boleto(valorBoleto, valorPagamento,data,Token);
			
				System.out.println("Processando pagamento");
				b.processarPagamento(p);
				System.out.println(b.toString()); 
		}else if(r == 'C') {
			
			System.out.println("Insira o valor do cartao");
			Double valorcartao = sc.nextDouble();	
			System.out.println("Insira o valor do pagamento");
			Double valorpagamento = sc.nextDouble();
			System.out.println("Insira a data do pagamento");
			sc.nextLine();
			String datatxt = sc.nextLine().trim();
			System.out.println("Insira a quantidade de parcelas");
			Integer parcelas = sc.nextInt();
			DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
			LocalDateTime data = LocalDateTime.parse(datatxt, fmt);
			Parcela pe = new Parcela();
			pe.setParcelas(parcelas);
			CartaoCredito cartao = new CartaoCredito(valorcartao,valorpagamento,data);
			
			System.out.println("Processando pagamento");
			
			cartao.processarPagamento(pe);
			System.out.println(cartao.toString()); 
			
		}
			
			
			
			
		
		
	}

}
