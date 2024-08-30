import java.util.List;
import java.util.Arrays;


public class ListaNumeros {

    private final List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public List<Integer> getNumeros() {
        return numeros;
    }

    //Somar todos os números da lista
    public int somarLista(){

        int somaLista = numeros.stream()
                .mapToInt(n -> n)
                .sum();

        return somaLista;
    }

}
