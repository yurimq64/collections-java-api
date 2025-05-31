package main.java.set.operacoesbasicas;

public class Main {
    public static void main(String[] args) {
        ConjuntoConvidados meuConjunto = new ConjuntoConvidados();

        meuConjunto.adicionarConvidados("Yuri", 1234);
        meuConjunto.adicionarConvidados("Yuri", 1235);
        meuConjunto.adicionarConvidados("Stefane", 1236);
        meuConjunto.adicionarConvidados("Gustavo", 1237);

        System.out.println("Lista de convidados:");
        meuConjunto.exibirConvidados();
        System.out.println("Número de convidados:");
        meuConjunto.contarConvidados();
        System.out.println("Exibir convidados de nome Yuri:");
        meuConjunto.exibirConvidadosPorNome("Yuri");
        System.out.println("Verificar se o Gustavo está na festa:");
        meuConjunto.verificarConvidadoPorCodigoConvite(1237);

        meuConjunto.removerConvidadoPorCodigoConvite(1237);
        System.out.printf("%nGUSTAVO REMOVIDO%n%n");

        System.out.println("Lista de convidados:");
        meuConjunto.exibirConvidados();
        System.out.println("Número de convidados:");
        meuConjunto.contarConvidados();
    }
}
