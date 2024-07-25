package Pesquisa.EstoqueProdutos;

import javax.lang.model.element.ModuleElement;
import java.util.HashMap;

public class EstoqueProdutos {

    //Atributos
    private HashMap<Long, Produto> estoqueProdutos;

    //Construtor
    public EstoqueProdutos(){
        this.estoqueProdutos = new HashMap<>();
    }

    //Métodos
        //Getter
    public void exibirProdutos(){
        System.out.println();
        System.out.println("Exibindo produtos registrados no estoque: ");
        for(Long l: estoqueProdutos.keySet()){
            System.out.printf("Código: %l\n", l);
            System.out.printf("Nome: %s\n", estoqueProdutos.get(l).getNome());
            System.out.printf("Quantidade: %d\n", estoqueProdutos.get(l).getQuantidade());
            System.out.printf("Preço unitário: %.2f\n", estoqueProdutos.get(l).getPreco());
        }
    }

        //Adicionar produto ao estoque
    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        Produto produtoAdd = new Produto(nome, quantidade, preco);
        estoqueProdutos.put(cod, produtoAdd);
        System.out.println();
        System.out.println("Produto adicionado com sucesso!");
        System.out.printf("Código: %l\n", cod);
        System.out.printf("Nome: %s\n", produtoAdd.getNome());
        System.out.printf("Quantidade: %d\n", produtoAdd.getQuantidade());
        System.out.printf("Preço unitário: %.2f\n", produtoAdd.getPreco());
    }

        
    public void calcularValorTotalEstoque(){}

    public void obterProdutoMaisCaro(){}

    public void obterProdutoMaisBarato(){}

    public void obterProdutoMaiorQuantidadeValorTotalNoEstoque(){}


}
