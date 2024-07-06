package ListInterface.OperacoesBasicas.CarrinhoCompras;

public class Main {
    public static void main(String[] args) {
        CarrinhoDeCompras Carrinho = new CarrinhoDeCompras();

        System.out.println("Verificando carrinho vazio: ");
        Carrinho.exibirItens();

        Carrinho.adicionarItem("Leite", 4.5, 2);
        Carrinho.adicionarItem("Sucrilhos", 13.75, 1);
        Carrinho.adicionarItem("Corona", 6.25, 5);
        Carrinho.adicionarItem("Coca", 8, 3);

        System.out.println();
        System.out.println("Exibindo carrinho atual: ");
        Carrinho.exibirItens();

        Carrinho.removerItem("coca");

        System.out.println();
        System.out.println("Exibindo carrinho após exclusão do item desejado: ");

        Carrinho.exibirItens();

        System.out.println();
        System.out.println("Prosseguindo para o pagamento");
        System.out.printf("Valor total da compra: %.2f\n", Carrinho.calcularValorTotal());





    }
}
