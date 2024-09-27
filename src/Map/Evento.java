package Map;

public class Evento {
    private String nomeEvento;
    private String nomeDaAtracao;

    public Evento(String nomeEvento,String nomeDaAtracao){
        this.nomeEvento = nomeEvento;
        this.nomeDaAtracao = nomeDaAtracao;


    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public String getNomeDaAtracao() {
        return nomeDaAtracao;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "nomeEvento='" + nomeEvento + '\'' +
                ", nomeDaAtracao='" + nomeDaAtracao + '\'' +
                '}';
    }
}
