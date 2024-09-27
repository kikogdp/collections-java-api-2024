package Map;



import java.util.HashMap;
import java.util.Map;

public class EstoqueProduto {

    Map<Long, Produto> estoqueProdutos;

    public EstoqueProduto(){
        this.estoqueProdutos = new HashMap<>();

    }

    public void adicionarProdutos(long cod, String nome, int quantidade, double preco){
        estoqueProdutos.put(cod, new Produto(nome,quantidade,preco));

    }

    public void exibirProdutos(){
        System.out.println(estoqueProdutos);

    }

    public double calcularValorTotalEstoque(){
        double valorTotalEstoque = 0;

        if (!estoqueProdutos.isEmpty()){
           for (Produto p: estoqueProdutos.values()){
               valorTotalEstoque += p.getQuantidade() * p.getPreco();

           }
        }

        return valorTotalEstoque;

    }


}
