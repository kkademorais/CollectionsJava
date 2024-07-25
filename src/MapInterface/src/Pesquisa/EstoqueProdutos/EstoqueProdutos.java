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
            System.out.printf("Código: %d\n", l);
            System.out.printf("Nome: %s\n", estoqueProdutos.get(l).getNome());
            System.out.printf("Quantidade: %d\n", estoqueProdutos.get(l).getQuantidade());
            System.out.printf("Preço unitário: %.2f\n", estoqueProdutos.get(l).getPreco());
            System.out.println();
        }
    }

        //Adicionar produto ao estoque
    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        Produto produtoAdd = new Produto(nome, quantidade, preco);
        estoqueProdutos.put(cod, produtoAdd);
        System.out.println();
        System.out.println("Produto adicionado com sucesso!");
        System.out.printf("Código: %d\n", cod);
        System.out.printf("Nome: %s\n", produtoAdd.getNome());
        System.out.printf("Quantidade: %d\n", produtoAdd.getQuantidade());
        System.out.printf("Preço unitário: %.2f\n", produtoAdd.getPreco());
    }

        //Calcula o valor total do estoque (preco * quantidade)
    public void calcularValorTotalEstoque(){
        System.out.println();
        System.out.println("Calculando o valor total presente no estoque");
        double valorTotal = 0;
        for(Long l: estoqueProdutos.keySet()){
            valorTotal += estoqueProdutos.get(l).getPreco() * estoqueProdutos.get(l).getQuantidade();
        }
        System.out.printf("O valor total do estoque é de R$%.2f\n", valorTotal);
    }

        //Retorna produto com maior preço
    public HashMap<Long, Produto> obterProdutoMaisCaro(){
        System.out.println();
        double precoMaisCaro = 0;
        HashMap<Long, Produto> produtoMaisCaro = new HashMap<>();
        for(Long l: estoqueProdutos.keySet()){
            if(estoqueProdutos.get(l).getPreco() > precoMaisCaro){
                precoMaisCaro = estoqueProdutos.get(l).getPreco();
            }
        }
        for(Long l: estoqueProdutos.keySet()){
            if(precoMaisCaro == estoqueProdutos.get(l).getPreco()){
                System.out.println("Produto mais caro do estoque encontrado!!");
                System.out.printf("Código: %d\n", l);
                System.out.printf("Nome: %s\n", estoqueProdutos.get(l).getNome());
                System.out.printf("Quantidade: %d\n", estoqueProdutos.get(l).getQuantidade());
                System.out.printf("Preço unitário: %.2f\n", estoqueProdutos.get(l).getPreco());
                System.out.println();
                Produto produtoAdd = new Produto(estoqueProdutos.get(l).getNome(), estoqueProdutos.get(l).getQuantidade(), estoqueProdutos.get(l).getPreco());
                produtoMaisCaro.put(l, produtoAdd);
            }
        }
        return produtoMaisCaro;
    }

    public HashMap<Long, Produto> obterProdutoMaisBarato(){
        System.out.println();
        double precoMaisBarato = 9999;
        HashMap<Long, Produto> produtoMaisBarato = new HashMap<>();
        for(Long l: estoqueProdutos.keySet()){
            if(estoqueProdutos.get(l).getPreco() < precoMaisBarato){
                precoMaisBarato = estoqueProdutos.get(l).getPreco();
            }
        }
        for(Long l: estoqueProdutos.keySet()){
            if(precoMaisBarato == estoqueProdutos.get(l).getPreco()){
                System.out.println("Produto mais barato do estoque encontrado!!");
                System.out.printf("Código: %d\n", l);
                System.out.printf("Nome: %s\n", estoqueProdutos.get(l).getNome());
                System.out.printf("Quantidade: %d\n", estoqueProdutos.get(l).getQuantidade());
                System.out.printf("Preço unitário: %.2f\n", estoqueProdutos.get(l).getPreco());
                System.out.println();
                Produto produtoAdd = new Produto(estoqueProdutos.get(l).getNome(), estoqueProdutos.get(l).getQuantidade(), estoqueProdutos.get(l).getPreco());
                produtoMaisBarato.put(l, produtoAdd);
            }
        }
        return produtoMaisBarato;
    }

    public HashMap<Long, Produto> obterProdutoMaiorQuantidade(){
        System.out.println();
        double maiorQuantidade = 0;
        HashMap<Long, Produto> produtoMaiorQuantidade = new HashMap<>();
        for(Long l: estoqueProdutos.keySet()){
            if(estoqueProdutos.get(l).getQuantidade() > maiorQuantidade){
                maiorQuantidade = estoqueProdutos.get(l).getQuantidade();
            }
        }
        for(Long l: estoqueProdutos.keySet()){
            if(maiorQuantidade == estoqueProdutos.get(l).getQuantidade()){
                System.out.println("Produto em maior quantidade no estoque encontrado!!");
                System.out.printf("Código: %d\n", l);
                System.out.printf("Nome: %s\n", estoqueProdutos.get(l).getNome());
                System.out.printf("Quantidade: %d\n", estoqueProdutos.get(l).getQuantidade());
                System.out.printf("Preço unitário: %.2f\n", estoqueProdutos.get(l).getPreco());
                System.out.println();
                Produto produtoAdd = new Produto(estoqueProdutos.get(l).getNome(), estoqueProdutos.get(l).getQuantidade(), estoqueProdutos.get(l).getPreco());
                produtoMaiorQuantidade.put(l, produtoAdd);
            }
        }
        return produtoMaiorQuantidade;
    }

    @Override
    public String toString() {
        return estoqueProdutos.values().toString();
    }
}
