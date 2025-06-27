package main.java.list.ordenacao;

public class Main {
    public static void main(String[] args) {
        OrdenacaoPessoa minhaOrdenacao = new OrdenacaoPessoa();

        minhaOrdenacao.adicionarPessoa("Yuri", 19, 1.73f);
        minhaOrdenacao.adicionarPessoa("Stefane", 19, 1.60f);
        minhaOrdenacao.adicionarPessoa("Gustavo", 17, 1.85f);
        minhaOrdenacao.adicionarPessoa("Mariana", 16, 1.56f);

        System.out.println(minhaOrdenacao.ordenarPorIdade());
        System.out.println();
        System.out.println(minhaOrdenacao.ordenarPorAltura());
    }
}
