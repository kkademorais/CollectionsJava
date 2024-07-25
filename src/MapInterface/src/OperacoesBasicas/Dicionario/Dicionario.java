package OperacoesBasicas.Dicionario;

import java.util.HashMap;

public class Dicionario {

    //Atributos
    private HashMap<String, String> listaPalavras;

    //Construtor
    public Dicionario(){
        this.listaPalavras = new HashMap<>();
    }

    //Métodos
        //Getter
    public void exibirPalavras(){
        System.out.println("Exibindo palavras registradas no dicionário: ");
        for(String s: listaPalavras.keySet()){
            System.out.printf("Palavra: %s\n", s);
            System.out.printf("Definição: %s\n", listaPalavras.get(s));
            System.out.println();
        }
    }

    public void adicionarPalavra(String palavra, String definicao){
        System.out.println();
        listaPalavras.put(palavra, definicao);
        System.out.println("Palavra adicionada no dicionário!");
        System.out.printf("Palavra: %s\n", palavra);
        System.out.printf("Definição: %s\n", definicao);
    }

    public void removerPalavra(String palavra){
        System.out.println();
        for(String s: listaPalavras.keySet()){
            if(s.equalsIgnoreCase(palavra)){
                listaPalavras.remove(s);
                System.out.println("Palavra removida com sucesso!");
                System.out.printf("Palavra: %s\n", s);
                System.out.printf("Definição: %s\n", listaPalavras.get(s));
                return;
            }
        }
        System.out.println("Não foi possível remover a palavra desejada...");
    }

    public void pesquisarPorPalavra(String palavra){
        System.out.println();
        for(String s: listaPalavras.keySet()){
            if(s.equalsIgnoreCase(palavra)){
                System.out.println();
                System.out.println("Palavra encontrada! ");
                System.out.printf("Palavra: %s\n", s);
                System.out.printf("Definição: %s\n", listaPalavras.get(s));
                return;
            }
        }
        System.out.println("Palavra não encontrada...");
    }
}
