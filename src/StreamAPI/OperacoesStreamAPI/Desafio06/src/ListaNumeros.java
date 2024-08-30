import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;

public class ListaNumeros {

    private final List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public List<Integer> getNumeros() {
        return numeros;
    }

    //Verificar se a lista contém algum número maior que 10
    public boolean verificaMaioresDez(){

        Stream<Integer> listaMaiores = numeros.stream();

        return listaMaiores.anyMatch(n -> n > 10);
    }

}
