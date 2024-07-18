package SetInterface.OperacoesBasicas.Convidados;

import java.util.HashSet;

public class ConjuntoConvidados {

    //Atributos
    private HashSet<Convidado> SetConvidados;

    //Construtor -> Setter
    public ConjuntoConvidados(){
        this.SetConvidados = new HashSet<>();
    }

    //Métodos

        //Adiciona convidado no Set
    public void adicionarConvidado(String nome, int codigoConvite){}

        //Busca convidado com código do convite e remove do Set
    public void removerConvidadoPorCodigoConvite(int codigoConvite){}

        //Retorna valor do número total de convidados contidos no Set
    public int contarConvidados(){}

        //Getter -> mostra SetConvidados
    public void exibirConvidados(){
        for(Convidado c: SetConvidados){
            System.out.println("Exibindo todos os convidados confirmados: ");
            System.out.printf("\nNome do convidado: %s\n", c.getNome());
            System.out.printf("\nCódigo do convidado: %d\n", c.getCodigoConvite());
        }
    }

}
