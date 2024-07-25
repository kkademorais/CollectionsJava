package OperacoesBasicas.AgendaContatos;

import java.util.HashMap;
import java.util.List;

public class AgendaContatos {

    //Atributos
    private HashMap<String, Integer> ListaContatos;

    //Construtor -> inicializa map vazio
    public AgendaContatos(){
        this.ListaContatos = new HashMap<>();
    }

    //Métodos
        //Getter
    public void exibirContatos(){
        System.out.println();
        System.out.println("Exibindo lista de contatos: ");
        for(String s: ListaContatos.keySet()){
            System.out.printf("Nome: %s\n", s);
            System.out.printf("Telefone: %d\n", ListaContatos.get(s));
        }
    }

    public void adicionarContato(String nome, int telefone){
        Contato contatoAdd = new Contato(nome, telefone);
        ListaContatos.put(contatoAdd.getNome(), contatoAdd.getTelefone());
        System.out.println("Contato adicionado! ");
        System.out.printf("Nome: %s\n", contatoAdd.getNome());
        System.out.printf("Telefone: %d\n", contatoAdd.getTelefone());
    }

    public void removerContato(String nome){
        System.out.println();
        for(String s: ListaContatos.keySet()){
            if(s.equalsIgnoreCase(nome)){
                ListaContatos.remove(nome);
                System.out.println("Contato removido! ");
                System.out.printf("Nome removido: %s\n", s);
                System.out.printf("Telefone removido: %d\n", ListaContatos.get(s));
            }
        }
    }

    public void pesquisarPorNome(String nome){
        System.out.println();
        System.out.println("Pesquisando por contato...");
        for(String s: ListaContatos.keySet()){
            if(s.equalsIgnoreCase(nome)){
                System.out.println();
                System.out.println("Contato encontrado!");
                System.out.printf("Nome: %s\n", s);
                System.out.printf("Telefone: %d\n", ListaContatos.get(s));
                return;
            }
        }
        System.out.println("Contato não encontrado na agenda...");
    }





}
