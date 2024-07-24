package SetInterface.Ordenacao.CadastroProdutos;

public class Main {
    public static void main(String[] args) {

        CadastroProdutos listaProdutos = new CadastroProdutos();

        System.out.println("Imprimindo lista de produtos inicialmente vazia: ");
        listaProdutos.verProdutos();

        System.out.println();
        System.out.println("Preenchendo lista de produtos: ");
        listaProdutos.adicionarProduto("Carne", 2547, 27.99, 2);
        listaProdutos.adicionarProduto("Coca cola", 4038, 7.99, 2);
        listaProdutos.adicionarProduto("Pão", 3518, 12.50, 1);
        listaProdutos.adicionarProduto("Ovo", 2561, 13.99, 1);
        listaProdutos.adicionarProduto("Tomate", 1590, 2.50, 5);
        listaProdutos.adicionarProduto("Frango", 2547, 18.99, 1);

        System.out.println();
        System.out.println("Imprimindo lista cheia: ");
        listaProdutos.verProdutos();

        System.out.println();
        listaProdutos.exibirProdutosPorNome();

        System.out.println();
        listaProdutos.exibirProdutosPorPreco();



    }
}
