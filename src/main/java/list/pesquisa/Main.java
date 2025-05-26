package main.java.list.pesquisa;

public class Main {
    public static void main(String[] args) {
        SomaNumeros minhaSoma = new SomaNumeros();

        minhaSoma.adicionarNumero(0);
        minhaSoma.adicionarNumero(6);
        minhaSoma.adicionarNumero(4);

        minhaSoma.exibirNumeros();

        minhaSoma.calcularSoma();

        minhaSoma.encontrarMaiorNumero();

        minhaSoma.encontrarMenorNumero();
    }
}
