package ListInterface.Ordenacao.OrdenacaoNumeros;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class OrdenacaoNumeros implements Comparable<Integer>{

    //Atributo -> lista de números inteiros
    private ArrayList<Integer> ListaNumeros;

    //Construtor -> inicializa lista vazia
    public OrdenacaoNumeros(){
        this.ListaNumeros = new ArrayList<>();
    }

    //Métodos
    public void adicionarNumero(int numero){
        ListaNumeros.add(numero);
        System.out.printf("\nNúmero adicionado na lista: %d!\n", numero);
    }

    public void mostrarLista(){
        for(Integer listaNumero: ListaNumeros){
            System.out.printf("\n%d\n", listaNumero);
        }
    }

    @Override
    public int compareTo(Integer numero) {
        for (Integer listaNumero : ListaNumeros) {
            if (listaNumero < numero) {
                return -1;
            }
            if (listaNumero > numero) {
                return 1;
            }
        }
        return 0;
    }
    public int compareToDescendente(Integer numero) {
        for (Integer listaNumero : ListaNumeros) {
            if (listaNumero < numero) {
                return 1;
            }
            if (listaNumero > numero) {
                return -1;
            }
        }
        return 0;
    }


    //Métodos com Comparable

    public void ordenarAscendente(){
        for(Integer listaNumero: ListaNumeros){
            compareTo(listaNumero);
        }
        Collections.sort(ListaNumeros);
        System.out.println("Printando lista ordenada: ");
        mostrarLista();
    }

    public void ordenarDescendente(){
        for(Integer listaNumero: ListaNumeros){
            compareToDescendente(listaNumero);
        }
        Collections.sort(ListaNumeros);
        System.out.println("Printando lista ordenada: ");
        mostrarLista();
    }

}
