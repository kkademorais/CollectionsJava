package ListInterface.Ordenacao.OrdenacaoPessoas;
import java.util.ArrayList;
import java.lang.Comparable;

public class OrdenacaoPessoas {

    //Atributos -> Lista de Pessoas
    private ArrayList<Pessoa> ListaPessoas;

    //Construtor -> Inicializa lista vazia
    public OrdenacaoPessoas(){
        this.ListaPessoas = new ArrayList<>();
    }

    //Métodos
    public void adicionarPessoa(String nome, int idade, double altura){
        Pessoa pessoaAdd = new Pessoa(nome, idade, altura);
        ListaPessoas.add(pessoaAdd);
    }

        //Ordena por idade usando Comparable
    public void ordenarPorIdade(){
       

    }

        //Ordena por altura usando Comparator personalizado
    public void ordenarPorAltura(){

    }



}
