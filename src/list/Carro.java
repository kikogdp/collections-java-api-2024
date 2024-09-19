package list;

public class Carro extends Veiculo {


    public Carro(Motor motor) {
        super(motor);
    }

    @Override
    public void aceleracao() {
        System.out.println("Acelerando o carro");

    }

    @Override
    public void potencia() {
        System.out.println("200 cavalos");

    }


}
