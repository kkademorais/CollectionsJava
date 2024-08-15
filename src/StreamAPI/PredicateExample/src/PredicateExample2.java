import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample2 {
    public static void main(String[] args) {

        List<Integer> numerosList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Predicate<Integer> isPar = numero -> numero % 2 == 0;

        numerosList.stream().filter(isPar).forEach(numero -> System.out.println(numero));

    }
}
