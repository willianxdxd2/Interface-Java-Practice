package exercicio3Interface;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Bem vindo ao site ");
        System.out.println("É cliente ou Administrador? cl/adm");
        String r = sc.nextLine();

        Cliente cl = new Cliente();
        Cliente adm = new Cliente();

        if (r.equalsIgnoreCase("cl")) {

            System.out.println("Já possui registro? Sim/Não");
            String R = sc.nextLine();
            boolean var = true;

            // Loop de registro
            while (var) {
                if (R.equalsIgnoreCase("Não")) {
                    while (true) {

                        System.out.println("Insira seu usuario para registro: ");
                        String usuario1 = sc.nextLine();
                        System.out.println("Insira sua senha de registro: ");
                        String senha1 = sc.nextLine();
                        System.out.println("Confirme sua senha de registro: ");
                        String senha2 = sc.nextLine();

                        if (cl.registro(usuario1, senha1, senha2, false)) {
                            System.out.println("Registro efetuado com sucesso!");
                            R = "Sim"; // Atualiza para prosseguir para login
                            var = false;
                            break;
                        } else {
                            System.out.println("Houve um erro no registro, tente novamente!");
                        }

                    }
                } else {
                    var = false; // Usuário já possui registro
                }
            }

      
            boolean vari = true;
            while (vari) {

                if (R.equalsIgnoreCase("Sim")) {

                    System.out.println("Insira seu usuario: ");
                    String usuario = sc.nextLine();
                    System.out.println("Insira sua senha: ");
                    String senha = sc.nextLine();
                    System.out.println("Para login é necessário um token temporário");

                    // Gerar token temporário
                    for (Usuario us : cl.getUsuarios()) {
                        if (us.getNome().equals(usuario) && us.getSenha().equals(senha)) {
                            Integer tokenCriado = cl.tokengerar(us);
                            us.setToken(tokenCriado);
                            System.out.println("Seu token temporário é: " + tokenCriado);
                        }
                    }

                    System.out.println("Insira seu token temporário: ");
                    Integer token = sc.nextInt();
                    sc.nextLine(); 
                    String resposta = ""; 

                    // Login
                    if (cl.login(usuario, senha, token)) {
                        System.out.println("Login efetuado com sucesso!");
                        System.out.println("Deseja sair do login? Sim/Não");
                        resposta = sc.nextLine();

                        if (resposta.equalsIgnoreCase("Sim")) {
                            // Logout
                            System.out.println("Insira seu usuario para deslogar: ");
                            String usuario1 = sc.nextLine();
                            System.out.println("Insira sua senha para deslogar: ");
                            String senha1 = sc.nextLine();

                            if (cl.logout(usuario1, senha1)) {
                                System.out.println("Logout efetuado com sucesso! ");
                                System.out.println("Token temporário resetado. ");
                                vari = false; 
                            } else {
                                System.out.println("Houve um erro ao deslogar, tente novamente! ");
                            }

                        } else if (resposta.equalsIgnoreCase("Não")) {
                            System.out.println("Você continua no seu login...");
                        } else {
                            System.out.println("Resposta inválida, continue logado.");
                        }

                    } else {
                        System.out.println("Login falhou! Verifique usuário, senha ou token.");
                    }
                }

            } 

        } 

        sc.close();
    }
}