package livraria;

public class Autor {
    String nome;
    String email;
    String cpf;

    void mostrarDetalhes() {
        System.out.println("Mostrando detalher do autor ");
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("CPF: " + cpf);
    }
}
