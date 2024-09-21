package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoDeLivros {
    List<Livro> catalogoLivros;

    public CatalogoDeLivros(){
        catalogoLivros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro){
        catalogoLivros.add(new Livro(livro.getTitulo(), livro.getAutor(), livro.getAnoDePublicacao()));

    }

    public void pesquisarPorAutor(String autor){
        for (int i = 0; i <catalogoLivros.size() ; i++) {
            if (catalogoLivros.get(i).getAutor().equalsIgnoreCase(autor)){
                System.out.println("Livro " + catalogoLivros.get(i).getTitulo());

            }

        }

    }

    public List<Livro> pesquisarPorIntervalosAnos(int anoIncial, int anoFinal){
        List<Livro> livrosencontrados = new ArrayList<>();
        for (int i = 0; i < catalogoLivros.size(); i++) {
            if (catalogoLivros.get(i).getAnoDePublicacao() > anoIncial &&
                    catalogoLivros.get(i).getAnoDePublicacao() < anoFinal){
                livrosencontrados.add(catalogoLivros.get(i));




            }


        }

        return livrosencontrados;

    }

    public void pesquisarPortitulos(String titulo){
        for (Livro l: catalogoLivros){
          if(l.getTitulo().equalsIgnoreCase(titulo)){
              System.out.println(l.getAutor());
            }
        }

    }

    public static void main(String[] args){
        Livro biblia = new Livro("Biblia Sagrada","Deus",01);
        Livro romanos = new Livro("Cartas aos Romanos","Paulo",1500);
        Livro galatas = new Livro("Carta escrita a igreja de Galatas","Paulo",1200);
        Livro eclesiates = new Livro("Que proveito tem um homem de todo seu trabalho","Salomão",1600);
        Livro proverbios = new Livro("Sabedoria","Salomão",1200);
        Livro salmos = new Livro("Poemas","Davi",1200);



        CatalogoDeLivros catalogoDeLivros = new CatalogoDeLivros();
        catalogoDeLivros.adicionarLivro(biblia);
        catalogoDeLivros.adicionarLivro(eclesiates);
        catalogoDeLivros.adicionarLivro(romanos);
        catalogoDeLivros.adicionarLivro(galatas);
        catalogoDeLivros.adicionarLivro(proverbios);
        catalogoDeLivros.adicionarLivro(salmos);


        catalogoDeLivros.pesquisarPorAutor("Deus");
        catalogoDeLivros.pesquisarPorAutor("Salomão");
        catalogoDeLivros.pesquisarPorAutor("Davi");
        catalogoDeLivros.pesquisarPorAutor("Paulo");

        catalogoDeLivros.pesquisarPortitulos("Cartas aos Romanos");

        System.out.println(catalogoDeLivros.pesquisarPorIntervalosAnos(1100, 1600));






    }
}
