package list.agendaDeContatos;

public class TestarAgenda {
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.adicionarContato("kiko", 89916463);
        agendaContatos.adicionarContato("Vanessa", 899165454);
        agendaContatos.adicionarContato("Vanessa Xavier", 889165454);
        agendaContatos.adicionarContato("Bruno", 89452198);
        agendaContatos.exibirContato();
        agendaContatos.atualizarNumeroContato("kiko",111111);
        agendaContatos.exibirContato();
        System.out.println(agendaContatos.pesquisarPornome("Vanessa"));


    }

}
