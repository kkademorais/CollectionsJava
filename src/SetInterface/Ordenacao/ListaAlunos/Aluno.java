package SetInterface.Ordenacao.ListaAlunos;

public class Aluno implements Comparable<Aluno>{

    //Atributos
    private String nome;
    private long matricula;
    private double nota;

    //Construtor -> Setter
    public Aluno(String nome, long matricula, double nota){
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }

    //Métodos
        //Compareto
    @Override
    public int compareTo(Aluno a) {
        return nome.compareToIgnoreCase(a.getNome());
    }

    //Getter
    public String getNome() {
        return nome;
    }
    public long getMatricula() {
        return matricula;
    }
    public double getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return '\n' + "Aluno = " + nome + '\n' +
                "Matrícula = " + matricula + '\n' +
                "Nota = " + nota + '\n';
    }
}
