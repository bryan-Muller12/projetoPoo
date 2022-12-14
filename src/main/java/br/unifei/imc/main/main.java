package br.unifei.imc.main;

import br.unifei.imc.gerar_senha.NumerosLetrasSimbolos;
import br.unifei.imc.senha.Senha;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class main {
    public static void someVoidMethod(){
        System.out.println("Bem Vindo a tela de Login, o que deseja fazer?");
    }

    /*private Senha carrinho;

    @Before
    public void init(){
        carrinho = new Senha();
    }

    @Test
    public void testeCompraBoleto(){
        carrinho.addProduto(new Produto("AlienWare",10900.99));
        carrinho.addProduto(new Produto("Pen-drive 256GB",250.78));
        carrinho.calcularPreco();
        double preco = carrinho.getPrecoTotal();
        Assert.assertEquals(10036.59,preco,0.01);
        Assert.assertTrue(carrinho.getTipoPagamento() instanceof NumerosLetrasSimbolos);
    }*/
}
