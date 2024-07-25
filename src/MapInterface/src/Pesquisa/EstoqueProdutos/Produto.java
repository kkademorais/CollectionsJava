package Pesquisa.EstoqueProdutos;

public class Produto {

    //Atributos
    private String nome;
    private int quantidade;
    private double preco;

    //Construtor
    public Produto(String nome, int quantidade, double preco){
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    //Getters
    public String getNome() {
        return nome;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public double getPreco() {
        return preco;
    }
}
