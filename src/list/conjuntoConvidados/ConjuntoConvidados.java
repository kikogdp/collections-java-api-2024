package list.conjuntoConvidados;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConjuntoConvidados {

    Set<Convidado> listaConvidados;

 public ConjuntoConvidados(){
     listaConvidados = new HashSet<>();

    }

   public void adicionarConvidado(String nome,int codigo){
     listaConvidados.add(new Convidado(nome, codigo));

   }
   public void removerConvidadoPorCodigoConvite(int codigo){
       Convidado listaConvidadosRemovidos = null;
     for(Convidado c: listaConvidados){
         if(c.getCodigo() == codigo){
             listaConvidadosRemovidos = c;
             break;
         }
     }

     listaConvidados.remove(listaConvidadosRemovidos);


   }

   public void contarConvidados(){
       System.out.println(listaConvidados.size());

   }

   public void exibirConvidados(){
       System.out.println(listaConvidados);


    }



}
