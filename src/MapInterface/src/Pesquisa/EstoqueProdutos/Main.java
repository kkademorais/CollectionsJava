package Pesquisa.EstoqueProdutos;

public class Main {
    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();

        System.out.println("Imprimindo estoque inicialmente vazio...");
        estoque.exibirProdutos();

        System.out.println();
        System.out.println("Inserindo produtos ao estoque...");
        estoque.adicionarProduto(1249, "Nescau", 5, 12.99);
        estoque.adicionarProduto(1168, "Coca", 3, 7.89);
        estoque.adicionarProduto(1965, "Mussarela", 2, 15.99);
        estoque.adicionarProduto(1184, "Ovo", 1, 16.99);
        estoque.adicionarProduto(1630, "Pão", 2, 13.99);

        System.out.println();
        System.out.println("Imprimindo estoque atualizado...");
        estoque.exibirProdutos();

        System.out.println();
        estoque.calcularValorTotalEstoque();

        System.out.println();
        System.out.printf("Produto mais caro do estoque é %s\n", estoque.obterProdutoMaisCaro());

        System.out.println();
        System.out.printf("Produto mais barato do estoque é %s\n", estoque.obterProdutoMaisBarato());

        System.out.println();
        System.out.printf("Produto em maior quantidade no estoque é %s\n", estoque.obterProdutoMaiorQuantidade());


    }
}
