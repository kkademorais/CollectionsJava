package SetInterface.OperacoesBasicas.Convidados;

public class Main {
    public static void main(String[] args) {

        ConjuntoConvidados listaConvidados = new ConjuntoConvidados();

        System.out.println("Exibindo lista de convidados inicialmente vazia!");
        listaConvidados.exibirConvidados();

        System.out.println();
        System.out.println("Adicionando os convidados de honra!!");
        listaConvidados.adicionarConvidado("Barreto", 20);
        listaConvidados.adicionarConvidado("Vimieiro", 26);
        listaConvidados.adicionarConvidado("Pistola", 15);
        listaConvidados.adicionarConvidado("Piovani", 16);
        listaConvidados.adicionarConvidado("Cubano", 8);

        System.out.println();
        System.out.println("Exibindo lista atual!");
        listaConvidados.exibirConvidados();

        System.out.println();
        System.out.println("Convidado de código 8 não poderá comparecer. Favor removê-lo");
        listaConvidados.removerConvidadoPorCodigoConvite(8);
        System.out.println();

        System.out.println("Exibindo lista atual!");
        listaConvidados.exibirConvidados();

        System.out.println();
        System.out.println("Contar número de convidados na lista atualizada!");
        listaConvidados.contarConvidados();
        System.out.println();

    }
}
