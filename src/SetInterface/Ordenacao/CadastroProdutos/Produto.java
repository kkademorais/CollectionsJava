package SetInterface.Ordenacao.CadastroProdutos;

public class Produto implements Comparable<Produto>{

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
        //Compareto
    @Override
    public int compareTo(Produto p) {
        return nome.compareToIgnoreCase(p.getNome());
    }

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

    @Override
    public String toString() {
        return '\n' +
                "Produto = " +
                nome +
                '\n' +
                "Código do produto = " +
                codigo +
                '\n' +
                "Preço (R$) = " +
                preco +
                '\n' +
                "Quantidade = " +
                quantidade;
    }
}
