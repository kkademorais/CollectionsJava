import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample2 {
    public static void main(String[] args) {

            //Cria lista
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

            //Cria consumer e atribui o Lambda
        Consumer<Integer> imprimirNumerosPares = numero -> {
            if(numero % 2 == 0){
                System.out.println(numero);
            }
        };

        numeros.forEach(imprimirNumerosPares);

    }
}
