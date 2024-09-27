package Map;

import java.util.Map;

public class Produto {
    private int quantidade;
    private String nome;
    private double preco;

    public Produto(String nome, int quantidade, double preco){
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;

    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "quantidade=" + quantidade +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
}
