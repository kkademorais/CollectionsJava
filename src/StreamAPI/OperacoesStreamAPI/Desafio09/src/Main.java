public class Main {
    public static void main(String[] args) {

        ListaNumeros listaNumeros = new ListaNumeros();

        System.out.println("Lista inicial: ");
        System.out.println(listaNumeros.getNumeros());
        System.out.println("Lista só tem números distintos? ");
        System.out.println(listaNumeros.isUnique());


    }
}
