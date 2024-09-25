package list.livros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenandoLivros {

    List<Livro> listaLivros;

    public OrdenandoLivros(){
        listaLivros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro){
        listaLivros.add(new Livro(livro.getTitulo(),livro.getAutor(),livro.getAno()));

    }

    public List<Livro> orndenarPorAno(){
        List<Livro> livrosOrdenadosPorAno = new ArrayList<>(listaLivros);
        Collections.sort(livrosOrdenadosPorAno);
        return livrosOrdenadosPorAno;

    }

    public List<Livro> ordenarPorAutor(){
        List<Livro> livrosPorAutor = new ArrayList<>(listaLivros);
        Collections.sort(livrosPorAutor, new ComparePorAutor());
        return  livrosPorAutor;
    }
}
