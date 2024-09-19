package list;

public class Veiculo implements Motor {
    public String nome;
    public String placa;
    public String modelo;

    public Veiculo(Motor motor){
        System.out.println("construindo o motor");

    }

    @Override
    public void aceleracao() {

    }

    @Override
    public void potencia() {

    }
}
