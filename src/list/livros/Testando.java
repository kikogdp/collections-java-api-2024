package list.livros;

public class Testando {
    public static void main(String[] args) {
        OrdenandoLivros ordenandoLivros = new OrdenandoLivros();
        ordenandoLivros.adicionarLivro(new Livro("Cartas aos Romanos","Paulo",1600));
        ordenandoLivros.adicionarLivro(new Livro("Cartas aos Galatas","Paulo",1500));
        ordenandoLivros.adicionarLivro(new Livro("Cartas aos Filipenses","Paulo",1300));
        ordenandoLivros.adicionarLivro(new Livro("Salmos","Davi",900));
        ordenandoLivros.adicionarLivro(new Livro("Eclesiates","Salomão",1200));
        System.out.println(ordenandoLivros.ordenarPorAutor());
        System.out.println(ordenandoLivros.orndenarPorAno());
    }
}
