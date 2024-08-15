import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExample2 {
    public static void main(String[] args) {

        List<Integer> listaNumeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Function<Integer, Integer> dobrar = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer numero) {
                return numero * 2;
            }
        };

        List<Integer>numerosDobrados = listaNumeros.stream().map(numero -> numero * 2).toList();

        List<Integer>dobrarNumeros = listaNumeros.stream().map(new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer n) {
                return n * 2;
            }
        }).toList();

        List<Integer> dobrandoNumeros = listaNumeros.stream().map(dobrar).toList();



        numerosDobrados.forEach(numero -> System.out.println(numero));
        System.out.println();
        System.out.println("Lista 2");
        dobrarNumeros.forEach(numero -> System.out.println(numero));

        System.out.println();
        System.out.println("Lista 3");
        dobrandoNumeros.forEach(numero -> System.out.println(numero));



    }
}
