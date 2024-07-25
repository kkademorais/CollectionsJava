package Pesquisa.ContagemPalavras;

public class Main {
    public static void main(String[] args) {

        ContagemPalavras contador = new ContagemPalavras();

        System.out.println("Imprimindo contador inicialmente vazio...");
        contador.exibirPalavras();

        System.out.println();
        System.out.println("Inserindo palavras no contador...");
        contador.adicionarPalavra("Comer", 4);
        contador.adicionarPalavra("Música", 5);
        contador.adicionarPalavra("Kaike", 8);
        contador.adicionarPalavra("Faculdade", 1);
        contador.adicionarPalavra("Vasco", 2);

        System.out.println();
        System.out.println("Imprimindo contador atualizado...");
        contador.exibirPalavras();

        System.out.println();
        System.out.println("Encontrando palavra mais frequente...");
        contador.encontrarPalavraMaisFrequente();

        System.out.println();
        System.out.println("Removendo palavra mais frequente do contador...");
        contador.removerPalavra("kaike");

        System.out.println();
        System.out.println("Encontrando palavra mais frequente...");
        System.out.printf("A palavra mais frequente é %s", contador.encontrarPalavraMaisFrequente());
    }
}
