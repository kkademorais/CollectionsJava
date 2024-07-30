package Ordenacao.AgendaEventos;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.HashMap;
import java.util.TreeMap;

public class AgendaEventos{

    //Atributos
    private HashMap<LocalDate, Evento> agendaEventos;

    //Construtor -> inicializa lista vazia
    public AgendaEventos(){
        this.agendaEventos = new HashMap<>();
    }

    //Métodos
        //Getter
    public void exibirAgenda(){
        System.out.println();
        TreeMap<LocalDate, Evento> eventoTreeMap = new TreeMap<>(agendaEventos);
        System.out.println("Exibindo todos os eventos agendados: ");
        for(LocalDate d: eventoTreeMap.keySet()){
            System.out.printf("Data do evento: %s \n", d);
            System.out.printf("Nome do evento: %s\n", eventoTreeMap.get(d).getNome());
            System.out.printf("Nome da atração: %s\n", eventoTreeMap.get(d).getAtracao());
            System.out.println();
        }
    }

            //Adiciona evento no map
    public void adicionarEvento(LocalDate data, String nome, String atracao){
        Evento eventoAdd = new Evento(nome, atracao);
        agendaEventos.put(data, eventoAdd);
        System.out.println();
        System.out.println("Evento adicionado com sucesso!");
        System.out.printf("Data do evento: %s\n", data);
        System.out.printf("Nome do evento: %s\n", nome);
        System.out.printf("Nome da atração: %s\n", atracao);
        System.out.println();
    }


            //Retorna próximo evento a acontecer
    public void obterProximoEvento(){
        ChronoLocalDate dataAtual = LocalDate.now();
        TreeMap<LocalDate, Evento> eventosProximos = new TreeMap<>(agendaEventos);

        for(LocalDate d: eventosProximos.keySet()){
            //Verificar se o evento for depois da dataAtual
            //Adicionar evento em map vazio
            if(d.equals(dataAtual)|| d.isAfter(dataAtual)){
                System.out.println();
                System.out.println("Próximo evento encontrado!");
                System.out.printf("Data do evento: %s\n", d);
                System.out.printf("Nome do evento: %s\n", eventosProximos.get(d).getNome());
                System.out.printf("Nome da atração: %s\n", eventosProximos.get(d).getAtracao());
                return;
            }
        }
        System.out.println("Não há eventos próximos...");
        //Organizar map novo em forma cronológica
        //Retornar o primeiro evento
    }


}
