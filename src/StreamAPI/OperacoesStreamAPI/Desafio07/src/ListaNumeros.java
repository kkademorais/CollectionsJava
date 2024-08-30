import java.util.List;
import java.util.Arrays;

public class ListaNumeros {

    private final List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public List<Integer> getNumeros() {
        return numeros;
    }

    //Encontrar o segundo número maior da lista
    public Integer segundoMaiorLista(){

        List<Integer> stream = numeros.stream()
                .distinct()
                .sorted((a,b) -> b - a)
                .toList();

        return stream.get(1);
        /*Stream<Integer> stream = numeros.stream();

        stream.distinct()
                .sorted((a, b) -> b - a)
                .collect(Collectors.toList())
                .get(1);
        */


        //return stream.sorted().skip(stream.count() - 1);

    }

}
