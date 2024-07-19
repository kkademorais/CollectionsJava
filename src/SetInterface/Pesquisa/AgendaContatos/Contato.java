package SetInterface.Pesquisa.AgendaContatos;

public class Contato {

    //Atributos
    private String nome;
    private int numeroTelefone;

    //Construtor -> Setter
    public Contato(String nome, int numeroTelefone){
        this.nome = nome;
        this.numeroTelefone = numeroTelefone;
    }

    //Métodos
        //Getter
    public String getNome() {
        return nome;
    }
    public int getNumeroTelefone() {
        return numeroTelefone;
    }

        //Setter
    public void setNumeroTelefone(int numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }
}
