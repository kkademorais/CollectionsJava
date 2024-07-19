package SetInterface.Ordenacao.CadastroProdutos;

public class Produto {

    //Atributos
    private String nome;
    private long codigo;
    private double preco;
    private int quantidade;

    //Construtor -> Setter
    public Produto(String nome, long codigo, double preco, int quantidade){
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    //Métodos
        //Getter
    public String getNome() {
        return nome;
    }
    public long getCodigo() {
        return codigo;
    }
    public double getPreco() {
        return preco;
    }
    public int getQuantidade() {
        return quantidade;
    }
}
