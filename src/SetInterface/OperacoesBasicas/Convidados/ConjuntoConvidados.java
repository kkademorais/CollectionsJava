package SetInterface.OperacoesBasicas.Convidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    //Atributos
    private HashSet<Convidado> SetConvidados;

    //Construtor -> Setter
    public ConjuntoConvidados(){
        this.SetConvidados = new HashSet<>();
    }

    //Métodos

        //Adiciona convidado no Set
    public void adicionarConvidado(String nome, int codigoConvite){
        Convidado convidado = new Convidado(nome, codigoConvite);
        SetConvidados.add(convidado);
        System.out.printf("\nConvidado adicionado!");
        System.out.printf("\nNome do convidado: %s", convidado.getNome());
        System.out.printf("\nCódigo do convidado: %d\n", convidado.getCodigoConvite());
    }

        //Busca convidado com código do convite e remove do Set
    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoRemover = null;
        for(Convidado c: SetConvidados){
            if(c.getCodigoConvite() == codigoConvite){
                convidadoRemover = c;
            }
        }
        SetConvidados.remove(convidadoRemover);
        System.out.printf("\nConvidado removido!");
        System.out.printf("\nNome do convidado: %s", convidadoRemover.getNome());
        System.out.printf("\nCódigo do convidado: %d\n", convidadoRemover.getCodigoConvite());
    }

        //Retorna valor do número total de convidados contidos no Set
    public void contarConvidados(){
        System.out.printf("\nO número total de convidados confirmados é igual a %d \n", SetConvidados.size());
    }

        //Getter -> mostra SetConvidados
    public void exibirConvidados(){
        System.out.println("\nExibindo todos os convidados confirmados: ");
        for(Convidado c: SetConvidados){
            System.out.printf("\nNome do convidado: %s", c.getNome());
            System.out.printf("\nCódigo do convidado: %d\n", c.getCodigoConvite());
        }
    }

}
