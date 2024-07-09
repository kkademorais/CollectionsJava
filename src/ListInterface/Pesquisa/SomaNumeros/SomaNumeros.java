package ListInterface.Pesquisa.SomaNumeros;
import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    //Atributo -> lista de números inteiros
    public ArrayList<Numeros> ListaNumeros;

    //Construtor -> cria lista vazia
    public void ListaNumeros(){
        this.ListaNumeros = new ArrayList<>();
    }

    public void adicionarNumero(Numeros numeros){
        //Numeros numeros = new Numeros();
        ListaNumeros.add(numeros);
    }
    public int calcularSoma(){
        int resultado = 0;
        for(int i = 0; i < ListaNumeros.size(); i++){
            //resultado += ListaNumeros.get(i);
        }

    }
    public int encontrarMaiorNumero(){
        int maiorValor = 0;
        for(Numeros numeros: ListaNumeros){
            //if(ListaNumeros.getFirst()){}
        }
    }
    public int encontrarMenorNumero(){

    }
    public void exibirNumeros(){

    }




}
