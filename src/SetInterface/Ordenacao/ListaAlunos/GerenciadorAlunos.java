package SetInterface.Ordenacao.ListaAlunos;

import java.util.HashSet;
import java.util.TreeSet;

public class GerenciadorAlunos {

    //Atributos
    private HashSet<Aluno >listaAlunos;

    //Construtor -> inicializa lista vazia
    public GerenciadorAlunos(){
        this.listaAlunos = new HashSet<>();
    }

    //Métodos

        //Adiciona aluno novo na lista
    public void adicionarAluno(String nome, long matricula, double nota){
        Aluno alunoAdd = new Aluno(nome, matricula, nota);
        listaAlunos.add(alunoAdd);
        System.out.println();
        System.out.println("Aluno adicionado no sistema!");
        System.out.printf("\nNome do aluno: %s", alunoAdd.getNome());
        System.out.printf("\nNúmero de matrícula: %d", alunoAdd.getMatricula());
        System.out.printf("\nNota do aluno: %.2f\n", alunoAdd.getNota());
    }

        //Remove aluno da lista a partir da matricula, se estiver presente
    public void removerAluno(long matricula){
        HashSet<Aluno> alunoRemover = new HashSet<>();
        for(Aluno a: listaAlunos){
            if(a.getMatricula() == matricula){
                System.out.println();
                System.out.println("Aluno presente no sistema!");
                alunoRemover.add(a);
                System.out.println("Aluno removido: ");
                System.out.printf("\nNome do aluno: %s", a.getNome());
                System.out.printf("\nNúmero de matrícula: %d", a.getMatricula());
                System.out.printf("\nNota do aluno: %.2f\n", a.getNota());
                return;
            }
        }
        System.out.println("Aluno não está presente no sistema!");
    }

        //Mostrar alunos da lista em ordem alfabética de nome
    public void exibirAlunosPorNome(){
        TreeSet<Aluno> alunosPorNome = new TreeSet<>(listaAlunos);
        System.out.println("Exibindo lista de alunos ordenados por ordem alfabética: ");
        for(Aluno a: alunosPorNome){
            System.out.printf("%s\n", a);
        }
    }

        //Mostrar alunos da lista em ordem crescente de nota
    public void exibirAlunosPorNota(){
        TreeSet<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
        alunosPorNota.addAll(listaAlunos);
        System.out.println("Exibindo lista de alunos ordenados por nota: ");
        for(Aluno a: alunosPorNota){
            System.out.printf("%s\n", a);
        }
    }

        //Getter
    public void exibirAlunos(){
        System.out.println("Exibindo todos os alunos matriculados: ");
        for(Aluno a: listaAlunos){
            System.out.printf("\nNome do aluno: %s", a.getNome());
            System.out.printf("\nNúmero de matrícula: %d", a.getMatricula());
            System.out.printf("\nNota do aluno: %.2f\n", a.getNota());
        }
    }

}
