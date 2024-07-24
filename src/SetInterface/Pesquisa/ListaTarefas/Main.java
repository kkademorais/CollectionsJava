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

        System.out.println();
        System.out.println("Marcando tarefas concluídas!");
        tarefasList.marcarTarefaConcluida("Limpar casa");
        tarefasList.marcarTarefaConcluida("Lavar louça");
        tarefasList.marcarTarefaConcluida("Ir pra academia");
        System.out.println();

        System.out.println();
        System.out.println("Exibindo tarefas concluídas!");
        tarefasList.obterTarefasConcluidas();
        System.out.println();

        System.out.println();
        System.out.println("Exibindo nova lista atualizada!");
        tarefasList.exibirTarefas();
        System.out.println();
        System.out.println("Contando tarefas!");
        tarefasList.contarTarefas();
        System.out.println();


        System.out.println();
        System.out.println("Marcando tarefas pendentes!");
        tarefasList.marcarTarefaPendente("Limpar casa");
        System.out.println();

        System.out.println();
        System.out.println("Exibindo nova lista atualizada!");
        tarefasList.exibirTarefas();
        System.out.println();
        System.out.println("Contando tarefas!");
        tarefasList.contarTarefas();
        System.out.println();

        System.out.println();
        System.out.println("Exibindo tarefas pendentes!");
        tarefasList.obterTarefasPendentes();
        System.out.println();

        System.out.println();
        System.out.println("Limpando lista de tarefas: ");
        tarefasList.limparListaTarefas();
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
