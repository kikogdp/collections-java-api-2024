package list.ordecacaodepessoas;

import java.util.*;

public class OrdenacaoPessoas {

    List<Pessoa> listaDePessoas;

    public OrdenacaoPessoas(){
        listaDePessoas = new ArrayList<>();
    }

    public void adicionarPessoa(Pessoa pessoa){
        listaDePessoas.add(new Pessoa(pessoa.getNome(),pessoa.getIdade(),
                pessoa.getAltura()));

    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(listaDePessoas);
        Collections.sort(pessoasPorIdade);
        return  pessoasPorIdade;


    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(listaDePessoas);
        Collections.sort(pessoasPorAltura,new ComparatorPorAltura());
        return pessoasPorAltura;
    }




}


