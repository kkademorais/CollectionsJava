package SetInterface.OperacoesBasicas.PalavrasUnicas;

import SetInterface.OperacoesBasicas.Convidados.ConjuntoConvidados;

import java.util.HashSet;
import java.util.List;

public class ConjuntoPalavrasUnicas {

        //Atributo -> conjunto palavras únicas
    private HashSet<String> ListaPalavras = new HashSet<>();

        //Construtor -> Setter -> Inicializa lista vazia
    public ConjuntoPalavrasUnicas(){
        this.ListaPalavras = new HashSet<>();
    }

        //Métodos

    //Adiciona palavra no conjunto
    public void adicionarPalavra(String palavra){
        ListaPalavras.add(palavra);
        System.out.printf("\nPalavra adicionada no conjunto: %s\n", palavra);
    }

    //Remove palavra do conjunto
    public void removerPalavra(String palavra){
        String palavraRemover = null;
        for(String p: ListaPalavras){
            if(p == palavra){
                palavraRemover = p;
            }
        }
        ListaPalavras.remove(palavra);
        System.out.printf("\nPalavra removida do conjunto: %s\n", palavra);
    }

    //Verifica se a palavra (parâmetro) está no conjunto
    public void verificarPalavra(String palavra){
        boolean verificado = false;
        for(String p: ListaPalavras){
            if(p.equalsIgnoreCase(palavra.replaceAll(" ", ""))){
                System.out.printf("\nPalavra '%s' presente no conjunto! \n", p);
                verificado = true;
                break;
            }
        }
        if(verificado == false){
            System.out.printf("\nPalavra procurada não está dentro do conjunto!\n");
        }
    }

    //Setter -> Exibir elementos da lista
    public void exibirPalavrasUnicas(){
        System.out.println("Exibindo todas as palavras únicas presentes no conjunto: ");
        for(String p: ListaPalavras){
            System.out.printf("\n%s", p);
        }
    }

}
