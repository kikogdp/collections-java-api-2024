package ordenacaoSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    Set<Produto> listaProduto;

   public CadastroProdutos(){
       listaProduto = new HashSet<>();

   }

  public void adicionarProduto(long codigo, String nome, double preco, int quantidade){
       listaProduto.add( new Produto(nome, codigo, preco, quantidade));




   }

   public Set<Produto> exibirProdutoPorNome(){
       Set<Produto> produtosPorNome = new TreeSet<>(listaProduto);
       return produtosPorNome;

   }

   public Set<Produto> exibirProdutosPorPreco(){
       Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
       produtosPorPreco.addAll(listaProduto);
       return produtosPorPreco;


   }

   public Set<Produto> exibirPorquanidade(){
       Set<Produto> produtosPorQuantidade = new TreeSet<>(new ComparatorPorQuantidade());
       produtosPorQuantidade.addAll(listaProduto);
       return produtosPorQuantidade;

   }
}
