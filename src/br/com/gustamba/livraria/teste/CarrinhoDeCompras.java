package br.com.gustamba.livraria.teste;

import br.com.gustamba.livraria.produtos.Produto;

public class CarrinhoDeCompras {
    
    private double total;
    private Object[] objects = new Object[10];
    private int contador = 0;
    
//    public void adiciona(Livro livro) {
//        System.out.println("Adicionando: " + livro);
//        //livro.aplicaDescontoDe(0.15);
//        total += livro.getValor();
//    }

    public void adiciona(Object object) {
        System.out.println("Adicionando: " + object);
        this.objects[contador] = object;
        contador ++;
        Produto moldado = (Produto) object;
        this.total += moldado.getValor();
    }

    public double getTotal() {
        return total;
    } 

    public Object[] getProdutos() {
        return objects;
    }
}