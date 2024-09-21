package list.livros;

import java.util.Comparator;

public class Livro implements Comparable<Livro>{
    private String titulo;
    private String autor;
    private int ano;

    public Livro(String titulo, String autor, int ano ){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;

    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAno() {
        return ano;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", ano=" + ano +
                '}';
    }

    @Override
    public int compareTo(Livro l) {
        return Integer.compare(ano, l.ano);
    }
}

class ComparetoAno implements Comparator<Livro> {

    @Override
    public int compare(Livro l1, Livro l2) {
        return Integer.compare(l1.getAno(), l2.getAno());
    }
}
