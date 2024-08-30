import java.util.List;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class ListaNumeros {

    private final List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public List<Integer> getNumeros() {
        return numeros;
    }

    //Verificar se todos os valores da lista são positivos (>0)
    public boolean isPositive(){
        Stream<Integer> listaPositivo = numeros.stream();

        Predicate<Integer> positivos = n -> n > 0;


        //return listaPositivo.allMatch(n -> n > 0);
        return listaPositivo.allMatch(positivos);

    }

}
