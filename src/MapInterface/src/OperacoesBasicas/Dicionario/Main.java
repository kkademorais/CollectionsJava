package OperacoesBasicas.Dicionario;

public class Main {
    public static void main(String[] args) {

        Dicionario dicionario = new Dicionario();

        System.out.println("Imprimindo dicionário inicialmente vazio!");
        dicionario.exibirPalavras();

        System.out.println();
        System.out.println("Inserindo palavras ao dicionário!");
        dicionario.adicionarPalavra("underdog", "quem vem de baixo pro topo");
        dicionario.adicionarPalavra("ballin", "amassando, jogando muito");
        dicionario.adicionarPalavra("Vasco", "melhor time do Brasil");
        dicionario.adicionarPalavra("music", "um dos maiores prazeres da vida");
        dicionario.adicionarPalavra("fubazeiro", "pessoa que passa vergonha");

        System.out.println();
        System.out.println("Imprimindo dicionário atualizado!");
        dicionario.exibirPalavras();

        System.out.println();
        System.out.println("Buscando pela definição de Vasco!");
        dicionario.pesquisarPorPalavra("vasco");

        System.out.println();
        System.out.println("Removendo 'Vasco' do dicionário!");
        dicionario.removerPalavra("vasco");

        System.out.println();
        System.out.println("Buscando pela definição de Vasco!");
        dicionario.pesquisarPorPalavra("vasco");


    }
}
