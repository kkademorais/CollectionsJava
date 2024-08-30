import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;

public class ListaNumeros {

    private final List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public List<Integer> getNumeros() {
        return numeros;
    }

    //Verificar se todos os números são distintos (não se repetem)
    public boolean isUnique(){

        return numeros.stream().distinct().count() == numeros.size();
        /*List<Integer> list = numeros.stream()
                .distinct()
                .toList();
        Stream<Integer> list2 = numeros.stream();


        if(list.size() == list2.count())
            return true;
        else
            return false;*/

    }
}
