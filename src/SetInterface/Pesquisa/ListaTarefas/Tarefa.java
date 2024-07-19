package SetInterface.Pesquisa.ListaTarefas;

public class Tarefa {

    //Atributos
    private String descricao;
    private boolean tarefaConcluida;

    //Construtor -> Setter
    public Tarefa(String descricao, boolean tarefaConcluida){
        this.descricao = descricao;
        this.tarefaConcluida = tarefaConcluida;
    }

    //Métodos

        //Getter
    public boolean isTarefaConcluida() {
        return tarefaConcluida;
    }
    public String getDescricao() {
        return descricao;
    }

        //Setter
    public void setTarefaConcluida(boolean tarefaConcluida) {
        this.tarefaConcluida = tarefaConcluida;
    }
}
