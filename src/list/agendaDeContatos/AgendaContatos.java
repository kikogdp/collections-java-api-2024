package list.agendaDeContatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    Set<Contato> listaContatos;

   public AgendaContatos(){
       listaContatos = new HashSet<>();
   }

   public void adicionarContato(String nome, int numero){
       listaContatos.add(new Contato(nome, numero));

   }

   public void exibirContato(){
       System.out.println(listaContatos);

   }

   public Set<Contato> pesquisarPornome(String nome){
       Set<Contato> contatoEncontrado = new HashSet<>();
       for(Contato c: listaContatos){
           if(c.getNome().startsWith(nome)){
               contatoEncontrado.add(c);

           }
       }
       return contatoEncontrado;


   }

  public void atualizarNumeroContato(String nome, int novoNumero){
       for (Contato c: listaContatos){
          if(c.getNome().equals(nome)){
           c.setNumero(novoNumero);
              break;

           }
       }



   }
}
