package ListInterface.OperacoesBasicas.ListaTarefas;

public class Tarefa {
    private String descricao;

    //Construtor -> Setta a descricao
    //Getter

        //Construtor
    public Tarefa(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}
