package list;

public class Moto extends Veiculo{
    public Moto(Motor motor) {
        super(motor);
    }

    @Override
    public void aceleracao() {
        System.out.println("Acelerando a moto");

    }

    @Override
    public void potencia() {
        System.out.println("100 cavalos");

    }
}
