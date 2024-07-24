package SetInterface.Ordenacao.ListaAlunos;

public class Main {
    public static void main(String[] args) {

        GerenciadorAlunos listaAlunos = new GerenciadorAlunos();

        System.out.println("Imprimindo lista de alunos inicialmente vazia: ");
        listaAlunos.exibirAlunos();

        System.out.println();
        System.out.println("Preenchendo lista com os alunos: ");

        listaAlunos.adicionarAluno("Kaike", 202301131, 8.5);
        listaAlunos.adicionarAluno("João", 202301129, 7.2);
        listaAlunos.adicionarAluno("Gabriel", 202301152, 5.6);
        listaAlunos.adicionarAluno("Gustavo", 202401621, 8.0);
        listaAlunos.adicionarAluno("Pedro", 202302185, 6.7);

        System.out.println();
        System.out.println("Preenchendo lista dos alunos agora preenchida: ");

        System.out.println();
        listaAlunos.exibirAlunosPorNome();

        System.out.println();
        listaAlunos.exibirAlunosPorNota();

    }
}
