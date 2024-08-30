public class Main {
    public static void main(String[] args) {

        ListaNumeros listaNumeros = new ListaNumeros();

        System.out.println("Lista inicial: ");
        System.out.println(listaNumeros.getNumeros());
        System.out.println("Soma de todos os números maiores que 5 = " + listaNumeros.mediaMaioresCinco());


    }
}
