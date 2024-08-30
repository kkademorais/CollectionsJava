import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;

public class ListaNumeros {

    private final List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public List<Integer> getNumeros() {
        return numeros;
    }

    //Fazer duas listas: uma contendo pares e outra ímpares
    public HashMap<Integer, List<Integer>> agruparParesImpares(){

        List<Integer> listPares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .toList();
        List<Integer> listImpares = numeros.stream()
                .filter(n -> n % 2 == 1)
                .toList();

        HashMap<Integer, List<Integer>> mapa= new HashMap<>();
        mapa.put(0, listPares);
        mapa.put(1, listImpares);

        /*List<Integer> listParesImpares = new ArrayList<>();
        listParesImpares.addAll(listPares);
        listParesImpares.addAll(listImpares);*/

        return mapa;
    }

}
