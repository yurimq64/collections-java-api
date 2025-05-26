package main.java.list.pesquisa;

public class Main {
    public static void main(String[] args) {
        SomaNumeros minhaSoma = new SomaNumeros();

        minhaSoma.adicionarNumero(0);
        minhaSoma.adicionarNumero(6);
        minhaSoma.adicionarNumero(4);
        minhaSoma.adicionarNumero(-12);

        minhaSoma.exibirNumeros();

        System.out.println(minhaSoma.calcularSoma());

        System.out.println(minhaSoma.encontrarMaiorNumero());

        System.out.println(minhaSoma.encontrarMenorNumero());



    }
}
