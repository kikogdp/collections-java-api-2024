package Map;

import java.time.LocalDate;
import java.time.Month;

public class TestandoMap {
    public static void main(String[] args) {
        AgendaEvento agendaEvento = new AgendaEvento();

        agendaEvento.adicionarEvento(LocalDate.of(2022, Month.APRIL,15),"Evento 1","Atracao 1");
        agendaEvento.adicionarEvento(LocalDate.of(2024, Month.SEPTEMBER,27),"Evento 2","Atracao 2");
        agendaEvento.adicionarEvento(LocalDate.of(2024, Month.SEPTEMBER,26),"Evento 3","Atracao 3");
        agendaEvento.obterProximoEvento();
        agendaEvento.exibirAgenda();


    }
}
