package br.unifei.imc.main;

import br.unifei.imc.gerador.GeradorArquivo;
import br.unifei.imc.gerador.GeradorLogin;
import br.unifei.imc.model.Login;
import br.unifei.imc.senha.Senha;
import br.unifei.imc.gerar_senha.NumerosLetrasSimbolos;
import br.unifei.imc.gerar_senha.NumerosLetras;
import br.unifei.imc.gerar_senha.ApenasNumeros;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    private static GeradorArquivo gerador;
    private static List<Login> pessoa;
    public static void main(String[] args) throws IOException {

        String[] test = new String[100];
        int run = 1;
//        /*-------------------------------------------------------------------------------------*/

        /*Tela Usuario*/

        System.out.println("\nBem vindo a tela de login!");
        while (run == 1) {
            Scanner entrada = new Scanner(System.in);
            System.out.println("\nO que deseja fazer?\n\n1-Cadastro\n2-Login\n3-Sair");
            int opc = entrada.nextInt();

            /*Cadastro de Usuario*/
            if (opc == 1) {
                Scanner in = new Scanner(System.in);
                // 1) Informe o seu login
                System.out.println("Login:");
                String login = in.nextLine();
                // 2) Informe a sua senha
                System.out.println("Password: ");
                String password = in.nextLine();

                pessoa = new ArrayList<>();
                pessoa.add(new Login(login,password));

                gerador = new GeradorLogin();
                gerador.gerarArquivo(pessoa);

                System.out.printf("Usuário cadastrado com sucesso.");
                System.out.printf("\n");
                System.out.printf("-----------------------------------------------------------");
              /*Login */
            } else if (opc == 2) {
                Scanner in = new Scanner(System.in);
                // 1) Informe o seu login
                System.out.println("Login: ");
                String login = in.nextLine();
                // 2) Informe a sua senha
                System.out.println("Senha:");
                String pass = in.nextLine();
                if (login.equals("pou") && pass.equals("123")) {
                    System.out.printf("Usuário %s logado com sucesso.", login);
                    /* --------------------------------------------------------------------- */
                    /*Tela Usuario*/
                    while (run == 1) {
                        Scanner entrada2 = new Scanner(System.in);

                        System.out.printf("\n");
                        System.out.printf("-----------------------------------------------------------");

                        System.out.println("\nO que deseja fazer?\n\n1-Criar Senha \n2-Listar Senhas\n3-Sair");
                        int opc_2 = entrada2.nextInt();

                        if (opc_2 == 1) {
                            Senha senha = new Senha();

                            System.out.printf("----------------------------------------------------------- ");
                            System.out.printf("\n");
                            System.out.println("Primeiramente, será gerada uma senha randomica\nVoce deseja qual tipo de senha?");
                            System.out.println("");
                            System.out.println("1-Numérica\n2-Alfanumérico\n3-Caracteres");
                            int tipo = entrada.nextInt();
                            if (tipo == 1) {
                                senha.setTipoSenha(new ApenasNumeros());
                            } else if (tipo == 2) {
                                senha.setTipoSenha(new NumerosLetras());
                            } else
                                senha.setTipoSenha(new NumerosLetrasSimbolos());
                            String s[] = new String[8];
                            s = senha.geraSenha();
                            System.out.print("\nSenha gerada para sua conta: ");
                            for (int i = 0; i < 8; i++) {
                                System.out.print(s[i]);
                            }}
                        else if (opc_2 == 2) {
                            /*Listar as senhas do usuario*/
                        }
                        else  run = 0;}


                }else {
                    System.out.println("Login ou senha inválidos!");}


            } else
                run = 0;
        }

        return;
    }
}