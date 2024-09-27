package Map;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEvento {
    Map<LocalDate, Evento> agendaDeEventos;

    public AgendaEvento() {
        agendaDeEventos = new HashMap<>();

    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {

        agendaDeEventos.put(data, new Evento(nome, atracao));


    }

    public void obterProximoEvento() {
        LocalDate dataAtual = LocalDate.now();
        Evento proximoEvento = null;
        LocalDate proximaData = null;

        if (!agendaDeEventos.isEmpty()) {
            for (Map.Entry<LocalDate, Evento> entry : agendaDeEventos.entrySet()) {
                if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                    proximaData = entry.getKey();
                    proximoEvento = entry.getValue();
                    System.out.println("O próximo evento: " + proximoEvento + "acontecerá na data " + proximaData);
                    break;

                }

            }


        }


    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(agendaDeEventos);
        System.out.println(eventosTreeMap);
    }
}