package SetInterface.Ordenacao.ListaAlunos;

public class Aluno {

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
}
