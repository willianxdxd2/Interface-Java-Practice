package exercicio2Inteface;

import java.util.Scanner;

import entities.Radio;
import entities.Televisão;
import entities.Ventilador;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Você encontra uma sala velha e antiga, deseja entrar? Sim/Não");
		String r = sc.nextLine();
		if(r.equals("Não")) {
			System.out.println("Você se distancia da sala velha e antiga, sente que talvez tenha deixado uns objetos interessantes para trás");
		}
		while(r.equals("Sim")) {		
			System.out.println("Você se aproxima do rádio, parece velho e bem desgastado");
			System.out.println("Deseja liga-lo?Sim/Não");
			String l = sc.nextLine();
			Radio radio =  new Radio();
			if(l.equals("Sim")) {
				radio.ligar();
				
				while(radio.isBotao()) {
					
					System.out.println(radio.musica());
					System.out.println("Deseja desligar? Sim/Não");
					String le = sc.nextLine();
					
					if (le.equals("Sim")){
						radio.desligar();
						
						} 
					}
			  }
			if(l.equals("Não")) {
				System.out.println("Você se distancia do rádio e percebe que a poucos metros existe uma televisão ");
				System.out.println("É uma TV led padrão 22 polegadas, Deseja ligar? Sim/Não");
				String tv_interacao = sc.nextLine();
				Televisão tv = new Televisão();
				if(tv_interacao.equals("Sim")) {
						
						 tv.ligar();
					while(tv.isLigar()) {
						System.out.println(tv.programaTV());
						
						System.out.println("Deseja desligar? Sim/Não");
						String ler = sc.nextLine();
						if(ler.equals("Sim")) {
							tv.desligar();
						}}
					}else if(tv_interacao.equals("Não")) {
						System.out.println("Você deixa a TV e o rádio para trás anda mais alguns metros na sala antiga,"
								+ "e percebe que tem um ventilador de 6 pás encostado na parede Deseja liga-lo? Sim/Não");
						String lerr = sc.nextLine();
						Ventilador ventilador = new Ventilador();
						
						if(lerr.equals("Sim")) {
							ventilador.ligar();
							while(ventilador.isBotao()) {
								System.out.println(ventilador.ventilar());
								System.out.println("Deseja desligar? ");
								lerr=sc.nextLine();
									if(lerr.equals("Sim")) {
									ventilador.desligar();
									}}
							}else if(lerr.equals("Não")){
								
									
									System.out.println("Você ignora o ventilador e vai embora, nada acontece.");
									r = "";}
							}}}}}