import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierExample2 {
    public static void main(String[] args) {

        Supplier<String> saudacao = new Supplier<String>() {
            @Override
            public String get() {
                return "Olá, sejam bem-vindos";
            }
        };

        List<String>conjuntoSaudacoes = new ArrayList<>();
        conjuntoSaudacoes = Stream.generate(saudacao).limit(5).toList();

        conjuntoSaudacoes.forEach(s -> System.out.println(s));



    }
}
