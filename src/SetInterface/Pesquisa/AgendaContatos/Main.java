package SetInterface.Pesquisa.AgendaContatos;

public class Main {
    public static void main(String[] args) {

        AgendaContatos ListaContatos = new AgendaContatos();

        System.out.println("Imprimindo lista inicialmente vazia!");
        ListaContatos.exibirContatos();
        System.out.println();

        System.out.println();
        System.out.println("Adicionando contatos na lista!");
        ListaContatos.adicionarContato("Kaike", 22);
        ListaContatos.adicionarContato("Barreto", 20);
        ListaContatos.adicionarContato("Vimieiro", 26);
        ListaContatos.adicionarContato("Pistola", 15);
        ListaContatos.adicionarContato("Piovani", 16);
        System.out.println();

        System.out.println();
        System.out.println("Imprimindo lista atualizada!");
        ListaContatos.exibirContatos();
        System.out.println();

        System.out.println();
        System.out.println("Procurando contatos dos mlk da Mec 014!");
        ListaContatos.pesquisarPorNome("Barreto");
        ListaContatos.pesquisarPorNome("PISTOLA");
        System.out.println();

        System.out.println();
        System.out.println("Atualizando número de contato do Vimieiro");
        ListaContatos.atualizarNumeroContato("Vimieiro", 27);
        System.out.println();

        System.out.println();
        System.out.println("Imprimindo lista atualizada!");
        ListaContatos.exibirContatos();
        System.out.println();

    }
}
