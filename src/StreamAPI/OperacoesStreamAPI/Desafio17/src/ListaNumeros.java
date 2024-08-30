import java.util.List;
import java.util.Arrays;

public class ListaNumeros {

    private final List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public List<Integer> getNumeros() {
        return numeros;
    }

    //Filtrar os numeros primos da lista
    public List<Integer> numerosPrimos(){

        List<Integer> listPrimos = numeros.stream()
                .filter(n -> {
                    if(n == 1)
                        return false;
                    if(n == 2)
                        return true;
                    if(n % 2 == 0)
                        return false;
                    for(int i = 3; i < n; i++){
                        if(n % i == 0)
                            return false;
                    }
                    return true;
                })
                .distinct()
                .toList();

        return listPrimos;
    }

}
