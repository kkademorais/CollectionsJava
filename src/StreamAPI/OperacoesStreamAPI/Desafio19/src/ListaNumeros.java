import java.util.List;
import java.util.Arrays;

public class ListaNumeros {

    private final List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,15, 30, 90,  5, 4, 3);

    public List<Integer> getNumeros() {
        return numeros;
    }

    //Retornar soma dos números divisíveis por 3 e 5
    public int somaDivisiveis(){

        int listSoma = numeros.stream()
                .filter(n -> (n % 3 == 0) && (n % 5 == 0))
                .mapToInt(n -> n)
                .sum();

        return listSoma;
    }

}
