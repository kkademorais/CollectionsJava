package Ordenacao.Livraria;

public class Main {
    public static void main(String[] args) {

        Livraria livraria = new Livraria();

        System.out.println();
        System.out.println("Exibindo map inicialmente vazio: ");
        livraria.exibirLivrosOrdenadosPorPreco();

        System.out.println();
        System.out.println("Adicionando livros na livraria...");
        livraria.adicionarLivro("www.amazon.com/01", "Pequeno Principe", "Jean Paul Sartre", 50.99);
        livraria.adicionarLivro("www.amazon.com/02", "Harry Potter", "JK Rowling", 65.75);
        livraria.adicionarLivro("www.amazon.com/03", "Diario de um banana", "Disney", 24.99);
        livraria.adicionarLivro("www.amazon.com/04", "Carrossel", "SBT", 32.5);
        livraria.adicionarLivro("www.amazon.com/05", "Toy Story", "Disney", 35);

        System.out.println();
        System.out.println("Exibindo map atualizado: ");
        livraria.exibirLivrosOrdenadosPorPreco();

        System.out.println();
        System.out.println("Qual livro mais barato? ");
        livraria.obterLivroMaisBarato();

        System.out.println();
        System.out.println("Qual livro mais caro? ");
        livraria.obterLivroMaisCaro();

        System.out.println();
        System.out.println("Pesquisando livros da Disney...");
        livraria.pesquisarLivrosPorAutor("disney");

        System.out.println();
        System.out.println("Removendo Carrossel da livraria...");
        livraria.removerLivro("carrossel");

        System.out.println();
        System.out.println("Pesquisando Carrossel na livraria...");
        livraria.pesquisarLivrosPorAutor("SBT");

        System.out.println();
        System.out.println("Exibindo livraria final...");
        livraria.exibirLivrosOrdenadosPorPreco();



    }
}
