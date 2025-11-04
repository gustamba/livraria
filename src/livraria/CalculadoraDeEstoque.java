package livraria;

public class CalculadoraDeEstoque {
	public static void main(String[] args) {
		
		Livro livro = new Livro();
		livro.adicionaValor(59.90);

		System.out.println("Valor atual: " + livro.retornaValor());

		//livro.valor -= livro.valor * 0.1;

		if (!livro.aplicaDescontoDe(0.1)){
			System.out.println("Desconto não pode ser maior do que 30%");
		}
		livro.aplicaDescontoDe(0.1);

		System.out.println("Valor com desconto: " + livro.retornaValor());
	}
}
