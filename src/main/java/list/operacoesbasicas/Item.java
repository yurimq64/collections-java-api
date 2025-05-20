package main.java.list.operacoesbasicas;

public class Item {
    private String nome = "";
    private float preco = 0.0f;
    private int quantidade = 0;

    public Item(String nome, float preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public float getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return nome + ", " + preco + ", " + quantidade;
    }
}
