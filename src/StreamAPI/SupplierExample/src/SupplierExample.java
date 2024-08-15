import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {

        //Gerar supplier
        Supplier<String>Saudacao = () -> "Olá, sejam bem-vindos!";

        //Gerar list
        List<String>conjuntoSaldacoes = new ArrayList<>();
        conjuntoSaldacoes.add(Saudacao.get());

        //Gerar ForEach
        for(String s: conjuntoSaldacoes){
            System.out.println(s);
        }

    }
}
