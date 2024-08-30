public class Main {
    public static void main(String[] args) {

        ListaNumeros listaNumeros = new ListaNumeros();

        System.out.println("Lista inicial: ");
        System.out.println(listaNumeros.getNumeros());
        System.out.println("Lista dos ímpares múltiplos de 3 ou 5: ");
        System.out.println(listaNumeros.agruparImparesMultiplos());

    }
}
