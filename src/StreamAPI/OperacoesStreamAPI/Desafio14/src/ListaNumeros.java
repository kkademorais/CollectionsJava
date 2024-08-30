import java.util.List;
import java.util.Arrays;

public class ListaNumeros {

    private final List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public List<Integer> getNumeros() {
        return numeros;
    }

    //Encontrar maior número primo
    public int maiorPrimo(){

        int listMaiorPrimo = numeros.stream()
                .filter(n -> (n % n == 0) && (n % 1 == 0))



                .sorted((a, b) -> b - a)
                .toList()
                .getFirst();

        return listMaiorPrimo;
    }

}
