package list.ordecacaodepessoas;

public class TestandoOrdenacaoPessoa {

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
        ordenacaoPessoas.adicionarPessoa(new Pessoa("Kiko",34,1.71));
        ordenacaoPessoas.adicionarPessoa(new Pessoa("Felipe",36,1.95));
        ordenacaoPessoas.adicionarPessoa(new Pessoa("Adriana",35,1.75));
        ordenacaoPessoas.adicionarPessoa(new Pessoa("Daniel",45,1.92));
        ordenacaoPessoas.adicionarPessoa(new Pessoa("Vanessa",40,1.81));
        System.out.println(ordenacaoPessoas.ordenarPorAltura());
        System.out.println(ordenacaoPessoas.ordenarPorIdade());
        System.out.println(ordenacaoPessoas.listaDePessoas);

    }

}
