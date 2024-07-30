package Ordenacao.AgendaEventos;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        AgendaEventos agendaEventos = new AgendaEventos();

        System.out.println("Imprimindo map inicialmente vazio");
        agendaEventos.exibirAgenda();
        System.out.println();

        System.out.println("Adicionado eventos na agenda: ");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 12, 19), "Aniversário", "Rafaella");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 8, 19), "Aniversário", "Guilherme");
        agendaEventos.adicionarEvento(LocalDate.of(2025, 3, 22), "Aniversário", "Kaike");
        agendaEventos.adicionarEvento(LocalDate.of(2025, 2, 6), "Aniversário", "Andrea");
        agendaEventos.adicionarEvento(LocalDate.of(2025, 7, 23), "Aniversário", "Vovô");
        System.out.println();

        System.out.println("Imprimindo agenda atualizada: ");
        agendaEventos.exibirAgenda();
        System.out.println();

        System.out.println("Qual próximo evento agendado?");
        agendaEventos.obterProximoEvento();


    }
}
