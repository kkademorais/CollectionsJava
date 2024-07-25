package OperacoesBasicas.AgendaContatos;


public class Main {
    public static void main(String[] args) {
        AgendaContatos listaContatos = new AgendaContatos();

        System.out.println("Imprimindo lista de contatos inicialmente vazia! ");
        listaContatos.exibirContatos();

        System.out.println();
        System.out.println("Adicionado contatos na agenda!");
        listaContatos.adicionarContato("Kaike", 220305);
        listaContatos.adicionarContato("Barreto", 200605);
        listaContatos.adicionarContato("Piovani", 180405);
        listaContatos.adicionarContato("Vimieiro", 260106);
        listaContatos.adicionarContato("Pistola", 161204);

        System.out.println();
        System.out.println("Exibindo lista de contatos atualizada! ");
        listaContatos.exibirContatos();

        System.out.println();
        System.out.println("Buscando por Piovani na agenda!");
        listaContatos.pesquisarPorNome("Piovani");

        System.out.println();
        System.out.println("Removendo Piovani da agenda!");
        listaContatos.removerContato("Piovani");

        System.out.println();
        System.out.println("Buscando por Piovani na agenda!");
        listaContatos.pesquisarPorNome("Piovani");






    }
}
