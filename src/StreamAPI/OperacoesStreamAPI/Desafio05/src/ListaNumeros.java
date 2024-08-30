import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;

public class ListaNumeros {

    private final List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public List<Integer> getNumeros() {
        return numeros;
    }

    //Calcular média dos números maiores que 5
    public int mediaMaioresCinco(){
        Stream<Integer> listaMedia = numeros.stream();

        return listaMedia.filter(n -> n > 5).mapToInt(n -> n).sum();
    }

}
