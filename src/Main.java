import list.*;

import java.util.Vector;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
       carrinhoDeCompras.adicionarItem("Carne", 50.0,3);
       carrinhoDeCompras.adicionarItem("Arros", 40.0,8);
        carrinhoDeCompras.adicionarItem("Feijão", 30.0,10);
        carrinhoDeCompras.adicionarItem("Macarrão", 20.0,12);
       carrinhoDeCompras.exibirItens();
        System.out.println(carrinhoDeCompras.calcularValorTotal());
       carrinhoDeCompras.removerItem("Carne");
        carrinhoDeCompras.exibirItens();
        System.out.println(carrinhoDeCompras.calcularValorTotal());













        //Fazendo analogia que Veiculo(DEUS) e  Carro() é Jesus, Jesus é o Deus como Carro e Veiculo.




        }
    }
