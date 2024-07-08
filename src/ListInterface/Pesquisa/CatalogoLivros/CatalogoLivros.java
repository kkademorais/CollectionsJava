package ListInterface.Pesquisa.CatalogoLivros;
import java.util.ArrayList;

public class CatalogoLivros {

    //Atributo -> Lista de objetos
    public ArrayList<Livro> CatalogoLivros;

    //Construtor -> inicializa lista vazia
    public CatalogoLivros(){
        this.CatalogoLivros = new ArrayList<>();
    }

        //Adiciona um objeto Livro para a lista CatalogoLivros
    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        Livro livro = new Livro(titulo, autor, anoPublicacao);
        CatalogoLivros.add(livro);
    }

        //Pesquisa livros por autor -> Retorna nova lista com livros encontrados
    public ArrayList<Livro> pesquisarPorAutor(String autor){
        //Instanciar nova lista -> Retornar essa lista
        ArrayList<Livro> livrosAutor = new ArrayList<>();
        for(Livro livros: CatalogoLivros){
            if(livros.getAutor().replaceAll(" ", "").equalsIgnoreCase(autor)){
                livrosAutor.add(livros);
            }
        }
        return livrosAutor;
    }

        //Pesquisa livros com ano entre os anos passados como parâmetros e retornar lista com livros encontrados
    public ArrayList<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        //Instanciar nova lista -> Retornar essa lista
        ArrayList<Livro> livrosAnos = new ArrayList<>();
        for(Livro livros: CatalogoLivros){
            if(livros.getAnoPublicacao() >= anoInicial && livros.getAnoPublicacao() <= anoFinal){
                livrosAnos.add(livros);
            }
        }
        return livrosAnos;
    }

        //Pesquisa livros por titulo e retornar o primeiro livro encontrado
    public Livro pesquisarPorTitulo(String titulo){
        //ForEach
        Livro livroEncontrado = null;
        for(Livro livros: CatalogoLivros){
            if(livros.getTitulo().replaceAll(" ", "").equalsIgnoreCase(titulo)){
                livroEncontrado = livros;
                break;
            }
        }
        return livroEncontrado;
    }

}
