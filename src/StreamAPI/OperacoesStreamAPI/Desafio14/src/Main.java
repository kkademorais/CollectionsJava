public class Main {
    public static void main(String[] args) {

        ListaNumeros listaNumeros = new ListaNumeros();

        System.out.println("Lista inicial: ");
        System.out.println(listaNumeros.getNumeros());
        System.out.println("Maior número primo da lista = " + listaNumeros.maiorPrimo());

    }
}
