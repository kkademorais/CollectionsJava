import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {

        //Criar list
        //Criar predicate pra passar a condição
        //Criar list pra filtrar e exibir o forEach

        List<String> linguagens = Arrays.asList("Python", "JavaScript", "Java", "C++", "Kotlin", "Flutter");

        Predicate<String> linguagensLength = linguagensProgramacao -> linguagensProgramacao.length() > 5;

        linguagens.stream().filter(linguagensLength).forEach(s -> System.out.println(s));

        System.out.println();
        System.out.println("Lista 2");
        linguagens.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                if(s.length() > 5){
                    return true;
                }
                return false;
            }
        }).forEach(p -> System.out.println(p));

    }
}
