import java.util.List;
import java.util.Arrays;

public class ListaNumeros {

    private final List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public List<Integer> getNumeros() {
        return numeros;
    }

    //Filtrar números dentro do intervalo entre 5 e 10 (n > 5 && n < 10)
    public List<Integer> numerosIntervalo(){

        List<Integer> listIntervalo = numeros.stream()
                .filter(n -> (n > 5) && (n < 10))
                .toList();

        return listIntervalo;

    }


}
