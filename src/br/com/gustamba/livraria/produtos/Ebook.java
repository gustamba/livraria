package br.com.gustamba.livraria.produtos;

import br.com.gustamba.livraria.Autor;

public class Ebook extends Livro implements Promocional {
   
    private double valor;

    private String waterMark;

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public Ebook(Autor autor) {
        super(autor);
    }

    @Override
    public boolean aplicaDescontoDe(double porcentagem) {
        if (porcentagem > 0.15 ) {
            return false;
        }
        System.out.println("aplicando desconto no Ebook");
        double desconto = getValor() * porcentagem;
        setValor(getValor() - desconto);
        return true;
        }

    public void setWaterMark(String waterMark) {
        this.waterMark = waterMark;
    }

    public String getWaterMark() {
        return waterMark;
    }

    @Override
    public String toString() {
        return "Eu sou um Ebook";
    }

}
