package Ordenacao.Livraria;

import java.util.Objects;

public class LivroChave {

    //Atributos
    private double preco;
    private String link;

    //Construtor
    public LivroChave(double preco, String link){
        this.preco = preco;
        this.link = link;
    }

    //Métodos
        //Getter
    public double getPreco() {
        return preco;
    }
    public String getLink() {
        return link;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LivroChave that = (LivroChave) o;
        return Double.compare(preco, that.preco) == 0 && Objects.equals(link, that.link);
    }

    @Override
    public int hashCode() {
        return Objects.hash(preco, link);
    }

    @Override
    public String toString() {
        return link;
    }
}
