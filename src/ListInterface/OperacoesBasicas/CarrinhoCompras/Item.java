package ListInterface.OperacoesBasicas.CarrinhoCompras;

public class Item {

        //Atributos
    private String nome;
    private double preco;
    private int quantidade;
    private float valorTotal;

        //Construtor -> Instancia os atributos do objeto instanciado
    public Item(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

        //Getters
    public String getNome(){
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public double getValorTotal() {
        return preco * quantidade;
    }
}
