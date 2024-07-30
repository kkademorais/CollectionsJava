package Ordenacao.Livraria;

import java.util.HashMap;
import java.util.TreeMap;

public class Livraria {

    //Atributos
    private HashMap<String, Livro> livraria;

    //Construtor
    public Livraria(){
        this.livraria = new HashMap<>();
    }

    //Métodos
        //Getter
    public void exibirLivrosOrdenadosPorPreco(){
        TreeMap<LivroChave, Livro> livrariaTree = new TreeMap<>(new ComparatorPorPreco());
        for(String link: livraria.keySet()){
            Livro livro = livraria.get(link);
            livrariaTree.put(new LivroChave(livro.getPreco(), link), livro);
        }

        System.out.println();
        System.out.println("Exibindo todos os livros: ");
        for(LivroChave chave: livrariaTree.keySet()){
            System.out.printf("Link do livro: %s\n", chave);
            System.out.printf("Título: %s\n", livrariaTree.get(chave).getTitulo());
            System.out.printf("Autor: %s\n", livrariaTree.get(chave).getAutor());
            System.out.printf("Preço: R$%.2f\n", livrariaTree.get(chave).getPreco());
            System.out.println();
        }
    }

    public void adicionarLivro(String link, String titulo, String autor, double preco){
        Livro livroAdd = new Livro(titulo, autor, preco);
        livraria.put(link, livroAdd);
        System.out.println();
        System.out.println("Livro adicionado com sucesso!");
        System.out.printf("Link do livro: %s\n", link);
        System.out.printf("Título: %s\n", titulo);
        System.out.printf("Autor: %s\n", autor);
        System.out.printf("Preço: R$%.2f\n", preco);
        System.out.println();
    }

        //Remove livro com base no título
    public void removerLivro(String titulo){
        System.out.println();
        for(String s: livraria.keySet()){
            if(livraria.get(s).getTitulo().equalsIgnoreCase(titulo)){
                System.out.println("Livro a ser removido: ");
                System.out.printf("Link do livro: %s\n", s);
                System.out.printf("Título: %s\n", livraria.get(s).getTitulo());
                System.out.printf("Autor: %s\n", livraria.get(s).getAutor());
                System.out.printf("Preço: R$%.2f\n", livraria.get(s).getPreco());
                livraria.remove(s);
                return;
            }
        }
        System.out.println("Livro não encontrado...");
    }

        //Retorna um map com todos os livros escritos pelo autor
    public void pesquisarLivrosPorAutor(String autor){
        System.out.println();
        TreeMap<String, Livro> livrosAutor = new TreeMap<>();
        for(String s: livraria.keySet()){
            if(livraria.get(s).getAutor().equalsIgnoreCase(autor)){
                System.out.println("Livro encontrado!");
                System.out.printf("Link do livro: %s\n", s);
                System.out.printf("Título: %s\n", livraria.get(s).getTitulo());
                System.out.printf("Autor: %s\n", livraria.get(s).getAutor());
                System.out.printf("Preço: R$%.2f\n", livraria.get(s).getPreco());
                livrosAutor.put(s, livraria.get(s));
                System.out.println();
            }
        }
        if(livrosAutor.isEmpty()){
            System.out.println("Não existe livros do seguinte autor: " + autor);
            return;
        }
        else{
            System.out.println();
            System.out.println("Todos os livros do(a) " + autor);
            for(String s: livrosAutor.keySet()){
                System.out.println();
                System.out.printf("Link do livro: %s\n", s);
                System.out.printf("Título: %s\n", livrosAutor.get(s).getTitulo());
                System.out.printf("Autor: %s\n", livrosAutor.get(s).getAutor());
                System.out.printf("Preço: R$%.2f\n", livrosAutor.get(s).getPreco());
            }
        }
    }

        //Retorna livro mais caro
    public void obterLivroMaisCaro(){
        double valorMaisCaro = 0;
        System.out.println();
        for(String s: livraria.keySet()){
            if(livraria.get(s).getPreco() > valorMaisCaro){
                valorMaisCaro = livraria.get(s).getPreco();
            }
        }
        for(String s: livraria.keySet()){
            if(livraria.get(s).getPreco() == valorMaisCaro){
                System.out.println("Livro mais caro da livraria: ");
                System.out.printf("Link do livro: %s\n", s);
                System.out.printf("Título: %s\n", livraria.get(s).getTitulo());
                System.out.printf("Autor: %s\n", livraria.get(s).getAutor());
                System.out.printf("Preço: R$%.2f\n", livraria.get(s).getPreco());
            }
        }
    }

        //Retorna livro mais barato
    public void obterLivroMaisBarato(){
        double valorMaisBarato = 1000;
        System.out.println();
        for(String s: livraria.keySet()){
            if(livraria.get(s).getPreco() < valorMaisBarato){
                valorMaisBarato = livraria.get(s).getPreco();
            }
        }
        for(String s: livraria.keySet()){
            if(livraria.get(s).getPreco() == valorMaisBarato){
                System.out.println("Livro mais barato da livraria: ");
                System.out.printf("Link do livro: %s\n", s);
                System.out.printf("Título: %s\n", livraria.get(s).getTitulo());
                System.out.printf("Autor: %s\n", livraria.get(s).getAutor());
                System.out.printf("Preço: R$%.2f\n", livraria.get(s).getPreco());
            }
        }
    }


}
