import java.util.List;
import java.util.Arrays;

public class ListaNumeros {

    private final List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 1);

    public List<Integer> getNumeros() {
        return numeros;
    }

    //Verificar se todos os números são iguais
    public boolean isEquals(){

        boolean listEqual = numeros.stream()
                //AllMatch -> Filter -> Predicate
                .allMatch(n -> n.equals(numeros.getFirst()));

        return listEqual;
    }


}
