import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {

        //Criar list com elementos
        //Criar BinaryOperator para realizar a soma
        //Criar variável pra imprimir resultado

        List<Integer> numerosList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> novaList = Arrays.asList(10, 20, 30, 40 ,50);

        //BinaryOperator<Integer> somaNumeros = (num1, num2) -> num1 + num2;
        BinaryOperator<Integer> somaNumeros = Integer::sum;

        BinaryOperator<Integer> novaSoma = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer num1, Integer num2) {
                return num1 + num2;
            }
        };


        int resultado = numerosList.stream().reduce(0, somaNumeros);

        int novoResultado = novaList.stream().reduce(0, novaSoma);

        System.out.println(resultado);
        System.out.println(novoResultado);


    }
}
