package SetInterface.Ordenacao.CadastroProdutos;

import java.util.HashSet;

public class CadastroProdutos {

    //Atributos
    private HashSet<Produto> listaProdutos;

    //Construtor -> inicializa lista vazia
    public CadastroProdutos(){
        this.listaProdutos = new HashSet<>();
    }

    //Métodos

        //Adiciona produto novo na lista
    public void adicionarProduto(String nome, long codigo, double preco, int quantidade){
        Produto produtoAdd = new Produto(nome, codigo, preco, quantidade);
        listaProdutos.add(produtoAdd);
    }

        //Exibe produtos em ordem alfabética de nome
    public void exibirProdutosPorNome(){}

        //Exibe produtos em ordem crescente de preço
    public void exibirProdutosPorPreco(){}


        //Getter -> Exibe produtos da lista
    public void verProdutos(){
        double Valor = 0;
        System.out.println("Exibindo todos os produtos da lista: ");
        for(Produto p: listaProdutos){
            System.out.printf("Nome: %s", p.getNome());
            System.out.printf("Código: %d", p.getCodigo());
            System.out.printf("Preço: %.2f", p.getPreco());
            System.out.printf("Quantidade: %d", p.getQuantidade());
            Valor += (p.getPreco() * p.getQuantidade());
        }
        System.out.printf("Valor total da compra: R$%.2f", Valor);
    }

}
