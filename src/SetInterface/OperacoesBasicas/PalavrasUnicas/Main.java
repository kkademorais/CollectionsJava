package SetInterface.OperacoesBasicas.PalavrasUnicas;

public class Main {
    public static void main(String[] args) {

        ConjuntoPalavrasUnicas listaPalavras = new ConjuntoPalavrasUnicas();

        System.out.println("Exibindo lista vazia inicialmente! ");
        listaPalavras.exibirPalavrasUnicas();

        System.out.println();
        System.out.println("Adicionando palavras no conjunto!");
        listaPalavras.adicionarPalavra("Trap");
        listaPalavras.adicionarPalavra("Coca");
        listaPalavras.adicionarPalavra("Vasco");
        listaPalavras.adicionarPalavra("Basquete");
        listaPalavras.adicionarPalavra("Família");
        listaPalavras.adicionarPalavra("Família");
        System.out.println();

        System.out.println();
        System.out.println("Exibindo lista atual: ");
        listaPalavras.exibirPalavrasUnicas();
        System.out.println();

        System.out.println();
        System.out.println("Verificando se a palavra 'Vasco' está dentro da lista de coisas que mais gosto!");
        listaPalavras.verificarPalavra("Vasco");
        System.out.println();

        System.out.println();
        System.out.println("Removendo 'Coca' da lista de palavras: ");
        listaPalavras.removerPalavra("Coca");
        System.out.println();

        System.out.println();
        System.out.println("Verificando se 'Coca' ainda está dentro da lista: ");
        listaPalavras.verificarPalavra("Coca");

        System.out.println();
        System.out.println("Exibindo lista atual: ");
        listaPalavras.exibirPalavrasUnicas();


    }
}
