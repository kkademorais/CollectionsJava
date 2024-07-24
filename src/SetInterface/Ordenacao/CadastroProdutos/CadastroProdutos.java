package SetInterface.Ordenacao.CadastroProdutos;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

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

        //Exibe produtos em ordem alfabética de nome -> Comparable
    public void exibirProdutosPorNome(){
        TreeSet<Produto> produtosPorNome = new TreeSet<>(listaProdutos);
        System.out.println("Exibindo a lista de produtos organizados por ordem alfabética: ");
        for(Produto p: produtosPorNome){
            System.out.printf("%s\n", p);
        }
    }

        //Exibe produtos em ordem crescente de preço -> Comparator
    public void exibirProdutosPorPreco(){
        TreeSet<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(listaProdutos);
        System.out.println("Exibindo a lista de produtos organizados por preço: ");
        for(Produto p: produtosPorPreco){
            System.out.printf("%s\n", p);
        }
    }


        //Getter -> Exibe produtos da lista
    public void verProdutos(){
        double Valor = 0;
        System.out.println("Exibindo todos os produtos da lista: ");
        for(Produto p: listaProdutos){
            System.out.printf("Nome: %s\n", p.getNome());
            System.out.printf("Código: %d\n", p.getCodigo());
            System.out.printf("Preço: %.2f\n", p.getPreco());
            System.out.printf("Quantidade: %d\n", p.getQuantidade());
            Valor += (p.getPreco() * p.getQuantidade());
            System.out.println();
        }
        System.out.printf("Valor total da compra: R$%.2f\n", Valor);
    }

}
