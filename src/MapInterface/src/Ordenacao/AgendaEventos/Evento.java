package Ordenacao.AgendaEventos;

public class Evento {

    //Atributos
    private String nome;
    private String atracao;

    //Construtor
    public Evento(String nome, String atracao){
        this.nome = nome;
        this.atracao = atracao;
    }

    //Métodos
        //Getter
    public String getNome() {
        return nome;
    }
    public String getAtracao() {
        return atracao;
    }
}
