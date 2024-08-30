import java.util.List;
import java.util.Arrays;
import java.util.stream.IntStream;

public class ListaNumeros {

    private final List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public List<Integer> getNumeros() {
        return numeros;
    }

    //Retornar produto de todos os números da lista
    public int produtoList(){

        //int multiplicar = 1;

        int produtosList = numeros.stream()
                .reduce(1, (a,b) -> a * b);

        //IntStream produtosList = numeros.stream()
         //       .mapToInt(n -> n * multiplicar);


        return produtosList;
    }

}
