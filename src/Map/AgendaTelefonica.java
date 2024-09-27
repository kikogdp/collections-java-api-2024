package Map;

import java.util.HashMap;
import java.util.Map;

public class AgendaTelefonica {
    Map<String, Integer> agendaTelefonica;

    public AgendaTelefonica(){
        agendaTelefonica = new HashMap<>();
    }

    public void adicionarContato(String nome, int numero){
        agendaTelefonica.put(nome, numero);

    }

    public void removerPorNome(String nome){
          if(!agendaTelefonica.isEmpty()){
            agendaTelefonica.remove(nome);
        }
       }

    public void exibirContato(){
        System.out.println(agendaTelefonica);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numero = null;
        if(!agendaTelefonica.isEmpty()){
            agendaTelefonica.get(nome).equals(nome);

            numero = agendaTelefonica.get(nome);
        }
        return  numero;
    }
}
