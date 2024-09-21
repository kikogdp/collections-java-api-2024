package list.livros;

public class Testando {
    public static void main(String[] args) {
        OrdenandoLivros ordenandoLivros = new OrdenandoLivros();
        ordenandoLivros.adicionarLivro(new Livro("Cartas aos Romanos","Paulo",1600));
        ordenandoLivros.adicionarLivro(new Livro("Cartas aos Galatas","Paulo",1500));
        ordenandoLivros.adicionarLivro(new Livro("Cartas aos Filipenses","Paulo",1300));
        System.out.println(ordenandoLivros.ordenarPorAno());
        System.out.println(ordenandoLivros.orndenarPorAno());
    }
}
