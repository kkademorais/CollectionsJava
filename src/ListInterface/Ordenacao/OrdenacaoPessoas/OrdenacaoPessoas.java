package ListInterface.Ordenacao.OrdenacaoPessoas;
import java.util.ArrayList;
import java.util.Collections;

public class OrdenacaoPessoas{

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
    public ArrayList<Pessoa> ordenarPorIdade(){
        ArrayList<Pessoa> pessoasPorIdade = new ArrayList<>(ListaPessoas);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
        //Need study Comparable

    }

        //Ordena por altura usando Comparator personalizado
    public ArrayList<Pessoa> ordenarPorAltura(){
        ArrayList<Pessoa> pessoasPorAltura = new ArrayList<>(ListaPessoas);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
        //Need study Comparator
    }


}
