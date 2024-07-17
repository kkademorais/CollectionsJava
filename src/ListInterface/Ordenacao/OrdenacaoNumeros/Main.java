package ListInterface.Ordenacao.OrdenacaoNumeros;

public class Main {
    public static void main(String[] args) {

        OrdenacaoNumeros ListaNumeros = new OrdenacaoNumeros();

        System.out.println("Mostrando lista vazia inicialmente: ");
        ListaNumeros.mostrarLista();
        System.out.println();

        System.out.println("Preenchendo valores dentro da lista: ");
        ListaNumeros.adicionarNumero(25);
        ListaNumeros.adicionarNumero(43);
        ListaNumeros.adicionarNumero(7);
        ListaNumeros.adicionarNumero(94);

        System.out.println();
        System.out.println("Printando lista atual: ");
        ListaNumeros.mostrarLista();
        System.out.println();
        System.out.println("Ordenando lista ascendente: ");
        ListaNumeros.ordenarAscendente();
        System.out.println();
        System.out.println("Ordenando lista descendente: ");
        ListaNumeros.ordenarDescendente();


    }
}
