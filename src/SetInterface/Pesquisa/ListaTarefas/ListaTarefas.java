package SetInterface.Pesquisa.ListaTarefas;

import java.util.HashSet;
import java.util.List;

public class ListaTarefas {

    //Atributos
    private HashSet<Tarefa> TarefaList;

    //Construtor -> inicializa lista vazia
    public ListaTarefas(){
        this.TarefaList = new HashSet<>();
    }

    //Métodos

        //Adiciona nova tarefa na lista
    public void adicionarTarefa(String descricao){
        Tarefa tarefaAdd = new Tarefa(descricao, false);
        TarefaList.add(tarefaAdd);
        System.out.println();
        System.out.println("Tarefa adicionada!");
        System.out.printf("\nDescrição: %s", tarefaAdd.getDescricao());
        System.out.printf("\nConcluída: %b\n", tarefaAdd.isTarefaConcluida());
    }

        //Remove tarefa da lista com base na descrição
    public void removerTarefa(String descricao){
        boolean tarefaNaLista = false;
        Tarefa tarefaRemover = null;
        for(Tarefa t: TarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao.replace(" ", ""))){
                System.out.println();
                System.out.println("Tarefa dentro da lista!");
                tarefaRemover = t;
                tarefaNaLista = true;
                break;
            }
        }
        if(!tarefaNaLista){
            System.out.println("Tarefa não está na lista!");
        }
        else{
            TarefaList.remove(tarefaRemover);
            System.out.println("Tarefa removida!");
            System.out.printf("\nDescrição: %s", tarefaRemover.getDescricao());
            System.out.printf("\nConcluída: %b\n", tarefaRemover.isTarefaConcluida());
        }
    }

        //Número total de tarefas na lista -> size
    public void contarTarefas(){
        System.out.printf("\nNúmero total de tarefas: %d\n", TarefaList.size());
    }

        //Retorna uma lista com todas tarefas concluídas
    public void obterTarefasConcluidas(){
        HashSet<Tarefa> tarefasConcluidas = new HashSet<>();
        for(Tarefa t: TarefaList){
            if(t.isTarefaConcluida()){
                tarefasConcluidas.add(t);
            }
        }
        System.out.println();
        System.out.println("Exibindo tarefas concluídas: ");
        for(Tarefa t: tarefasConcluidas){
            System.out.printf("\nDescrição: %s", t.getDescricao());
            System.out.printf("\nConcluída: %b\n", t.isTarefaConcluida());
        }
    }

        //Retorna uma lista com todas tarefas não-concluídas
    public void obterTarefasPendentes(){
        HashSet<Tarefa> tarefasPendentes = new HashSet<>();
        for(Tarefa t: TarefaList){
            if(!t.isTarefaConcluida()){
                tarefasPendentes.add(t);
            }
        }
        System.out.println();
        System.out.println("Exibindo tarefas pendentes: ");
        for(Tarefa t: tarefasPendentes){
            System.out.printf("\nDescrição: %s", t.getDescricao());
            System.out.printf("\nConcluída: %b\n", t.isTarefaConcluida());
        }
    }

        //Pega descrição e marca tarefa como concluída
    public void marcarTarefaConcluida(String descricao){}

        //Pega descrição e marca tarefa como pendente
    public void marcarTarefaPendente(String descricao){}

        //Remove todas as tarefas da lista
    public void limparListaTarefas(){
        System.out.println();
        System.out.println("Removendo todas as tarefas da lista!");
        TarefaList.removeAll(TarefaList);
        System.out.println("Lista de tarefas limpa!");
    }

        //Getter -> exibe tarefas na lista
    public void exibirTarefas(){
        System.out.println();
        System.out.println("Exibindo todas as tarefas!");
        for(Tarefa t: TarefaList){
            System.out.printf("\nDescrição da tarefa: %s", t.getDescricao());
            System.out.printf("\nTarefa concluída: %b\n", t.isTarefaConcluida());
        }
    }

}
