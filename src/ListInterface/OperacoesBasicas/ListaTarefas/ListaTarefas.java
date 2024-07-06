package ListInterface.OperacoesBasicas.ListaTarefas;


import java.util.ArrayList;


public class ListaTarefas {
    private ArrayList<Tarefa> listaTarefas;

    //Construtor -> Cria lista vazia
    public ListaTarefas(){
        this.listaTarefas = new ArrayList<>();
    }


    public void adicionarTarefa(String descricao){
        listaTarefas.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao){
        ArrayList<Tarefa> TarefasRemover = new ArrayList<>();
        for(Tarefa t: listaTarefas){
            if(t.getDescricao().replaceAll(" ", "").equalsIgnoreCase(descricao.replaceAll(" ", ""))){
                TarefasRemover.add(t);
            }
        }
        listaTarefas.removeAll(TarefasRemover);
    }
    public int obterNumeroTotalTarefas(){
        return listaTarefas.size();
    }
    public void obterDescricoesTarefas(){
        for(int i = 0; i < listaTarefas.size(); i++){
           System.out.printf("\nTarefa %d -> %s", i,listaTarefas.get(i));
        }
        System.out.println();
        System.out.println(listaTarefas);

    }


}
