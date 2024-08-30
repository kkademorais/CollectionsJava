import java.util.List;
import java.util.Arrays;

public class ListaNumeros {

    private final List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public List<Integer> getNumeros() {
        return numeros;
    }

    //Agrupar os números ímpares múltiplos de 3 ou 5
    public List<Integer> agruparImparesMultiplos(){

        List<Integer>listMultiplos = numeros.stream()
                .filter(n -> n % 2 == 1)
                .filter(n -> (n % 3 == 0) || (n % 5 == 0))
                .toList();

        return listMultiplos;

    }

}
