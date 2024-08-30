import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;

public class ListaNumeros {

    private final List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public List<Integer> getNumeros() {
        return numeros;
    }

    //Imprimir a soma de todos os valores pares da lista
    public int somaPares(){
        Stream<Integer> listaPares = numeros.stream();
        int soma = listaPares.filter(Integer -> Integer % 2 == 0).mapToInt(Integer -> Integer).sum();
        return soma;
        //return listaPares.filter(Integer -> Integer % 2 == 0).mapToInt(Integer -> Integer).sum();
    }

}
