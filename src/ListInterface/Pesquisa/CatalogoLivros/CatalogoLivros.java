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

    }

        //Pesquisa livros por autor -> Retorna nova lista com livros encontrados
    public void pesquisarPorAutor(String autor){
        //Instanciar nova lista -> Retornar essa lista
    }

        //Pesquisa livros com ano entre os anos passados como parâmetros e retornar lista com livros encontrados
    public void pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        //Instanciar nova lista -> Retornar essa lista
    }

        //Pesquisa livros por titulo e retornar o primeiro livro encontrado
    public void pesquisarPorTitulo(String titulo){
        //ForEach
    }


}
