public class Main {
    public static void main(String[] args) {

        ListaNumeros listaNumeros = new ListaNumeros();

        System.out.println("Lista inicial: ");
        System.out.println(listaNumeros.getNumeros());
        System.out.println("Lista com todos os números primos: ");
        System.out.println(listaNumeros.numerosPrimos());

    }
}
