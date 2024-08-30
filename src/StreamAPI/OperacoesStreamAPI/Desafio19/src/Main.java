public class Main {
    public static void main(String[] args) {

        ListaNumeros listaNumeros = new ListaNumeros();

        System.out.println("Lista inicial: ");
        System.out.println(listaNumeros.getNumeros());
        System.out.println("Soma dos números divisíveis por 3 e 5: " + listaNumeros.somaDivisiveis());


    }
}
