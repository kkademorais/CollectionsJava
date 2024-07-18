package SetInterface.OperacoesBasicas.Convidados;

public class Convidado {

    //Atributos
    private String nome;
    private int codigoConvite;

    //Construtor -> Setter
    public Convidado(String nome, int codigoConvite){
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

    //Métodos -> Getter
    public String getNome() {
        return nome;
    }
    public int getCodigoConvite() {
        return codigoConvite;
    }
}
