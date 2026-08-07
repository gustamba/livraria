package br.com.gustamba.livraria.teste;

import br.com.gustamba.livraria.Autor;
import br.com.gustamba.livraria.produtos.Ebook;
import br.com.gustamba.livraria.produtos.LivroFisico;
import br.com.gustamba.livraria.produtos.Produto;

public class RegistroDeVendas {
    public static void main(String[] args) {
        
        Autor autor = new Autor();
        autor.setNome("Mauricio Aniche");

        LivroFisico fisico = new LivroFisico(autor);
        fisico.setNome("Test-Driven Development");
        fisico.setValor(59.90);

        Ebook ebook = new Ebook(autor);
        ebook.setNome("Test-Driven Development");
        ebook.setValor(29.90);

        if (fisico.aplicaDescontoDe10Porcento()) {
            System.out.println("Valor agora é " + fisico.getValor());
        }

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        
        carrinho.adiciona(fisico);
        carrinho.adiciona(ebook);

        System.out.println("Total " + carrinho.getTotal());
        
        Produto[] produtos = carrinho.getProdutos();
        
        for (int i = 0; i <= produtos.length; i++) {
        	try {
                Produto produto = produtos[i];
                if (produto != null) {
                    System.out.println(produto.getValor());
                }
            } catch (Exception e) {
                System.out.println("deu exception no indice " + i);
                e.printStackTrace();
            }
        }
        System.out.println("Fui executado!");
    }
}