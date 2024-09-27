package ordenacaoSet;

public class TestandoOrdenacao {

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        cadastroProdutos.adicionarProduto(1L,"Cafe", 15,40);
        cadastroProdutos.adicionarProduto(3L,"Feijão", 15,5);
        cadastroProdutos.adicionarProduto(2L,"Leite", 10,13);
        cadastroProdutos.adicionarProduto(3L,"Arroz", 20,23);

        System.out.println(cadastroProdutos.exibirProdutoPorNome());
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
        System.out.println(cadastroProdutos.exibirPorquanidade());

    }



}
