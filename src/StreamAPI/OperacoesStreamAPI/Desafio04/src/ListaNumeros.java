import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;

public class ListaNumeros {

    private final List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public List<Integer> getNumeros() {
        return numeros;
    }

    //Remover números ímpares da lista e imprimir resultado
    public List<Integer> removerImpares(){
        Stream<Integer> listaPares = numeros.stream();
        return listaPares.filter(n -> n % 2 == 0).toList();
    }

}
