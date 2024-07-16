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

    public void printarPessoas(){
        for(Pessoa p: ListaPessoas){
            System.out.println();
            System.out.printf("Nome: %s \n", p.getNome());
            System.out.printf("Idade: %d \n", p.getIdade());
            System.out.printf("Altura : %.2f \n", p.getAltura());
        }
    }



    //Ordena por idade usando Comparable
    public void ordenarPorIdade(){
        ArrayList<Pessoa> pessoasPorIdade = new ArrayList<>(ListaPessoas);
        Collections.sort(pessoasPorIdade);
        for(Pessoa p: pessoasPorIdade){
            System.out.println();
            System.out.printf("Nome: %s \n", p.getNome());
            System.out.printf("Idade: %d \n", p.getIdade());
            System.out.printf("Altura : %.2f \n", p.getAltura());
        }
        //Need study Comparable

    }

        //Ordena por altura usando Comparator personalizado
    public void ordenarPorAltura(){
        ArrayList<Pessoa> pessoasPorAltura = new ArrayList<>(ListaPessoas);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        for(Pessoa p: pessoasPorAltura){
            System.out.println();
            System.out.printf("Nome: %s \n", p.getNome());
            System.out.printf("Idade: %d \n", p.getIdade());
            System.out.printf("Altura : %.2f \n", p.getAltura());
        }
        //Need study Comparator
    }

    @Override
    public String toString() {
        return "OrdenacaoPessoas{" +
                "ListaPessoas=" + ListaPessoas +
                '}';
    }
}
