package Introducao.GenericsType;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        //Lista sem Generics -> permite adicionar qualquer tipo de objeto
        List listaSemGenerics = new ArrayList();
        listaSemGenerics.add("Elemento 1");
        listaSemGenerics.add(10);

        //Lista com Generics
        List<String> listaGenerics = new ArrayList<>();
        listaGenerics.add("Elemento 1");
        listaGenerics.add("Elemento 2");

        //Iterando sobre a listaGenerics
        System.out.println("ListaGenerics");
        for(String elemento: listaGenerics){
            System.out.println(elemento);
        }
        System.out.println();

        System.out.println("ListaSemGenerics");
        //Iterando sobre a listaSemGenerics
        for(Object elemento: listaSemGenerics){
            String str = (String) elemento; //Casting
            System.out.println(str);
        }

    }
}
