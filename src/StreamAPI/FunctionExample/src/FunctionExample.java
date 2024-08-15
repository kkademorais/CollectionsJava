import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {

        //Imprimir dobro de cada número
        //Criar list com todos os números
        //Criar Function que recebe o número e calcula seu dobro
        //Criar list para mapear sobre os elementos da function
        //Imprimir ForEach aplicado na list mapeada

        List<Integer> numerosList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Function<Integer, Integer> numerosFunction = numero -> numero * 2;

        //List<Integer> integerList = numerosList.stream().map(numerosFunction).toList();
        List<Integer> integerList = new ArrayList<>();
        for (Integer i : numerosList) {
            Integer i1 = numerosFunction.apply(i);
            integerList.add(i1);
        }

        //integerList.forEach(integer -> System.out.println(integer));
        integerList.forEach(System.out::println);

    }
}
