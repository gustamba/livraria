package br.com.gustamba.livraria.teste;

import br.com.gustamba.livraria.Autor;

public class ComprarandoComEquals {

    public static void main(String[] args) {

        Autor autor = new Autor();
        autor.setNome("Rodrigo Turini");

        Autor autor2 = new Autor();
        autor2.setNome("Rodrigo Turini");

        if (autor.equals(autor2)) {
            Boolean result = autor.equals(autor2);
            System.out.println(result);
            System.out.println(autor.getNome() + " e " + autor2.getNome() + " são iguais");
        } else {
            Boolean result = autor.equals(autor2);
            System.out.println(result);
            System.out.println(autor.getNome() + " e " + autor2.getNome() + " são diferentes");
        }

        if (autor.equals("Rodrigo")) {
            System.out.println("iguais");
        }

        System.out.println(autor.getClass().getSimpleName());
    }

}
