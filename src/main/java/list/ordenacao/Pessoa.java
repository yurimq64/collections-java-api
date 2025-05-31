package main.java.list.ordenacao;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa> {
    private String nome = "";
    private int idade = 0;
    private float altura = 0.0f;

    public Pessoa(String nome, int idade, float altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public float getAltura() {
        return altura;
    }

    @Override
    public int compareTo(Pessoa pessoa) {
        return Integer.compare(this.idade, pessoa.getIdade());
    }

    @Override
    public String toString() {
        return "{Nome: " + nome + " Idade: " + idade + " Altura: " + altura + "}";
    }
}

class ComparatorPorAltura implements Comparator<Pessoa> {

    @Override
    public int compare(Pessoa pessoa1, Pessoa pessoa2) {
        return Double.compare(pessoa1.getAltura(), pessoa2.getAltura());
    }
}
