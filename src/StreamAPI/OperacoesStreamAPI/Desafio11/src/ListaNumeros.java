import java.util.List;
import java.util.Arrays;

public class ListaNumeros {

    private final List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public List<Integer> getNumeros() {
        return numeros;
    }

    //Retornar a soma dos quadrados de todos os números da lista
    public int somaQuadrados(){

        int somaQuadrados = numeros.stream()
                .mapToInt(n -> n*n)
                .sum();

        return somaQuadrados;
    }

}
