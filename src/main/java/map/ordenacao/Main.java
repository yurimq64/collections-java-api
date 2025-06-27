package main.java.map.ordenacao;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2025, 2, 12), "Coisa 1", "Evento 1");
        agendaEventos.adicionarEvento(LocalDate.of(2025, 8, 20), "Coisa 2", "Evento 2");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 12, 22), "Coisa 3", "Evento 3");
        agendaEventos.adicionarEvento(LocalDate.of(2025, 6, 27), "Coisa 4", "Evento 4");

        System.out.println("Agenda de eventos");
        agendaEventos.exibirAgenda();

        System.out.println();
        agendaEventos.obterProximoEvento();
    }
}
