package list;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    List<Item> itens;

    public CarrinhoDeCompras(){
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){

      itens.add(new Item(nome, preco, quantidade));

    }

    public void removerItem(String nome){
        List<Item> itensRemovidos = new ArrayList<>();

        for( Item i: itens){
            if (i.getNome().equals(nome)){
                itensRemovidos.add(i);
            }

        }
        itens.removeAll(itensRemovidos);
    }

    public double calcularValorTotal(){
        double total= 0;
        for(Item t: itens ){
            total += (t.getPreco() * t.getQuantidade());
        }

        return total;

    }

    public void exibirItens(){
        for (int i = 0; i < itens.size(); i++) {
            System.out.println(itens.get(i).getNome()+ " " + itens.get(i).getPreco() +
                    " " + itens.get(i).getQuantidade());

        }

    }
}
