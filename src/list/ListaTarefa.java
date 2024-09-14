package list;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private List<Tarefa> tarefaList;




    public ListaTarefa(){
        this.tarefaList = new ArrayList<>();

    }
    public void add(String descricao){
        tarefaList.add(new Tarefa(descricao));





    }
    public void removerTarefa(String descricao){

        //depois testar utilizando somente o remove no lugar do removerALL.
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for( Tarefa t: tarefaList){
            if (t.getDescricao().equals(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);


    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();

    }

    public void obterDescricaoTarefas(){
        for (int i = 0; i < tarefaList.size() ; i++) {
            System.out.println(tarefaList.get(i).getDescricao());

        }

    }

}
