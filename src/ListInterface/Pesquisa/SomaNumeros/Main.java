package ListInterface.Pesquisa.SomaNumeros;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        SomaNumeros ListaNumeros = new SomaNumeros();

        System.out.println("Primeiramente verificando lista vazia: ");
        System.out.println("Exibindo lista vazia: ");
        ListaNumeros.exibirNumeros();

        System.out.printf("\n\n");

        System.out.println("Adicionando os números da sorte na lista");
        ListaNumeros.adicionarNumero(22);
        ListaNumeros.adicionarNumero(19);
        ListaNumeros.adicionarNumero(5);
        ListaNumeros.adicionarNumero(20);
        ListaNumeros.adicionarNumero(27);

        System.out.println("Exibindo lista premiada:");
        ListaNumeros.exibirNumeros();
        System.out.printf("\n\n");

        System.out.println("Calculando a soma de todos esses números contidos na lista: ");
        System.out.printf("A soma de todos os números da lista é igual a %d\n", ListaNumeros.calcularSoma());

        System.out.println();

        System.out.println("Encontrando maior valor dentro da lista: ");
        System.out.printf("O maior valor dentre todos da lista é o %d\n", ListaNumeros.encontrarMaiorNumero());

        System.out.println();

        System.out.println("Encontrando menor valor dentro da lista: ");
        System.out.printf("O menor valor dentre todos da lista é o %d\n", ListaNumeros.encontrarMenorNumero());


    }
}
