package list.conjuntoConvidados;

public class TestandoConvidados {

    public static void main(String[] args) {

        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        conjuntoConvidados.adicionarConvidado("Assis", 001);
        conjuntoConvidados.adicionarConvidado("Pedro", 002);
        conjuntoConvidados.adicionarConvidado("Andreina", 003);
        conjuntoConvidados.adicionarConvidado("Andreina", 003);
        conjuntoConvidados.adicionarConvidado("Andreina", 006);
        conjuntoConvidados.contarConvidados();
       // conjuntoConvidados.removerConvidadoPorCodigoConvite(003);
        conjuntoConvidados.contarConvidados();
        conjuntoConvidados.exibirConvidados();







    }
}
