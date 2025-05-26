package main.java.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(Integer numero) {
        numeros.add(numero);
    }

    public Integer calcularSoma() {
        int soma = 0;
        if (!numeros.isEmpty()) {
            for (Integer integer : numeros) {
                soma += integer;
            } return soma;
        } return null;
    }

    public Integer encontrarMaiorNumero() {
        int maiorNumero = 0;
        if (!numeros.isEmpty()) {
            for (Integer integer : numeros) {
                if (integer > maiorNumero) {
                    maiorNumero = integer;
                }
            } return maiorNumero;
        } return null;
    }

    public Integer encontrarMenorNumero() {
        int menorNumero = 0;
        if (!numeros.isEmpty()) {
            for (Integer integer : numeros) {
                if (integer < menorNumero) {
                    menorNumero = integer;
                }
            } return menorNumero;
        } return null;
    }

    public void exibirNumeros() {
        if (!numeros.isEmpty()) {
            System.out.println(numeros);
        }
        System.out.println("A lista está vazia");
    }
}
