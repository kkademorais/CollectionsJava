import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ListaNumeros {

    private final List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public List<Integer> getNumeros() {
        return numeros;
    }

    //Ordenar a lista em ordem crescente
    public List<Integer> ordenarLista(){
        Stream<Integer> listaOrdenada = numeros.stream();
        return listaOrdenada.sorted().toList();
    }

}
