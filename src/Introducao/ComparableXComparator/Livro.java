package Introducao.ComparableXComparator;

import java.lang.Comparable;
import java.util.Comparator;

class Livro implements Comparable<Livro>{

    //Atributos -> private -> precisamos de Getters
    private String titulo;
    private String autor;
    private int ano;

    //Como já temos o Construtor com parâmetros -> não precisamos de Setters

    //Construtor
    public Livro(String titulo, String autor, int ano){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    //Getters
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public int getAno() {
        return ano;
    }

    //Comparable necessita da implementação do compareTo() -> Comparar por ano
    public int compareTo(Livro l){
        return titulo.compareTo(l.titulo);
    }


    //public int compareTo(Livro l) {
    //    return Integer.compare(this.ano, l.ano);
    //}
}

//Comparar livros por autor
class CompararAutor implements Comparator<Livro>{

    public int compare(Livro l1, Livro l2) {
        return l1.getAutor().compareTo(l2.getAutor());
    }
}



//Comparar livros por ano
class CompararAno implements Comparator<Livro>{

    public int compare(Livro l1, Livro l2) {
        if(l1.getAno() > l2.getAno()){
            return 1;
        }
        if(l1.getAno() < l2.getAno()){
            return -1;
        }
        else
            return 0;
    }
}

//Comparar livros por Ano->Autor->Título
class compararAnoAutorTitulo implements Comparator<Livro>{

    public int compare(Livro l1, Livro l2) {
        int ano = Integer.compare(l1.getAno(), l2.getAno());
        if(ano != 0){
            return ano;
        }
        int autor = l1.getAutor().compareTo(l2.getAutor());
        if(autor !=0){
            return autor;
        }
        return l1.getTitulo().compareTo(l2.getTitulo());

    }
}