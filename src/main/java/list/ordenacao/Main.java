package main.java.list.ordenacao;

public class Main {
    public static void main(String[] args) {
        OrdenacaoPessoa minhaOrdenacao = new OrdenacaoPessoa();

        minhaOrdenacao.adicionarPessoas("Yuri", 19, 1.73f);
        minhaOrdenacao.adicionarPessoas("Stefane", 19, 1.60f);
        minhaOrdenacao.adicionarPessoas("Gustavo", 17, 1.85f);
        minhaOrdenacao.adicionarPessoas("Mariana", 16, 1.56f);

        System.out.println(minhaOrdenacao.ordenarPorIdade());
        System.out.println();
        System.out.println(minhaOrdenacao.ordenarPorAltura());
    }
}
