package example;

import br.unifei.imc.senha.Senha;
import br.unifei.imc.gerar_senha.NumerosLetrasSimbolos;
import br.unifei.imc.gerar_senha.NumerosLetras;
import br.unifei.imc.gerar_senha.ApenasNumeros;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String[] test = new String[100];
        int run = 1;
        System.out.println("\nBem vindo a tela de login!");
       while (run == 1) {
            Scanner entrada = new Scanner(System.in);
            System.out.println("\nO que deseja fazer?\n\n1-Login\n2-Cadastro\n3-Sair");
            int opc = entrada.nextInt();
            if (opc == 1) {

            } else if (opc == 2) {
                Senha senha = new Senha();
                System.out.println("Primeiramente, será gerada uma senha randomica\nVoce deseja qual tipo de senha?\n1-Numérica\n2-Alfanumérico\n3-Caracteres\n");
                int tipo = entrada.nextInt();
                if(tipo == 1){
                    senha.setTipoSenha(new ApenasNumeros());
                }
                else if (tipo == 2){
                    senha.setTipoSenha(new NumerosLetras());
                }
                else
                    senha.setTipoSenha(new NumerosLetrasSimbolos());
                String s[] = new String[8];
                s = senha.geraSenha();
                System.out.print("\nSenha gerada para sua conta: ");
                for(int i = 0; i<8; i++){
                    System.out.print(s[i]);
                }
            } else
                run = 0;
        }
        return;
    }
}