package Ordenacao.Livraria;

public class Livro {

    //Atributos
    private String titulo;
    private String autor;
    private double preco;

    //Construtor
    public Livro(String titulo, String autor, double preco){
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    //Métodos
        //Getter
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public double getPreco() {
        return preco;
    }
}
