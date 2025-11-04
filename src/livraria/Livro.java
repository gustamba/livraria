package livraria;

public class Livro {
	String nome;
	String descricao;
	private double valor;
	String isbn;
	Autor autor;

	void mostrarDetalhes() {
		System.out.println("Mostrando detalhes do livro ");
		System.out.println("Nome: " + nome);
		System.out.println("Descrição:" + descricao);
		System.out.println("Valor: " + valor);
		System.out.println("ISBN: " + isbn);
		
		if (this.temAutor()) {
			autor.mostrarDetalhes();
		}

		System.out.println("--");
	}

	boolean temAutor(){
		return this.autor != null;
	}

	public boolean aplicaDescontoDe(double porcentagem) {
		if (porcentagem > 0.3 ) {
			return false;
		}
		this.valor -= this.valor * porcentagem;
		return true;
	}
	
	void adicionaValor(double valor) {
		this.valor = valor;
	}

	double retornaValor() {
		return this.valor;
	}

}