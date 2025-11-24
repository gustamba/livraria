package livraria;

public class CarrinhoDeCompras {
    public void adiciona(Livro livro) {
        Ebook ebook = (Ebook) livro;
        ebook.getWaterMark();
        System.out.println("Adicionando: " + livro);
    }

}
