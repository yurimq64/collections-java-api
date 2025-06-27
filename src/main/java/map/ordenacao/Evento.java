package main.java.map.ordenacao;

public class Evento {
    private String nome;
    private String descricaoAtracao;

    public Evento(String nome, String descricaoAtracao) {
        this.nome = nome;
        this.descricaoAtracao = descricaoAtracao;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricaoAtracao() {
        return descricaoAtracao;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "nome='" + nome + '\'' +
                ", descricaoAtracao='" + descricaoAtracao + '\'' +
                '}';
    }
}
