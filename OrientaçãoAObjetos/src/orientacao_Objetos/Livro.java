package orientacao_Objetos;

public class Livro {

	
	String nome;
	String descricao;
	String autor;
	String isbn;
	double preco;
	String dataPub;
	
	void dadosLivro () {
		System.out.printf("Nome do Livro:  " + nome);
		System.out.printf("Preço:  "+ preco);
		System.out.printf("Autor:  "+ autor);
		System.out.printf("Data de Publicação:  " + dataPub + "\n");
		
	}
}
