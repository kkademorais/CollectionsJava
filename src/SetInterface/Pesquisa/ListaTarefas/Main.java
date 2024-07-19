package SetInterface.Pesquisa.ListaTarefas;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        ListaTarefas tarefasList = new ListaTarefas();

        System.out.println("Imprimindo lista inicialmente vazia!");
        tarefasList.exibirTarefas();
        System.out.println();

        System.out.println();
        System.out.println("Adicionado tarefas na lista!");
        tarefasList.adicionarTarefa("Lavar louça");
        tarefasList.adicionarTarefa("Limpar casa");
        tarefasList.adicionarTarefa("Arrumar cama");
        tarefasList.adicionarTarefa("Estudar aulas");
        tarefasList.adicionarTarefa("Ir pra academia");
        System.out.println();

        System.out.println();
        System.out.println("Exibindo nova lista atualizada!");
        tarefasList.exibirTarefas();
        System.out.println();
        System.out.println("Contando tarefas!");
        tarefasList.contarTarefas();
        System.out.println();

        System.out.println();
        System.out.println("Removendo Lavar louça da lista de tarefas!");
        tarefasList.removerTarefa("Lavar louça");
        System.out.println();

        System.out.println();
        System.out.println("Exibindo nova lista atualizada!");
        tarefasList.exibirTarefas();
        System.out.println();
        System.out.println("Contando tarefas!");
        tarefasList.contarTarefas();
        System.out.println();


    }
}
