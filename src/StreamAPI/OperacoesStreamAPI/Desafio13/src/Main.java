public class Main {
    public static void main(String[] args) {

        ListaNumeros listaNumeros = new ListaNumeros();

        System.out.println("Lista inicial: ");
        System.out.println(listaNumeros.getNumeros());
        System.out.println("Lista com números entre 5 e 10");
        System.out.println(listaNumeros.numerosIntervalo());


    }
}
