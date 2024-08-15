import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
            //Cria array
        List<Integer> numeros = Arrays.asList(1,2,3, 4, 5, 6, 7, 8, 9, 10);

            //Implementa consumer -> instancia novo e implementa método
        Consumer<Integer> imprimirNumerosPares = new Consumer<Integer>() {
            @Override
                //Método não retorna nada nem altera valores
            public void accept(Integer numero) {
                if(numero % 2== 0){
                    System.out.println(numero);
                }
            }
        };
            //Percorre todos os números da lista mandando para o Consumer
        for(Integer n: numeros){
            imprimirNumerosPares.accept(n);
        }

    }
}
