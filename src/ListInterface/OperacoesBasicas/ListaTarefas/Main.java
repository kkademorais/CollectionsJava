package ListInterface.OperacoesBasicas.ListaTarefas;

public class Main {
    public static void main(String[] args) {
        ListaTarefas chores = new ListaTarefas();

        System.out.println("Número total de tarefas a fazer por agora: " + chores.obterNumeroTotalTarefas());

        chores.adicionarTarefa("Limpar a casa");
        chores.adicionarTarefa("Lavar a louça");
        chores.adicionarTarefa("Estudar");

        System.out.println("Número total de tarefas a fazer por agora: " + chores.obterNumeroTotalTarefas());
        chores.removerTarefa("limpar a casa");
        System.out.println("Número total de tarefas a fazer por agora: " + chores.obterNumeroTotalTarefas());
        chores.obterDescricoesTarefas();

    }
}
