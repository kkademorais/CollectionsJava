package ListInterface.Pesquisa.SomaNumeros;
import java.util.ArrayList;
import java.util.List;


public class SomaNumeros {

    //Atributo -> lista de números inteiros
    private ArrayList<Integer> ListaNumeros;

    public SomaNumeros(){
        this.ListaNumeros = new ArrayList<>();
    }


    //Métodos
    public void adicionarNumero(int numeros){
        ListaNumeros.add(numeros);
    }
    public int calcularSoma(){
        int resultado = 0;
        for(int i = 0; i < ListaNumeros.size(); i++){
            resultado += ListaNumeros.get(i);
        }
        return resultado;
    }
    public int encontrarMaiorNumero(){
        int maiorValor = 0;
        for(int i = 0; i < ListaNumeros.size(); i++){
            if(i == 0){
                maiorValor = ListaNumeros.get(i);
            }
            else if(ListaNumeros.get(i) > maiorValor){
                maiorValor = ListaNumeros.get(i);
            }
        }
        return maiorValor;
    }
    public int encontrarMenorNumero(){
        int menorValor = 0;
        for(int i = 0; i < ListaNumeros.size(); i++){
            if(i == 0){
                menorValor = ListaNumeros.get(i);
            }
            else if(ListaNumeros.get(i) < menorValor){
                menorValor = ListaNumeros.get(i);
            }
        }
        return menorValor;
    }
    public void exibirNumeros(){
        for(int numero: ListaNumeros){
            System.out.printf("\n%d", numero);
        }
    }




}
