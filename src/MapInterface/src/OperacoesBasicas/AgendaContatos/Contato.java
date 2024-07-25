package OperacoesBasicas.AgendaContatos;

public class Contato {

    //Atributos
    private String nome;
    private int telefone;

    //Construtor -> Setter
    public Contato(String nome, int telefone){
        this.nome = nome;
        this.telefone = telefone;
    }

    //Getters
    public String getNome() {
        return nome;
    }
    public int getTelefone() {
        return telefone;
    }
}
